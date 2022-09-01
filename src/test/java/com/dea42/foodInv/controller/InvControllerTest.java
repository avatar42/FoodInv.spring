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
import com.dea42.foodInv.entity.Inv;
import com.dea42.foodInv.form.InvForm;
import com.dea42.foodInv.search.InvSearchForm;

/**
 * Title: InvControllerTest <br>
 * Description: InvController. <br>
 * Copyright: Copyright (c) 2001-2022<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
 */
@Slf4j
@WebMvcTest(InvController.class)
public class InvControllerTest extends MockBase {
	private Inv getInv(Long id) {
		Inv o = new Inv();
		o.setId(id);
		/* TODO: confirm ignoring ColInfo(fNum=19, colName=AvgEaten, msgKey=Inv.avgeaten, vName=avgeaten, type=BigDecimal, jtype=null, stype=8, gsName=Avgeaten, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=false, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=22, comment=null) */
		/* TODO: confirm ignoring ColInfo(fNum=17, colName=AvgOrder, msgKey=Inv.avgorder, vName=avgorder, type=BigDecimal, jtype=null, stype=8, gsName=Avgorder, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=false, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=22, comment=null) */
		/* TODO: confirm ignoring ColInfo(fNum=20, colName=Comment, msgKey=Inv.comment, vName=comment, type=String, jtype=null, stype=12, gsName=Comment, length=50, pk=false, defaultVal=, constraint=null, required=false, list=false, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
		/* TODO: confirm ignoring ColInfo(fNum=11, colName=GetAlacart, msgKey=Inv.getalacart, vName=getalacart, type=Integer, jtype=null, stype=4, gsName=Getalacart, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=false, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
		/* TODO: confirm ignoring ColInfo(fNum=7, colName=Have, msgKey=Inv.have, vName=have, type=Integer, jtype=null, stype=4, gsName=Have, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=false, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
        o.setItem(getTestString(46));
		/* TODO: confirm ignoring ColInfo(fNum=10, colName=LowInvAdj, msgKey=Inv.lowinvadj, vName=lowinvadj, type=Integer, jtype=null, stype=4, gsName=Lowinvadj, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=false, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
		/* TODO: confirm ignoring ColInfo(fNum=18, colName=Max, msgKey=Inv.max, vName=max, type=Integer, jtype=null, stype=4, gsName=Max, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=false, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
        o.setMeal(getTestString(2));
		/* TODO: confirm ignoring ColInfo(fNum=12, colName=Need, msgKey=Inv.need, vName=need, type=Integer, jtype=null, stype=4, gsName=Need, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=false, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
		/* TODO: confirm ignoring ColInfo(fNum=8, colName=Old, msgKey=Inv.old, vName=old, type=Integer, jtype=null, stype=4, gsName=Old, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=false, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
		/* TODO: confirm ignoring ColInfo(fNum=14, colName=Subbed, msgKey=Inv.subbed, vName=subbed, type=Integer, jtype=null, stype=4, gsName=Subbed, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=false, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
		/* TODO: confirm ignoring ColInfo(fNum=16, colName=Tossed, msgKey=Inv.tossed, vName=tossed, type=Integer, jtype=null, stype=4, gsName=Tossed, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=false, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
		/* TODO: confirm ignoring ColInfo(fNum=9, colName=Total, msgKey=Inv.total, vName=total, type=Integer, jtype=null, stype=4, gsName=Total, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=false, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
        o.setUpc(getTestString(15));
		/* TODO: confirm ignoring ColInfo(fNum=6, colName=Want, msgKey=Inv.want, vName=want, type=Integer, jtype=null, stype=4, gsName=Want, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=false, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
		/* TODO: confirm ignoring ColInfo(fNum=15, colName=Wanted, msgKey=Inv.wanted, vName=wanted, type=Integer, jtype=null, stype=4, gsName=Wanted, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=false, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
		return o;
	}

	/**
	 * Test method for
	 * {@link com.dea42.foodInv.controller.InvController#getAllInvs(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllInvs() throws Exception {
		List<Inv> list = new ArrayList<>();
		Inv o = getInv(1l);
		list.add(o);

		Page<Inv> p = getPage(list);
		given(invServices.listAll(new InvSearchForm())).willReturn(p);

		ResultActions ra = getAsAdmin("/invs");
		contentContainsMarkup(ra,"<h1>" + getMsg("class.Inv") + " " + getMsg("edit.list") + "</h1>");
		/* TODO: confirm ignoring ColInfo(fNum=19, colName=AvgEaten, msgKey=Inv.avgeaten, vName=avgeaten, type=BigDecimal, jtype=null, stype=8, gsName=Avgeaten, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=false, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=22, comment=null) */
		/* TODO: confirm ignoring ColInfo(fNum=17, colName=AvgOrder, msgKey=Inv.avgorder, vName=avgorder, type=BigDecimal, jtype=null, stype=8, gsName=Avgorder, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=false, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=22, comment=null) */
		/* TODO: confirm ignoring ColInfo(fNum=20, colName=Comment, msgKey=Inv.comment, vName=comment, type=String, jtype=null, stype=12, gsName=Comment, length=50, pk=false, defaultVal=, constraint=null, required=false, list=false, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
		/* TODO: confirm ignoring ColInfo(fNum=11, colName=GetAlacart, msgKey=Inv.getalacart, vName=getalacart, type=Integer, jtype=null, stype=4, gsName=Getalacart, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=false, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
		/* TODO: confirm ignoring ColInfo(fNum=7, colName=Have, msgKey=Inv.have, vName=have, type=Integer, jtype=null, stype=4, gsName=Have, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=false, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
//		contentContainsMarkup(ra,getTestString(46));
//		contentContainsMarkup(ra,getMsg("Inv.item"));
		/* TODO: confirm ignoring ColInfo(fNum=10, colName=LowInvAdj, msgKey=Inv.lowinvadj, vName=lowinvadj, type=Integer, jtype=null, stype=4, gsName=Lowinvadj, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=false, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
		/* TODO: confirm ignoring ColInfo(fNum=18, colName=Max, msgKey=Inv.max, vName=max, type=Integer, jtype=null, stype=4, gsName=Max, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=false, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
//		contentContainsMarkup(ra,getTestString(2));
//		contentContainsMarkup(ra,getMsg("Inv.meal"));
		/* TODO: confirm ignoring ColInfo(fNum=12, colName=Need, msgKey=Inv.need, vName=need, type=Integer, jtype=null, stype=4, gsName=Need, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=false, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
		/* TODO: confirm ignoring ColInfo(fNum=8, colName=Old, msgKey=Inv.old, vName=old, type=Integer, jtype=null, stype=4, gsName=Old, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=false, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
//		contentContainsMarkup(ra,getMsg("Inv.rate"));
		/* TODO: confirm ignoring ColInfo(fNum=14, colName=Subbed, msgKey=Inv.subbed, vName=subbed, type=Integer, jtype=null, stype=4, gsName=Subbed, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=false, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
		/* TODO: confirm ignoring ColInfo(fNum=16, colName=Tossed, msgKey=Inv.tossed, vName=tossed, type=Integer, jtype=null, stype=4, gsName=Tossed, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=false, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
		/* TODO: confirm ignoring ColInfo(fNum=9, colName=Total, msgKey=Inv.total, vName=total, type=Integer, jtype=null, stype=4, gsName=Total, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=false, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
//		contentContainsMarkup(ra,getTestString(15));
//		contentContainsMarkup(ra,getMsg("Inv.upc"));
		/* TODO: confirm ignoring ColInfo(fNum=6, colName=Want, msgKey=Inv.want, vName=want, type=Integer, jtype=null, stype=4, gsName=Want, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=false, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
		/* TODO: confirm ignoring ColInfo(fNum=15, colName=Wanted, msgKey=Inv.wanted, vName=wanted, type=Integer, jtype=null, stype=4, gsName=Wanted, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=false, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
	}

	/**
	 * Test method for
	 * {@link com.dea42.foodInv.controller.InvController#showNewInvPage(org.springframework.ui.Model)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testShowNewInvPage() throws Exception {
		ResultActions ra = getAsAdmin("/invs/new");
		contentContainsMarkup(ra,"<legend>" + getMsg("edit.new") + " " + getMsg("class.Inv") + "</legend>");
		contentContainsMarkup(ra,getMsg("Inv.avgeaten"));
		contentContainsMarkup(ra,getMsg("Inv.avgorder"));
		contentContainsMarkup(ra,getMsg("Inv.comment"));
		contentContainsMarkup(ra,getMsg("Inv.getalacart"));
		contentContainsMarkup(ra,getMsg("Inv.have"));
		// TODO: confirm ignoring Inv.id
		contentContainsMarkup(ra,getMsg("Inv.item"));
		contentContainsMarkup(ra,getMsg("Inv.lowinvadj"));
		contentContainsMarkup(ra,getMsg("Inv.max"));
		contentContainsMarkup(ra,getMsg("Inv.meal"));
		contentContainsMarkup(ra,getMsg("Inv.need"));
		contentContainsMarkup(ra,getMsg("Inv.old"));
		contentContainsMarkup(ra,getMsg("Inv.rate"));
		contentContainsMarkup(ra,getMsg("Inv.subbed"));
		contentContainsMarkup(ra,getMsg("Inv.tossed"));
		contentContainsMarkup(ra,getMsg("Inv.total"));
		contentContainsMarkup(ra,getMsg("Inv.upc"));
		contentContainsMarkup(ra,getMsg("Inv.want"));
		contentContainsMarkup(ra,getMsg("Inv.wanted"));
	}

	/**
	 * Test method for
	 * {@link com.dea42.foodInv.controller.InvController#saveInv(com.dea42.foodInv.entity.Inv, java.lang.String)}.
	 */
	@Test
	public void testSaveInvCancel() throws Exception {
		Inv o = getInv(1l);

		send(SEND_POST, "/invs/save", "inv", o, ImmutableMap.of("action", "cancel"), ADMIN_EMAIL,
				"/invs");
	}

	/**
	 * Test method for
	 * {@link com.dea42.foodInv.controller.InvController#saveInv(com.dea42.foodInv.entity.Inv, java.lang.String)}.
	 */
	@Test
	public void testSaveInvSave() throws Exception {
		Inv o = getInv(0l);
		InvForm form = InvForm.getInstance(o);
		log.debug(form.toString());

		send(SEND_POST, "/invs/save", "invForm", form, ImmutableMap.of("action", "save"), ADMIN_EMAIL,
				"/invs");
	}

	/**
	 * Test method for
	 * {@link com.dea42.foodInv.controller.InvController#showEditInvPage(java.lang.Integer)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testShowEditInvPage() throws Exception {
		Inv o = getInv(1l);

		given(invServices.get(1l)).willReturn(o);

		ResultActions ra = getAsAdmin("/invs/edit/1");
		contentContainsMarkup(ra,"Avgeaten");
		contentContainsMarkup(ra,"Avgorder");
		contentContainsMarkup(ra,o.getComment());
		contentContainsMarkup(ra,"Comment");
		contentContainsMarkup(ra,"Getalacart");
		contentContainsMarkup(ra,"Have");
		// TODO: confirm ignoring Inv.id
		contentContainsMarkup(ra,o.getItem());
		contentContainsMarkup(ra,"Item");
		contentContainsMarkup(ra,"Lowinvadj");
		contentContainsMarkup(ra,"Max");
		contentContainsMarkup(ra,o.getMeal());
		contentContainsMarkup(ra,"Meal");
		contentContainsMarkup(ra,"Need");
		contentContainsMarkup(ra,"Old");
		contentContainsMarkup(ra,"Rate");
		contentContainsMarkup(ra,"Subbed");
		contentContainsMarkup(ra,"Tossed");
		contentContainsMarkup(ra,"Total");
		contentContainsMarkup(ra,o.getUpc());
		contentContainsMarkup(ra,"Upc");
		contentContainsMarkup(ra,"Want");
		contentContainsMarkup(ra,"Wanted");
	}

	/**
	 * Test method for
	 * {@link com.dea42.foodInv.controller.InvController#deleteInv(java.lang.Integer)}.
	 */
	@Test
	public void testDeleteInv() throws Exception {
		getAsAdminRedirectExpected("/invs/delete/1","/invs");
	}

}

