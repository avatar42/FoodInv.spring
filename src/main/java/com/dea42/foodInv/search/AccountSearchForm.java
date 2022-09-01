package com.dea42.foodInv.search;

import com.dea42.foodInv.controller.FieldMatch;
import com.dea42.foodInv.controller.UniqueEmail;
import com.dea42.foodInv.controller.ValidatePassword;
import com.dea42.foodInv.entity.Account;
import com.dea42.foodInv.utils.MessageHelper;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.domain.Sort;
import org.springframework.format.annotation.DateTimeFormat;


/**
 * Title: AccountSearchForm <br>
 * Description: Class for holding data from the Account table for searching. <br>
 * Copyright: Copyright (c) 2001-2022<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
 */
@Data
public class AccountSearchForm implements Serializable {
	private static final long serialVersionUID = 1L;

	private String email = "";
/* info=ColInfo(fNum=2, colName=id, msgKey=Account.id, vName=id, type=Long, jtype=null, stype=-5, gsName=Id, length=0, pk=true, defaultVal=null, constraint=null, required=true, list=false, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment= * Table name: Account<br>
 * Column name: id<br>
 * Catalog name: FoodInv<br>
 * Primary key sequence: 1<br>
 * Primary key name: PRIMARY<br>
 *  <br>) */
	private Long idMin;
	private Long idMax;
	private String name = "";
	private String password = "";
	private String userrole = "";
	private String sortField = "id";
	private int page = 1;
	private int pageSize = 10;
	private boolean sortAsc = true;
	private int totalPages = 0;
	private long totalItems = 0;
	private SearchType doOr = SearchType.ADD;
	private boolean advanced = true;
	/**
	 * Clones Account obj into form
	 *
	 * @param obj
	 */
	public static AccountSearchForm getInstance(Account obj) {
		AccountSearchForm form = new AccountSearchForm();
		form.setEmail(obj.getEmail());
		form.setIdMin(obj.getId());
		form.setIdMax(obj.getId());
		form.setName(obj.getName());
		form.setPassword(obj.getPassword());
		form.setUserrole(obj.getUserrole());
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
