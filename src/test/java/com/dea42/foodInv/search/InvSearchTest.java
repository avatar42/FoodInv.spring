package com.dea42.foodInv.search;


import com.dea42.foodInv.UnitBase;
import com.dea42.foodInv.entity.Inv;
import com.dea42.foodInv.search.InvSearchForm;
import com.dea42.foodInv.service.InvServices;
import java.math.BigDecimal;
import javax.validation.constraints.NotBlank;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.constraints.Length;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * Title: InvSearch Test <br>
 * Description: Does regression tests of Inv search from service to DB <br>
 * Copyright: Copyright (c) 2001-2022<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class InvSearchTest extends UnitBase {

	@Autowired
	private InvServices invServices;

	private Page<Inv> confirmGotResult(InvSearchForm form, Long expectedID) {
		log.info("form:"+form);
		Page<Inv> list = invServices.listAll(form);
		assertNotNull("Checking return not null", list);
		assertTrue("Checking at least 1 return", list.toList().size() > 0);
		if (expectedID > 0) {
			boolean found = false;
			for (Inv s2 : list) {
				if (s2.getId().equals(expectedID))
					found = true;
				log.info(s2.toString());
			}

			assertTrue("Looking for record ID " + expectedID + " in results", found);
		}
		return list;
	}

	private Inv getMidRecord(InvSearchForm form, Long expectedID) {
		Page<Inv> list = confirmGotResult(form, expectedID);
		assertNotNull("Checking return not null", list);
		int size = list.toList().size();
		assertTrue("Checking at least 1 return", size > 0);
		int record = 0;
		if (size > 2)
			record = size / 2;
		return list.toList().get(record);


	}

	@Test
	public void testAvgeaten() {
		// avgeaten BigDecimal 8
		Inv rec = null;
		InvSearchForm form = new InvSearchForm();
		rec = getMidRecord(form, 0l);
		form.setAvgeatenMin(new BigDecimal(Integer.MIN_VALUE));
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with avgeaten of " + rec.getAvgeaten());

		form = new InvSearchForm();
		form.setAvgeatenMin(rec.getAvgeaten());
		form.setAvgeatenMax(rec.getAvgeaten().add(new BigDecimal(100)));
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setAvgeatenMin(rec.getAvgeaten().subtract(new BigDecimal(100)));
		form.setAvgeatenMax(rec.getAvgeaten());
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setAvgeatenMin(rec.getAvgeaten());
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setAvgeatenMax(rec.getAvgeaten());
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setAvgeatenMin(rec.getAvgeaten());
		form.setAvgeatenMax(rec.getAvgeaten());
		confirmGotResult(form, rec.getId());
	}

	@Test
	public void testAvgorder() {
		// avgorder BigDecimal 8
		Inv rec = null;
		InvSearchForm form = new InvSearchForm();
		rec = getMidRecord(form, 0l);
		form.setAvgorderMin(new BigDecimal(Integer.MIN_VALUE));
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with avgorder of " + rec.getAvgorder());

		form = new InvSearchForm();
		form.setAvgorderMin(rec.getAvgorder());
		form.setAvgorderMax(rec.getAvgorder().add(new BigDecimal(100)));
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setAvgorderMin(rec.getAvgorder().subtract(new BigDecimal(100)));
		form.setAvgorderMax(rec.getAvgorder());
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setAvgorderMin(rec.getAvgorder());
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setAvgorderMax(rec.getAvgorder());
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setAvgorderMin(rec.getAvgorder());
		form.setAvgorderMax(rec.getAvgorder());
		confirmGotResult(form, rec.getId());
	}

	@Test
	public void testComment() {
		// comment String 12
		Inv rec = null;
		InvSearchForm form = new InvSearchForm();
		rec = getMidRecord(form, 0l);
		form.setComment("%");
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with comment of " + rec.getComment());

		form = new InvSearchForm();
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
	public void testGetalacart() {
		// getalacart Integer 4
		Inv rec = null;
		InvSearchForm form = new InvSearchForm();
		rec = getMidRecord(form, 0l);
		form.setGetalacartMin(Integer.MIN_VALUE);
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with getalacart of " + rec.getGetalacart());

		form = new InvSearchForm();
		form.setGetalacartMin(rec.getGetalacart());
		form.setGetalacartMax(rec.getGetalacart() + 1);
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setGetalacartMin(rec.getGetalacart() - 1);
		form.setGetalacartMax(rec.getGetalacart());
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setGetalacartMin(rec.getGetalacart());
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setGetalacartMax(rec.getGetalacart());
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setGetalacartMin(rec.getGetalacart());
		form.setGetalacartMax(rec.getGetalacart());
		confirmGotResult(form, rec.getId());
	}

	@Test
	public void testHave() {
		// have Integer 4
		Inv rec = null;
		InvSearchForm form = new InvSearchForm();
		rec = getMidRecord(form, 0l);
		form.setHaveMin(Integer.MIN_VALUE);
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with have of " + rec.getHave());

		form = new InvSearchForm();
		form.setHaveMin(rec.getHave());
		form.setHaveMax(rec.getHave() + 1);
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setHaveMin(rec.getHave() - 1);
		form.setHaveMax(rec.getHave());
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setHaveMin(rec.getHave());
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setHaveMax(rec.getHave());
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setHaveMin(rec.getHave());
		form.setHaveMax(rec.getHave());
		confirmGotResult(form, rec.getId());
	}

	@Test
	public void testItem() {
		// item String 12
		Inv rec = null;
		InvSearchForm form = new InvSearchForm();
		rec = getMidRecord(form, 0l);
		form.setItem("%");
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with item of " + rec.getItem());

		form = new InvSearchForm();
		String text = rec.getItem();
		if (text.length() < 2) {
			form.setItem(text + "%");
			confirmGotResult(form, rec.getId());

			form.setItem("%" + text);
			confirmGotResult(form, rec.getId());
			form.setItem("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setItem(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setItem("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setItem("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testLowinvadj() {
		// lowinvadj Integer 4
		Inv rec = null;
		InvSearchForm form = new InvSearchForm();
		rec = getMidRecord(form, 0l);
		form.setLowinvadjMin(Integer.MIN_VALUE);
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with lowinvadj of " + rec.getLowinvadj());

		form = new InvSearchForm();
		form.setLowinvadjMin(rec.getLowinvadj());
		form.setLowinvadjMax(rec.getLowinvadj() + 1);
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setLowinvadjMin(rec.getLowinvadj() - 1);
		form.setLowinvadjMax(rec.getLowinvadj());
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setLowinvadjMin(rec.getLowinvadj());
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setLowinvadjMax(rec.getLowinvadj());
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setLowinvadjMin(rec.getLowinvadj());
		form.setLowinvadjMax(rec.getLowinvadj());
		confirmGotResult(form, rec.getId());
	}

	@Test
	public void testMax() {
		// max Integer 4
		Inv rec = null;
		InvSearchForm form = new InvSearchForm();
		rec = getMidRecord(form, 0l);
		form.setMaxMin(Integer.MIN_VALUE);
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with max of " + rec.getMax());

		form = new InvSearchForm();
		form.setMaxMin(rec.getMax());
		form.setMaxMax(rec.getMax() + 1);
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setMaxMin(rec.getMax() - 1);
		form.setMaxMax(rec.getMax());
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setMaxMin(rec.getMax());
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setMaxMax(rec.getMax());
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setMaxMin(rec.getMax());
		form.setMaxMax(rec.getMax());
		confirmGotResult(form, rec.getId());
	}

	@Test
	public void testMeal() {
		// meal String 12
		Inv rec = null;
		InvSearchForm form = new InvSearchForm();
		rec = getMidRecord(form, 0l);
		form.setMeal("%");
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with meal of " + rec.getMeal());

		form = new InvSearchForm();
		String text = rec.getMeal();
		if (text.length() < 2) {
			form.setMeal(text + "%");
			confirmGotResult(form, rec.getId());

			form.setMeal("%" + text);
			confirmGotResult(form, rec.getId());
			form.setMeal("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setMeal(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setMeal("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setMeal("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testNeed() {
		// need Integer 4
		Inv rec = null;
		InvSearchForm form = new InvSearchForm();
		rec = getMidRecord(form, 0l);
		form.setNeedMin(Integer.MIN_VALUE);
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with need of " + rec.getNeed());

		form = new InvSearchForm();
		form.setNeedMin(rec.getNeed());
		form.setNeedMax(rec.getNeed() + 1);
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setNeedMin(rec.getNeed() - 1);
		form.setNeedMax(rec.getNeed());
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setNeedMin(rec.getNeed());
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setNeedMax(rec.getNeed());
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setNeedMin(rec.getNeed());
		form.setNeedMax(rec.getNeed());
		confirmGotResult(form, rec.getId());
	}

	@Test
	public void testOld() {
		// old Integer 4
		Inv rec = null;
		InvSearchForm form = new InvSearchForm();
		rec = getMidRecord(form, 0l);
		form.setOldMin(Integer.MIN_VALUE);
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with old of " + rec.getOld());

		form = new InvSearchForm();
		form.setOldMin(rec.getOld());
		form.setOldMax(rec.getOld() + 1);
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setOldMin(rec.getOld() - 1);
		form.setOldMax(rec.getOld());
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setOldMin(rec.getOld());
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setOldMax(rec.getOld());
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setOldMin(rec.getOld());
		form.setOldMax(rec.getOld());
		confirmGotResult(form, rec.getId());
	}

	@Test
	public void testRate() {
		// rate Integer 4
		Inv rec = null;
		InvSearchForm form = new InvSearchForm();
		rec = getMidRecord(form, 0l);
		form.setRateMin(Integer.MIN_VALUE);
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with rate of " + rec.getRate());

		form = new InvSearchForm();
		form.setRateMin(rec.getRate());
		form.setRateMax(rec.getRate() + 1);
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setRateMin(rec.getRate() - 1);
		form.setRateMax(rec.getRate());
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setRateMin(rec.getRate());
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setRateMax(rec.getRate());
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setRateMin(rec.getRate());
		form.setRateMax(rec.getRate());
		confirmGotResult(form, rec.getId());
	}

	@Test
	public void testSubbed() {
		// subbed Integer 4
		Inv rec = null;
		InvSearchForm form = new InvSearchForm();
		rec = getMidRecord(form, 0l);
		form.setSubbedMin(Integer.MIN_VALUE);
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with subbed of " + rec.getSubbed());

		form = new InvSearchForm();
		form.setSubbedMin(rec.getSubbed());
		form.setSubbedMax(rec.getSubbed() + 1);
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setSubbedMin(rec.getSubbed() - 1);
		form.setSubbedMax(rec.getSubbed());
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setSubbedMin(rec.getSubbed());
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setSubbedMax(rec.getSubbed());
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setSubbedMin(rec.getSubbed());
		form.setSubbedMax(rec.getSubbed());
		confirmGotResult(form, rec.getId());
	}

	@Test
	public void testTossed() {
		// tossed Integer 4
		Inv rec = null;
		InvSearchForm form = new InvSearchForm();
		rec = getMidRecord(form, 0l);
		form.setTossedMin(Integer.MIN_VALUE);
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with tossed of " + rec.getTossed());

		form = new InvSearchForm();
		form.setTossedMin(rec.getTossed());
		form.setTossedMax(rec.getTossed() + 1);
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setTossedMin(rec.getTossed() - 1);
		form.setTossedMax(rec.getTossed());
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setTossedMin(rec.getTossed());
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setTossedMax(rec.getTossed());
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setTossedMin(rec.getTossed());
		form.setTossedMax(rec.getTossed());
		confirmGotResult(form, rec.getId());
	}

	@Test
	public void testTotal() {
		// total Integer 4
		Inv rec = null;
		InvSearchForm form = new InvSearchForm();
		rec = getMidRecord(form, 0l);
		form.setTotalMin(Integer.MIN_VALUE);
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with total of " + rec.getTotal());

		form = new InvSearchForm();
		form.setTotalMin(rec.getTotal());
		form.setTotalMax(rec.getTotal() + 1);
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setTotalMin(rec.getTotal() - 1);
		form.setTotalMax(rec.getTotal());
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setTotalMin(rec.getTotal());
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setTotalMax(rec.getTotal());
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setTotalMin(rec.getTotal());
		form.setTotalMax(rec.getTotal());
		confirmGotResult(form, rec.getId());
	}

	@Test
	public void testUpc() {
		// upc String 12
		Inv rec = null;
		InvSearchForm form = new InvSearchForm();
		rec = getMidRecord(form, 0l);
		form.setUpc("%");
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with upc of " + rec.getUpc());

		form = new InvSearchForm();
		String text = rec.getUpc();
		if (text.length() < 2) {
			form.setUpc(text + "%");
			confirmGotResult(form, rec.getId());

			form.setUpc("%" + text);
			confirmGotResult(form, rec.getId());
			form.setUpc("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setUpc(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setUpc("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setUpc("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testWant() {
		// want Integer 4
		Inv rec = null;
		InvSearchForm form = new InvSearchForm();
		rec = getMidRecord(form, 0l);
		form.setWantMin(Integer.MIN_VALUE);
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with want of " + rec.getWant());

		form = new InvSearchForm();
		form.setWantMin(rec.getWant());
		form.setWantMax(rec.getWant() + 1);
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setWantMin(rec.getWant() - 1);
		form.setWantMax(rec.getWant());
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setWantMin(rec.getWant());
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setWantMax(rec.getWant());
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setWantMin(rec.getWant());
		form.setWantMax(rec.getWant());
		confirmGotResult(form, rec.getId());
	}

	@Test
	public void testWanted() {
		// wanted Integer 4
		Inv rec = null;
		InvSearchForm form = new InvSearchForm();
		rec = getMidRecord(form, 0l);
		form.setWantedMin(Integer.MIN_VALUE);
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with wanted of " + rec.getWanted());

		form = new InvSearchForm();
		form.setWantedMin(rec.getWanted());
		form.setWantedMax(rec.getWanted() + 1);
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setWantedMin(rec.getWanted() - 1);
		form.setWantedMax(rec.getWanted());
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setWantedMin(rec.getWanted());
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setWantedMax(rec.getWanted());
		confirmGotResult(form, rec.getId());

		form = new InvSearchForm();
		form.setWantedMin(rec.getWanted());
		form.setWantedMax(rec.getWanted());
		confirmGotResult(form, rec.getId());
	}
}
