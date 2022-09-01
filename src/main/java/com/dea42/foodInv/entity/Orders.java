package com.dea42.foodInv.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Title: Orders Bean <br>
 * Description: Class for holding data from the Orders table. <br>
 * Copyright: Copyright (c) 2001-2022<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
 * Table name: Orders<br>
 * Column name: id<br>
 * Catalog name: FoodInv<br>
 * Primary key sequence: 1<br>
 * Primary key name: PRIMARY<br>
 *  <br> */
@Data
@Entity
@Table(name = "`Orders`")
public class Orders implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "Comment", length = 494)
	private String comment;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	@Column(name = "InvDate", nullable = false)
	private Date invdate;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	@Column(name = "OrderDate")
	private Date orderdate;
	@Column(name = "OrderNum", length = 13)
	private String ordernum;
}
