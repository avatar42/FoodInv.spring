package com.dea42.foodInv.service;


import com.dea42.foodInv.entity.Orders;
import com.dea42.foodInv.paging.Column;
import com.dea42.foodInv.paging.Direction;
import com.dea42.foodInv.paging.Order;
import com.dea42.foodInv.paging.PageInfo;
import com.dea42.foodInv.paging.PagingRequest;
import com.dea42.foodInv.repo.OrdersRepository;
import com.dea42.foodInv.search.OrdersSearchForm;
import com.dea42.foodInv.search.SearchCriteria;
import com.dea42.foodInv.search.SearchOperation;
import com.dea42.foodInv.search.SearchSpecification;
import com.dea42.foodInv.search.SearchType;
import com.dea42.foodInv.utils.Utils;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;


/**
 * Title: OrdersServices <br>
 * Description: OrdersServices. <br>
 * Copyright: Copyright (c) 2001-2022<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
 */
@Slf4j
@Service
public class OrdersServices {
    @Autowired
    private OrdersRepository ordersRepository;

	public Page<Orders> listAll(OrdersSearchForm form) {
		SearchSpecification<Orders> searchSpec = new SearchSpecification<Orders>();
		if (form != null) {
			log.debug(form.toString());
			searchSpec.setDoOr(form.getDoOr());
			if (!StringUtils.isBlank(form.getComment())) {
				searchSpec.add(new SearchCriteria<String>(null,"comment", form.getComment().toLowerCase(),
					SearchOperation.LIKE));
			}

			if (form.getInvdateMin() != null) {
// need to subtract a millsec here to get >= same to work reliably.
				searchSpec.add(new SearchCriteria<Date>(null,"invdate",
					new Date(form.getInvdateMin().getTime() - 1),
					SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getInvdateMax() != null) {
// need to add a millsec here to get <= same to work reliably.
				searchSpec.add(new SearchCriteria<Date>(null,"invdate",
					new Date(form.getInvdateMax().getTime() + 1),
					SearchOperation.LESS_THAN_EQUAL));
			}

			if (form.getOrderdateMin() != null) {
// need to subtract a millsec here to get >= same to work reliably.
				searchSpec.add(new SearchCriteria<Date>(null,"orderdate",
					new Date(form.getOrderdateMin().getTime() - 1),
					SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getOrderdateMax() != null) {
// need to add a millsec here to get <= same to work reliably.
				searchSpec.add(new SearchCriteria<Date>(null,"orderdate",
					new Date(form.getOrderdateMax().getTime() + 1),
					SearchOperation.LESS_THAN_EQUAL));
			}
			if (!StringUtils.isBlank(form.getOrdernum())) {
				searchSpec.add(new SearchCriteria<String>(null,"ordernum", form.getOrdernum().toLowerCase(),
					SearchOperation.LIKE));
			}

		} else {
			form = new OrdersSearchForm();
		}

		// OR queries assume at least one SearchCriteria or return nothing
		if (searchSpec.getList().isEmpty()) {
			searchSpec.setDoOr(SearchType.ADD);
		}
		Pageable pageable = PageRequest.of(form.getPage() - 1, form.getPageSize(), form.getSort());

		if (log.isInfoEnabled())
			log.info("searchSpec:" + searchSpec);
		return ordersRepository.findAll(searchSpec, pageable);
	}

	public Orders save(Orders orders) {
		return ordersRepository.save(orders);
	}
	
	public Orders get(Long id) {
		return ordersRepository.findById(id).get();
	}
	
	public void delete(Long id) {
		ordersRepository.deleteById(id);
	}

	public PageInfo<Orders> getOrderss(HttpServletRequest request, PagingRequest pagingRequest) {

		OrdersSearchForm form =  (OrdersSearchForm) request.getSession().getAttribute("ordersSearchForm");

		if (form == null ) {
			form = new OrdersSearchForm();
		} else if (StringUtils.isNotBlank(pagingRequest.getSearch().getValue())) {

			String value = pagingRequest.getSearch().getValue();
			log.info("Searching for:" + value);
			form.setOrdernum(value);
			form.setDoOr(SearchType.OR);
			form.setAdvanced(false);
		} else if (!form.isAdvanced() && StringUtils.isBlank(pagingRequest.getSearch().getValue())) {
			form = new OrdersSearchForm();

		}
		form.setPage((pagingRequest.getStart() / pagingRequest.getLength()) + 1);
		form.setPageSize(pagingRequest.getLength());
		Order order = pagingRequest.getOrder().get(0);
		int columnIndex = order.getColumn();
		Column column = pagingRequest.getColumns().get(columnIndex);
		form.setSortField(column.getData());
		form.setSortAsc(order.getDir().equals(Direction.asc));

		Page<Orders> filtered = listAll(form);
		int count = (int) filtered.getTotalElements();

		PageInfo<Orders> pageInfo = new PageInfo<Orders>(filtered);
		pageInfo.setRecordsFiltered(count);
		pageInfo.setRecordsTotal(count);
		pageInfo.setDraw(pagingRequest.getDraw());

		request.getSession().setAttribute("ordersSearchForm", form);


		return pageInfo;
	}


}
