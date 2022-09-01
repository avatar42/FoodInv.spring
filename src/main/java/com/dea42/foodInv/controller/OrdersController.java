package com.dea42.foodInv.controller;

import java.util.Date;
import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.dea42.foodInv.entity.Orders;
import com.dea42.foodInv.form.OrdersForm;
import com.dea42.foodInv.paging.PageInfo;
import com.dea42.foodInv.paging.PagingRequest;
import com.dea42.foodInv.search.OrdersSearchForm;
import com.dea42.foodInv.service.OrdersServices;
import com.dea42.foodInv.utils.Message;
import com.dea42.foodInv.utils.MessageHelper;
import com.dea42.foodInv.utils.Utils;
import lombok.extern.slf4j.Slf4j;

/**
 * Title: OrdersController <br>
 * Description: OrdersController. <br>
 * Copyright: Copyright (c) 2001-2022<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
 */
@Slf4j
@Controller
@RequestMapping("/orderss")
public class OrdersController {

	@Autowired
	private OrdersServices ordersService;

	private OrdersSearchForm getForm(HttpServletRequest request) {
		OrdersSearchForm form = (OrdersSearchForm) request.getSession().getAttribute("ordersSearchForm");
		if (log.isDebugEnabled())
			log.debug("pulled from session:" + form);
		if (form == null) {
			form = new OrdersSearchForm();
		}
		return form;
	}

	private void setForm(HttpServletRequest request, OrdersSearchForm form) {
		request.getSession().setAttribute("ordersSearchForm", form);
		if (log.isDebugEnabled())
			log.debug("stored:" + form);
	}


	@GetMapping
	public ModelAndView getAll(HttpServletRequest request) {
		return findPaginated(request, 1, "id", "asc");
	}

	@GetMapping("/new")
	public ModelAndView showNewPage() {
		return showEditPage(0l);
	}

	@PostMapping(value = "/search")
	public ModelAndView search(HttpServletRequest request, @ModelAttribute OrdersSearchForm form, 
			RedirectAttributes ra, @RequestParam(value = "action", required = true) String action) {
		ModelAndView mav;
		if (action.equals("search")) {
			setForm(request, form);
			form.setAdvanced(true);
			mav = new ModelAndView("orderss");
//			mav = findPaginated(request, 1, "id", "asc");
//			@SuppressWarnings("unchecked")
//			List<Orders> list = (List<Orders>) mav.getModelMap().getAttribute("orderss");
//			if (list == null || list.isEmpty()) {
//				mav.setViewName("search_orders");
//				mav.getModelMap().addAttribute(Message.MESSAGE_ATTRIBUTE,
//						new Message("search.noResult", Message.Type.WARNING));
//			}
		} else {
			form = new OrdersSearchForm();
			setForm(request, form);
			mav = new ModelAndView("search_orders");
			mav.addObject("ordersSearchForm", form);
			mav.getModelMap().addAttribute(Message.MESSAGE_ATTRIBUTE,
					new Message("search.formReset", Message.Type.WARNING));
		}

		return mav;
	}

	@GetMapping("/search/{pageNo}")
	public ModelAndView findPaginated(HttpServletRequest request, @PathVariable(value = "pageNo") int pageNo,
			@RequestParam("sortField") String sortField, @RequestParam("sortDir") String sortDir) {
		OrdersSearchForm form = getForm(request);
		if (pageNo < 1)
			pageNo = 1;

		form.setPage(pageNo);
		form.setSortField(sortField);
		form.setSortAsc("asc".equalsIgnoreCase(sortDir));

		if (log.isDebugEnabled())
			log.debug("Searching with:" + form);

		Page<Orders> page = ordersService.listAll(form);

		form.setTotalPages(page.getTotalPages());
		form.setTotalItems(page.getTotalElements());
		setForm(request, form);

		ModelAndView mav = new ModelAndView("orderss");
		mav.addObject("orderss", page.getContent());
		return mav;
	}

	@GetMapping("/search")
	public String showSearchPage(HttpServletRequest request, Model model,
			@RequestHeader(value = "X-Requested-With", required = false) String requestedWith) {
		model.addAttribute(getForm(request));
		if (Utils.isAjaxRequest(requestedWith)) {
			return "search_orders".concat(" :: ordersSearchForm");
		}

		return "search_orders";
	}

	@PostMapping(value = "/save")
	public String save(@Valid @ModelAttribute OrdersForm form, Errors errors, RedirectAttributes ra,
			@RequestParam(value = "action", required = true) String action) {
		if (action.equals("save")) {
			if (errors.hasErrors()) {
				return "edit_orders";
			}

			Orders orders = new Orders();
			orders.setComment(form.getComment());
			orders.setId(form.getId());
			orders.setInvdate(form.getInvdate());
			orders.setOrderdate(form.getOrderdate());
			orders.setOrdernum(form.getOrdernum());
			try {
				orders = ordersService.save(orders);
			} catch (Exception e) {
				log.error("Failed saving:" + form, e);
			}

			if (orders == null) {
				MessageHelper.addErrorAttribute(ra, "db.failed");
			} else {
				MessageHelper.addSuccessAttribute(ra, "save.success");
			}
		} else {
			MessageHelper.addSuccessAttribute(ra, "save.cancelled");
		}

		return "redirect:/orderss";
	}

	@GetMapping("/edit/{id}")
	public ModelAndView showEditPage(@PathVariable(name = "id") Long id) {
		ModelAndView mav = new ModelAndView("edit_orders");
		Orders orders = null;
		if (id > 0)
			orders = ordersService.get(id);
		mav.addObject("ordersForm", OrdersForm.getInstance(orders));

		return mav;
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable(name = "id") Long id) {
		ordersService.delete(id);
		return "redirect:/orderss";
	}

	@GetMapping("/list")
	String home(Principal principal) {
		return "orderss";
	}
}
