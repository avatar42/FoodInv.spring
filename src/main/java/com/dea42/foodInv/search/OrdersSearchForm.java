package com.dea42.foodInv.search;

import com.dea42.foodInv.entity.Orders;
import com.dea42.foodInv.utils.MessageHelper;
import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.domain.Sort;
import org.springframework.format.annotation.DateTimeFormat;


/**
 * Title: OrdersSearchForm <br>
 * Description: Class for holding data from the Orders table for searching. <br>
 * Copyright: Copyright (c) 2001-2022<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
 */
@Data
public class OrdersSearchForm implements Serializable {
	private static final long serialVersionUID = 1L;

	private String comment = "";
/* info=ColInfo(fNum=2, colName=id, msgKey=Orders.id, vName=id, type=Long, jtype=null, stype=-5, gsName=Id, length=0, pk=true, defaultVal=null, constraint=null, required=true, list=false, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment= * Table name: Orders<br>
 * Column name: id<br>
 * Catalog name: FoodInv<br>
 * Primary key sequence: 1<br>
 * Primary key name: PRIMARY<br>
 *  <br>) */
	private Long idMin;
	private Long idMax;
	@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Date invdateMin;
	@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Date invdateMax;
	@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Date orderdateMin;
	@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Date orderdateMax;
	private String ordernum = "";
	private String sortField = "id";
	private int page = 1;
	private int pageSize = 10;
	private boolean sortAsc = true;
	private int totalPages = 0;
	private long totalItems = 0;
	private SearchType doOr = SearchType.ADD;
	private boolean advanced = true;
	/**
	 * Clones Orders obj into form
	 *
	 * @param obj
	 */
	public static OrdersSearchForm getInstance(Orders obj) {
		OrdersSearchForm form = new OrdersSearchForm();
		form.setComment(obj.getComment());
		form.setIdMin(obj.getId());
		form.setIdMax(obj.getId());
		form.setInvdateMin(obj.getInvdate());
		form.setInvdateMax(obj.getInvdate());
		form.setOrderdateMin(obj.getOrderdate());
		form.setOrderdateMax(obj.getOrderdate());
		form.setOrdernum(obj.getOrdernum());
		return form;
	}

	/**
	 * Generate a Sort from fields
	 * @return
	 */
	public Sort getSort() {
		if (sortAsc)
			return Sort.by(sortField).ascending();

		return Sort.by(sortField).descending();
	}

	public String getSortDir() {
		if (sortAsc)
			return "asc";
		else
			return "desc";
	}

	public String getReverseSortDir() {
		if (sortAsc)
			return "desc";
		else
			return "asc";
	}

	boolean getSortAscFlip() {
		return !sortAsc;
	}
}
