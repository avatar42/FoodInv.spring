package com.dea42.foodInv.search;


import com.dea42.foodInv.UnitBase;
import com.dea42.foodInv.entity.Orders;
import com.dea42.foodInv.search.OrdersSearchForm;
import com.dea42.foodInv.service.OrdersServices;
import java.util.Date;
import javax.validation.constraints.NotBlank;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.constraints.Length;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * Title: OrdersSearch Test <br>
 * Description: Does regression tests of Orders search from service to DB <br>
 * Copyright: Copyright (c) 2001-2022<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrdersSearchTest extends UnitBase {

	@Autowired
	private OrdersServices ordersServices;

	private Page<Orders> confirmGotResult(OrdersSearchForm form, Long expectedID) {
		log.info("form:"+form);
		Page<Orders> list = ordersServices.listAll(form);
		assertNotNull("Checking return not null", list);
		assertTrue("Checking at least 1 return", list.toList().size() > 0);
		if (expectedID > 0) {
			boolean found = false;
			for (Orders s2 : list) {
				if (s2.getId().equals(expectedID))
					found = true;
				log.info(s2.toString());
			}

			assertTrue("Looking for record ID " + expectedID + " in results", found);
		}
		return list;
	}

	private Orders getMidRecord(OrdersSearchForm form, Long expectedID) {
		Page<Orders> list = confirmGotResult(form, expectedID);
		assertNotNull("Checking return not null", list);
		int size = list.toList().size();
		assertTrue("Checking at least 1 return", size > 0);
		int record = 0;
		if (size > 2)
			record = size / 2;
		return list.toList().get(record);


	}

	@Test
	public void testComment() {
		// comment String 12
		Orders rec = null;
		OrdersSearchForm form = new OrdersSearchForm();
		rec = getMidRecord(form, 0l);
		form.setComment("%");
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with comment of " + rec.getComment());

		form = new OrdersSearchForm();
		String text = rec.getComment();
		if (text.length() < 2) {
			form.setComment(text + "%");
			confirmGotResult(form, rec.getId());

			form.setComment("%" + text);
			confirmGotResult(form, rec.getId());
			form.setComment("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setComment(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setComment("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setComment("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testInvdate() {
		// invdate Date 93
		Orders rec = null;
		OrdersSearchForm form = new OrdersSearchForm();
		rec = getMidRecord(form, 0l);
		form.setInvdateMin(new Date(0));
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with invdate of " + rec.getInvdate());

		form = new OrdersSearchForm();
		form.setInvdateMin(rec.getInvdate());
		form.setInvdateMax(new Date(rec.getInvdate().getTime() + DAY));
		confirmGotResult(form, rec.getId());

		form = new OrdersSearchForm();
		form.setInvdateMin(new Date(rec.getInvdate().getTime() - DAY));
		form.setInvdateMax(rec.getInvdate());
		confirmGotResult(form, rec.getId());

		form = new OrdersSearchForm();
		form.setInvdateMin(rec.getInvdate());
		confirmGotResult(form, rec.getId());

		form = new OrdersSearchForm();
		form.setInvdateMax(rec.getInvdate());
		confirmGotResult(form, rec.getId());

		form = new OrdersSearchForm();
		form.setInvdateMin(rec.getInvdate());
		form.setInvdateMax(rec.getInvdate());
		confirmGotResult(form, rec.getId());

	}

	@Test
	public void testOrderdate() {
		// orderdate Date 93
		Orders rec = null;
		OrdersSearchForm form = new OrdersSearchForm();
		rec = getMidRecord(form, 0l);
		form.setOrderdateMin(new Date(0));
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with orderdate of " + rec.getOrderdate());

		form = new OrdersSearchForm();
		form.setOrderdateMin(rec.getOrderdate());
		form.setOrderdateMax(new Date(rec.getOrderdate().getTime() + DAY));
		confirmGotResult(form, rec.getId());

		form = new OrdersSearchForm();
		form.setOrderdateMin(new Date(rec.getOrderdate().getTime() - DAY));
		form.setOrderdateMax(rec.getOrderdate());
		confirmGotResult(form, rec.getId());

		form = new OrdersSearchForm();
		form.setOrderdateMin(rec.getOrderdate());
		confirmGotResult(form, rec.getId());

		form = new OrdersSearchForm();
		form.setOrderdateMax(rec.getOrderdate());
		confirmGotResult(form, rec.getId());

		form = new OrdersSearchForm();
		form.setOrderdateMin(rec.getOrderdate());
		form.setOrderdateMax(rec.getOrderdate());
		confirmGotResult(form, rec.getId());

	}

	@Test
	public void testOrdernum() {
		// ordernum String 12
		Orders rec = null;
		OrdersSearchForm form = new OrdersSearchForm();
		rec = getMidRecord(form, 0l);
		form.setOrdernum("%");
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with ordernum of " + rec.getOrdernum());

		form = new OrdersSearchForm();
		String text = rec.getOrdernum();
		if (text.length() < 2) {
			form.setOrdernum(text + "%");
			confirmGotResult(form, rec.getId());

			form.setOrdernum("%" + text);
			confirmGotResult(form, rec.getId());
			form.setOrdernum("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setOrdernum(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setOrdernum("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setOrdernum("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}
}
