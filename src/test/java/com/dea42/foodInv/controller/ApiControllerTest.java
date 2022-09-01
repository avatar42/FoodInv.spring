package com.dea42.foodInv.controller;

import static org.hamcrest.CoreMatchers.containsString;
import static org.mockito.BDDMockito.given;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.user;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.data.domain.Page;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dea42.foodInv.MockBase;
import com.dea42.foodInv.entity.Inv;
import com.dea42.foodInv.entity.Account;
import com.dea42.foodInv.entity.Orders;

/**
 * Title: ApiControllerTest <br>
 * Description: REST Api Controller Test. <br>
 * Copyright: Copyright (c) 2001-2022<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(ApiController.class)
public class ApiControllerTest extends MockBase {


	/**
	 * Test method for
	 * {@link com.dea42.foodInv.controller.InvController#getAllInvs(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllInvs() throws Exception {
		List<Inv> list = new ArrayList<>();
		Inv o = new Inv();
        o.setComment(getTestString(50));
		o.setId(1l);
        o.setItem(getTestString(46));
        o.setMeal(getTestString(2));
        o.setUpc(getTestString(15));
		list.add(o);
		Page<Inv> p = getPage(list);
		given(invServices.listAll(null)).willReturn(p);

		this.mockMvc.perform(get("/api/invs").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString("avgeaten")))				.andExpect(content().string(containsString("avgorder")))				.andExpect(content().string(containsString(o.getComment())))
				.andExpect(content().string(containsString("comment")))				.andExpect(content().string(containsString("getalacart")))				.andExpect(content().string(containsString("have")))				.andExpect(content().string(containsString("id")))				.andExpect(content().string(containsString(o.getItem())))
				.andExpect(content().string(containsString("item")))				.andExpect(content().string(containsString("lowinvadj")))				.andExpect(content().string(containsString("max")))				.andExpect(content().string(containsString(o.getMeal())))
				.andExpect(content().string(containsString("meal")))				.andExpect(content().string(containsString("need")))				.andExpect(content().string(containsString("old")))				.andExpect(content().string(containsString("rate")))				.andExpect(content().string(containsString("subbed")))				.andExpect(content().string(containsString("tossed")))				.andExpect(content().string(containsString("total")))				.andExpect(content().string(containsString(o.getUpc())))
				.andExpect(content().string(containsString("upc")))				.andExpect(content().string(containsString("want")))				.andExpect(content().string(containsString("wanted")));
	}


	/**
	 * Test method for
	 * {@link com.dea42.foodInv.controller.AccountController#getAllAccounts(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllAccounts() throws Exception {
		List<Account> list = new ArrayList<>();
		Account o = new Account();
        o.setEmail(getTestEmailString(254));
		o.setId(1l);
        o.setName(getTestString(254));
        o.setPassword(getTestPasswordString(30));
        o.setUserrole(getTestString(25));
		list.add(o);
		Page<Account> p = getPage(list);
		given(accountServices.listAll(null)).willReturn(p);

		this.mockMvc.perform(get("/api/accounts").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString(o.getEmail())))
				.andExpect(content().string(containsString("email")))				.andExpect(content().string(containsString("id")))				.andExpect(content().string(containsString(o.getName())))
				.andExpect(content().string(containsString("name")))				.andExpect(content().string(containsString(o.getUserrole())))
				.andExpect(content().string(containsString("userrole")));
	}


	/**
	 * Test method for
	 * {@link com.dea42.foodInv.controller.OrdersController#getAllOrderss(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllOrderss() throws Exception {
		List<Orders> list = new ArrayList<>();
		Orders o = new Orders();
        o.setComment(getTestString(494));
		o.setId(1l);
        o.setOrdernum(getTestString(13));
		list.add(o);
		Page<Orders> p = getPage(list);
		given(ordersServices.listAll(null)).willReturn(p);

		this.mockMvc.perform(get("/api/orderss").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString(o.getComment())))
				.andExpect(content().string(containsString("comment")))				.andExpect(content().string(containsString("id")))				.andExpect(content().string(containsString("invdate")))				.andExpect(content().string(containsString("orderdate")))				.andExpect(content().string(containsString(o.getOrdernum())))
				.andExpect(content().string(containsString("ordernum")));
	}

}
