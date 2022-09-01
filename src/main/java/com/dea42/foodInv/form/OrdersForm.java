package com.dea42.foodInv.form;

import com.dea42.foodInv.entity.Orders;
import com.dea42.foodInv.utils.MessageHelper;
import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Title: Orders Form <br>
 * Description: Class for holding data from the Orders table for editing. <br>
 * Copyright: Copyright (c) 2001-2022<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
 */

@Data
public class OrdersForm implements Serializable {
	private static final long serialVersionUID = 1L;

    @Length(max=494)
	private String comment;
	private Long id = 0l;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Date invdate;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Date orderdate;
    @Length(max=13)
	private String ordernum;

	/**
	 * Clones Orders obj into form
	 *
	 * @param obj
	 */
	public static OrdersForm getInstance(Orders obj) {
		OrdersForm form = new OrdersForm();
		if (obj != null) {
			form.setComment(obj.getComment());
			form.setId(obj.getId());
			form.setInvdate(obj.getInvdate());
			form.setOrderdate(obj.getOrderdate());
			form.setOrdernum(obj.getOrdernum());
		}
		return form;
	}
}
