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

import com.dea42.foodInv.entity.Inv;
import com.dea42.foodInv.form.InvForm;
import com.dea42.foodInv.paging.PageInfo;
import com.dea42.foodInv.paging.PagingRequest;
import com.dea42.foodInv.search.InvSearchForm;
import com.dea42.foodInv.service.InvServices;
import com.dea42.foodInv.utils.Message;
import com.dea42.foodInv.utils.MessageHelper;
import com.dea42.foodInv.utils.Utils;
import lombok.extern.slf4j.Slf4j;

/**
 * Title: InvController <br>
 * Description: InvController. <br>
 * Copyright: Copyright (c) 2001-2022<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
 */
@Slf4j
@Controller
@RequestMapping("/invs")
public class InvController {

	@Autowired
	private InvServices invService;

	private InvSearchForm getForm(HttpServletRequest request) {
		InvSearchForm form = (InvSearchForm) request.getSession().getAttribute("invSearchForm");
		if (log.isDebugEnabled())
			log.debug("pulled from session:" + form);
		if (form == null) {
			form = new InvSearchForm();
		}
		return form;
	}

	private void setForm(HttpServletRequest request, InvSearchForm form) {
		request.getSession().setAttribute("invSearchForm", form);
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
	public ModelAndView search(HttpServletRequest request, @ModelAttribute InvSearchForm form, 
			RedirectAttributes ra, @RequestParam(value = "action", required = true) String action) {
		ModelAndView mav;
		if (action.equals("search")) {
			setForm(request, form);
			form.setAdvanced(true);
			mav = new ModelAndView("invs");
//			mav = findPaginated(request, 1, "id", "asc");
//			@SuppressWarnings("unchecked")
//			List<Inv> list = (List<Inv>) mav.getModelMap().getAttribute("invs");
//			if (list == null || list.isEmpty()) {
//				mav.setViewName("search_inv");
//				mav.getModelMap().addAttribute(Message.MESSAGE_ATTRIBUTE,
//						new Message("search.noResult", Message.Type.WARNING));
//			}
		} else {
			form = new InvSearchForm();
			setForm(request, form);
			mav = new ModelAndView("search_inv");
			mav.addObject("invSearchForm", form);
			mav.getModelMap().addAttribute(Message.MESSAGE_ATTRIBUTE,
					new Message("search.formReset", Message.Type.WARNING));
		}

		return mav;
	}

	@GetMapping("/search/{pageNo}")
	public ModelAndView findPaginated(HttpServletRequest request, @PathVariable(value = "pageNo") int pageNo,
			@RequestParam("sortField") String sortField, @RequestParam("sortDir") String sortDir) {
		InvSearchForm form = getForm(request);
		if (pageNo < 1)
			pageNo = 1;

		form.setPage(pageNo);
		form.setSortField(sortField);
		form.setSortAsc("asc".equalsIgnoreCase(sortDir));

		if (log.isDebugEnabled())
			log.debug("Searching with:" + form);

		Page<Inv> page = invService.listAll(form);

		form.setTotalPages(page.getTotalPages());
		form.setTotalItems(page.getTotalElements());
		setForm(request, form);

		ModelAndView mav = new ModelAndView("invs");
		mav.addObject("invs", page.getContent());
		return mav;
	}

	@GetMapping("/search")
	public String showSearchPage(HttpServletRequest request, Model model,
			@RequestHeader(value = "X-Requested-With", required = false) String requestedWith) {
		model.addAttribute(getForm(request));
		if (Utils.isAjaxRequest(requestedWith)) {
			return "search_inv".concat(" :: invSearchForm");
		}

		return "search_inv";
	}

	@PostMapping(value = "/save")
	public String save(@Valid @ModelAttribute InvForm form, Errors errors, RedirectAttributes ra,
			@RequestParam(value = "action", required = true) String action) {
		if (action.equals("save")) {
			if (errors.hasErrors()) {
				return "edit_inv";
			}

			Inv inv = new Inv();
			inv.setAvgeaten(form.getAvgeaten());
			inv.setAvgorder(form.getAvgorder());
			inv.setComment(form.getComment());
			inv.setGetalacart(form.getGetalacart());
			inv.setHave(form.getHave());
			inv.setId(form.getId());
			inv.setItem(form.getItem());
			inv.setLowinvadj(form.getLowinvadj());
			inv.setMax(form.getMax());
			inv.setMeal(form.getMeal());
			inv.setNeed(form.getNeed());
			inv.setOld(form.getOld());
			inv.setRate(form.getRate());
			inv.setSubbed(form.getSubbed());
			inv.setTossed(form.getTossed());
			inv.setTotal(form.getTotal());
			inv.setUpc(form.getUpc());
			inv.setWant(form.getWant());
			inv.setWanted(form.getWanted());
			try {
				inv = invService.save(inv);
			} catch (Exception e) {
				log.error("Failed saving:" + form, e);
			}

			if (inv == null) {
				MessageHelper.addErrorAttribute(ra, "db.failed");
			} else {
				MessageHelper.addSuccessAttribute(ra, "save.success");
			}
		} else {
			MessageHelper.addSuccessAttribute(ra, "save.cancelled");
		}

		return "redirect:/invs";
	}

	@GetMapping("/edit/{id}")
	public ModelAndView showEditPage(@PathVariable(name = "id") Long id) {
		ModelAndView mav = new ModelAndView("edit_inv");
		Inv inv = null;
		if (id > 0)
			inv = invService.get(id);
		mav.addObject("invForm", InvForm.getInstance(inv));

		return mav;
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable(name = "id") Long id) {
		invService.delete(id);
		return "redirect:/invs";
	}

	@GetMapping("/list")
	String home(Principal principal) {
		return "invs";
	}
}
