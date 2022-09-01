package com.dea42.foodInv.controller;
import static org.mockito.BDDMockito.given;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.data.domain.Page;
import org.springframework.test.web.servlet.ResultActions;
import com.google.common.collect.ImmutableMap;
import lombok.extern.slf4j.Slf4j;

import com.dea42.foodInv.MockBase;
import com.dea42.foodInv.entity.Orders;
import com.dea42.foodInv.form.OrdersForm;
import com.dea42.foodInv.search.OrdersSearchForm;

/**
 * Title: OrdersControllerTest <br>
 * Description: OrdersController. <br>
 * Copyright: Copyright (c) 2001-2022<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
 */
@Slf4j
@WebMvcTest(OrdersController.class)
public class OrdersControllerTest extends MockBase {
	private Orders getOrders(Long id) {
		Orders o = new Orders();
		o.setId(id);
		/* TODO: confirm ignoring ColInfo(fNum=6, colName=Comment, msgKey=Orders.comment, vName=comment, type=String, jtype=null, stype=12, gsName=Comment, length=494, pk=false, defaultVal=, constraint=null, required=false, list=false, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
        o.setOrdernum(getTestString(13));
		return o;
	}

	/**
	 * Test method for
	 * {@link com.dea42.foodInv.controller.OrdersController#getAllOrderss(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllOrderss() throws Exception {
		List<Orders> list = new ArrayList<>();
		Orders o = getOrders(1l);
		list.add(o);

		Page<Orders> p = getPage(list);
		given(ordersServices.listAll(new OrdersSearchForm())).willReturn(p);

		ResultActions ra = getAsAdmin("/orderss");
		contentContainsMarkup(ra,"<h1>" + getMsg("class.Orders") + " " + getMsg("edit.list") + "</h1>");
		/* TODO: confirm ignoring ColInfo(fNum=6, colName=Comment, msgKey=Orders.comment, vName=comment, type=String, jtype=null, stype=12, gsName=Comment, length=494, pk=false, defaultVal=, constraint=null, required=false, list=false, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
//		contentContainsMarkup(ra,getMsg("Orders.invdate"));
//		contentContainsMarkup(ra,getMsg("Orders.orderdate"));
//		contentContainsMarkup(ra,getTestString(13));
//		contentContainsMarkup(ra,getMsg("Orders.ordernum"));
	}

	/**
	 * Test method for
	 * {@link com.dea42.foodInv.controller.OrdersController#showNewOrdersPage(org.springframework.ui.Model)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testShowNewOrdersPage() throws Exception {
		ResultActions ra = getAsAdmin("/orderss/new");
		contentContainsMarkup(ra,"<legend>" + getMsg("edit.new") + " " + getMsg("class.Orders") + "</legend>");
		contentContainsMarkup(ra,getMsg("Orders.comment"));
		// TODO: confirm ignoring Orders.id
		contentContainsMarkup(ra,getMsg("Orders.invdate"));
		contentContainsMarkup(ra,getMsg("Orders.orderdate"));
		contentContainsMarkup(ra,getMsg("Orders.ordernum"));
	}

	/**
	 * Test method for
	 * {@link com.dea42.foodInv.controller.OrdersController#saveOrders(com.dea42.foodInv.entity.Orders, java.lang.String)}.
	 */
	@Test
	public void testSaveOrdersCancel() throws Exception {
		Orders o = getOrders(1l);

		send(SEND_POST, "/orderss/save", "orders", o, ImmutableMap.of("action", "cancel"), ADMIN_EMAIL,
				"/orderss");
	}

	/**
	 * Test method for
	 * {@link com.dea42.foodInv.controller.OrdersController#saveOrders(com.dea42.foodInv.entity.Orders, java.lang.String)}.
	 */
	@Test
	public void testSaveOrdersSave() throws Exception {
		Orders o = getOrders(0l);
		OrdersForm form = OrdersForm.getInstance(o);
		log.debug(form.toString());

		send(SEND_POST, "/orderss/save", "ordersForm", form, ImmutableMap.of("action", "save"), ADMIN_EMAIL,
				"/orderss");
	}

	/**
	 * Test method for
	 * {@link com.dea42.foodInv.controller.OrdersController#showEditOrdersPage(java.lang.Integer)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testShowEditOrdersPage() throws Exception {
		Orders o = getOrders(1l);

		given(ordersServices.get(1l)).willReturn(o);

		ResultActions ra = getAsAdmin("/orderss/edit/1");
		contentContainsMarkup(ra,o.getComment());
		contentContainsMarkup(ra,"Comment");
		// TODO: confirm ignoring Orders.id
		contentContainsMarkup(ra,"Invdate");
		contentContainsMarkup(ra,"Orderdate");
		contentContainsMarkup(ra,o.getOrdernum());
		contentContainsMarkup(ra,"Ordernum");
	}

	/**
	 * Test method for
	 * {@link com.dea42.foodInv.controller.OrdersController#deleteOrders(java.lang.Integer)}.
	 */
	@Test
	public void testDeleteOrders() throws Exception {
		getAsAdminRedirectExpected("/orderss/delete/1","/orderss");
	}

}

