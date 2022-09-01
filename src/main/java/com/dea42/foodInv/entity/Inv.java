package com.dea42.foodInv.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * Title: Inv Bean <br>
 * Description: Class for holding data from the Inv table. <br>
 * Copyright: Copyright (c) 2001-2022<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
 * Table name: Inv<br>
 * Column name: id<br>
 * Catalog name: FoodInv<br>
 * Primary key sequence: 1<br>
 * Primary key name: PRIMARY<br>
 *  <br> */
@Data
@Entity
@Table(name = "`Inv`")
public class Inv implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "AvgEaten")
	private BigDecimal avgeaten;
	@Column(name = "AvgOrder")
	private BigDecimal avgorder;
	@Column(name = "Comment", length = 50)
	private String comment;
	@Column(name = "GetAlacart")
	private Integer getalacart;
	@Column(name = "Have")
	private Integer have;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	@Column(name = "Item", nullable = false, length = 46)
	private String item;
	@Column(name = "LowInvAdj")
	private Integer lowinvadj;
	@Column(name = "Max")
	private Integer max;
	@Column(name = "Meal", nullable = false, length = 2)
	private String meal;
	@Column(name = "Need")
	private Integer need;
	@Column(name = "Old")
	private Integer old;
	@Column(name = "Rate")
	private Integer rate;
	@Column(name = "Subbed")
	private Integer subbed;
	@Column(name = "Tossed")
	private Integer tossed;
	@Column(name = "Total")
	private Integer total;
	@Column(name = "Upc", length = 15)
	private String upc;
	@Column(name = "Want")
	private Integer want;
	@Column(name = "Wanted")
	private Integer wanted;
}
