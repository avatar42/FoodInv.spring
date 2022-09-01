package com.dea42.foodInv.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * Title: Account Bean <br>
 * Description: Class for holding data from the Account table. <br>
 * Copyright: Copyright (c) 2001-2022<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
 * Table name: Account<br>
 * Column name: id<br>
 * Catalog name: FoodInv<br>
 * Primary key sequence: 1<br>
 * Primary key name: PRIMARY<br>
 *  <br> */
@Data
@Entity
@Table(name = "`Account`")
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "Email", unique = true, nullable = false, length = 254)
	private String email;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	@Column(name = "Name", nullable = false, length = 254)
	private String name;
    @JsonIgnore
	@Column(name = "Password", nullable = false, length = 30)
	private String password;
	@Column(name = "Userrole", nullable = false, length = 25)
	private String userrole;
}
