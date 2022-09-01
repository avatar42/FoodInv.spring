package com.dea42.foodInv.form;

import com.dea42.foodInv.entity.Inv;
import com.dea42.foodInv.utils.MessageHelper;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
 * Title: Inv Form <br>
 * Description: Class for holding data from the Inv table for editing. <br>
 * Copyright: Copyright (c) 2001-2022<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
 */

@Data
public class InvForm implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal avgeaten;
	private BigDecimal avgorder;
    @Length(max=50)
	private String comment;
	private Integer getalacart;
	private Integer have;
	private Long id = 0l;
    @Length(max=46)
    @NotBlank(message = "{"+MessageHelper.notBlank_message+"}")
	private String item;
	private Integer lowinvadj;
	private Integer max;
    @Length(max=2)
    @NotBlank(message = "{"+MessageHelper.notBlank_message+"}")
	private String meal;
	private Integer need;
	private Integer old;
	private Integer rate;
	private Integer subbed;
	private Integer tossed;
	private Integer total;
    @Length(max=15)
	private String upc;
	private Integer want;
	private Integer wanted;

	/**
	 * Clones Inv obj into form
	 *
	 * @param obj
	 */
	public static InvForm getInstance(Inv obj) {
		InvForm form = new InvForm();
		if (obj != null) {
			form.setAvgeaten(obj.getAvgeaten());
			form.setAvgorder(obj.getAvgorder());
			form.setComment(obj.getComment());
			form.setGetalacart(obj.getGetalacart());
			form.setHave(obj.getHave());
			form.setId(obj.getId());
			form.setItem(obj.getItem());
			form.setLowinvadj(obj.getLowinvadj());
			form.setMax(obj.getMax());
			form.setMeal(obj.getMeal());
			form.setNeed(obj.getNeed());
			form.setOld(obj.getOld());
			form.setRate(obj.getRate());
			form.setSubbed(obj.getSubbed());
			form.setTossed(obj.getTossed());
			form.setTotal(obj.getTotal());
			form.setUpc(obj.getUpc());
			form.setWant(obj.getWant());
			form.setWanted(obj.getWanted());
		}
		return form;
	}
}
