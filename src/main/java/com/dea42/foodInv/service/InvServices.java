package com.dea42.foodInv.service;


import com.dea42.foodInv.entity.Inv;
import com.dea42.foodInv.paging.Column;
import com.dea42.foodInv.paging.Direction;
import com.dea42.foodInv.paging.Order;
import com.dea42.foodInv.paging.PageInfo;
import com.dea42.foodInv.paging.PagingRequest;
import com.dea42.foodInv.repo.InvRepository;
import com.dea42.foodInv.search.InvSearchForm;
import com.dea42.foodInv.search.SearchCriteria;
import com.dea42.foodInv.search.SearchOperation;
import com.dea42.foodInv.search.SearchSpecification;
import com.dea42.foodInv.search.SearchType;
import com.dea42.foodInv.utils.Utils;
import java.math.BigDecimal;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


/**
 * Title: InvServices <br>
 * Description: InvServices. <br>
 * Copyright: Copyright (c) 2001-2022<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
 */
@Slf4j
@Service
public class InvServices {
    @Autowired
    private InvRepository invRepository;

	public Page<Inv> listAll(InvSearchForm form) {
		SearchSpecification<Inv> searchSpec = new SearchSpecification<Inv>();
		if (form != null) {
			log.debug(form.toString());
			searchSpec.setDoOr(form.getDoOr());
			if (form.getAvgeatenMin() != null) {
				BigDecimal bd = form.getAvgeatenMin();
				searchSpec.add(new SearchCriteria<BigDecimal>(null,"avgeaten",bd,
					SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getAvgeatenMax() != null) {
				BigDecimal bd = form.getAvgeatenMax();
				searchSpec.add(new SearchCriteria<BigDecimal>(null,"avgeaten",bd,
					SearchOperation.LESS_THAN_EQUAL));
			}
			if (form.getAvgorderMin() != null) {
				BigDecimal bd = form.getAvgorderMin();
				searchSpec.add(new SearchCriteria<BigDecimal>(null,"avgorder",bd,
					SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getAvgorderMax() != null) {
				BigDecimal bd = form.getAvgorderMax();
				searchSpec.add(new SearchCriteria<BigDecimal>(null,"avgorder",bd,
					SearchOperation.LESS_THAN_EQUAL));
			}
			if (!StringUtils.isBlank(form.getComment())) {
				searchSpec.add(new SearchCriteria<String>(null,"comment", form.getComment().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (form.getGetalacartMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"getalacart", form.getGetalacartMin(),
					SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getGetalacartMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"getalacart", form.getGetalacartMax(),
					SearchOperation.LESS_THAN_EQUAL));
			}
			if (form.getHaveMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"have", form.getHaveMin(),
					SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getHaveMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"have", form.getHaveMax(),
					SearchOperation.LESS_THAN_EQUAL));
			}
			if (!StringUtils.isBlank(form.getItem())) {
				searchSpec.add(new SearchCriteria<String>(null,"item", form.getItem().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (form.getLowinvadjMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"lowinvadj", form.getLowinvadjMin(),
					SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getLowinvadjMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"lowinvadj", form.getLowinvadjMax(),
					SearchOperation.LESS_THAN_EQUAL));
			}
			if (form.getMaxMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"max", form.getMaxMin(),
					SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getMaxMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"max", form.getMaxMax(),
					SearchOperation.LESS_THAN_EQUAL));
			}
			if (!StringUtils.isBlank(form.getMeal())) {
				searchSpec.add(new SearchCriteria<String>(null,"meal", form.getMeal().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (form.getNeedMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"need", form.getNeedMin(),
					SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getNeedMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"need", form.getNeedMax(),
					SearchOperation.LESS_THAN_EQUAL));
			}
			if (form.getOldMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"old", form.getOldMin(),
					SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getOldMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"old", form.getOldMax(),
					SearchOperation.LESS_THAN_EQUAL));
			}
			if (form.getRateMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"rate", form.getRateMin(),
					SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getRateMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"rate", form.getRateMax(),
					SearchOperation.LESS_THAN_EQUAL));
			}
			if (form.getSubbedMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"subbed", form.getSubbedMin(),
					SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getSubbedMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"subbed", form.getSubbedMax(),
					SearchOperation.LESS_THAN_EQUAL));
			}
			if (form.getTossedMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"tossed", form.getTossedMin(),
					SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getTossedMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"tossed", form.getTossedMax(),
					SearchOperation.LESS_THAN_EQUAL));
			}
			if (form.getTotalMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"total", form.getTotalMin(),
					SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getTotalMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"total", form.getTotalMax(),
					SearchOperation.LESS_THAN_EQUAL));
			}
			if (!StringUtils.isBlank(form.getUpc())) {
				searchSpec.add(new SearchCriteria<String>(null,"upc", form.getUpc().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (form.getWantMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"want", form.getWantMin(),
					SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getWantMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"want", form.getWantMax(),
					SearchOperation.LESS_THAN_EQUAL));
			}
			if (form.getWantedMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"wanted", form.getWantedMin(),
					SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getWantedMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"wanted", form.getWantedMax(),
					SearchOperation.LESS_THAN_EQUAL));
			}

		} else {
			form = new InvSearchForm();
		}

		// OR queries assume at least one SearchCriteria or return nothing
		if (searchSpec.getList().isEmpty()) {
			searchSpec.setDoOr(SearchType.ADD);
		}
		Pageable pageable = PageRequest.of(form.getPage() - 1, form.getPageSize(), form.getSort());

		if (log.isInfoEnabled())
			log.info("searchSpec:" + searchSpec);
		return invRepository.findAll(searchSpec, pageable);
	}

	public Inv save(Inv inv) {
		return invRepository.save(inv);
	}
	
	public Inv get(Long id) {
		return invRepository.findById(id).get();
	}
	
	public void delete(Long id) {
		invRepository.deleteById(id);
	}

	public PageInfo<Inv> getInvs(HttpServletRequest request, PagingRequest pagingRequest) {

		InvSearchForm form =  (InvSearchForm) request.getSession().getAttribute("invSearchForm");

		if (form == null ) {
			form = new InvSearchForm();
		} else if (StringUtils.isNotBlank(pagingRequest.getSearch().getValue())) {

			String value = pagingRequest.getSearch().getValue();
			log.info("Searching for:" + value);
			form.setItem(value);
			form.setMeal(value);
			form.setUpc(value);
			form.setDoOr(SearchType.OR);
			form.setAdvanced(false);
		} else if (!form.isAdvanced() && StringUtils.isBlank(pagingRequest.getSearch().getValue())) {
			form = new InvSearchForm();

		}
		form.setPage((pagingRequest.getStart() / pagingRequest.getLength()) + 1);
		form.setPageSize(pagingRequest.getLength());
		Order order = pagingRequest.getOrder().get(0);
		int columnIndex = order.getColumn();
		Column column = pagingRequest.getColumns().get(columnIndex);
		form.setSortField(column.getData());
		form.setSortAsc(order.getDir().equals(Direction.asc));

		Page<Inv> filtered = listAll(form);
		int count = (int) filtered.getTotalElements();

		PageInfo<Inv> pageInfo = new PageInfo<Inv>(filtered);
		pageInfo.setRecordsFiltered(count);
		pageInfo.setRecordsTotal(count);
		pageInfo.setDraw(pagingRequest.getDraw());

		request.getSession().setAttribute("invSearchForm", form);


		return pageInfo;
	}


}
