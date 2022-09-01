package com.dea42.foodInv.search;

import com.dea42.foodInv.entity.Inv;
import com.dea42.foodInv.utils.MessageHelper;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.domain.Sort;
import org.springframework.format.annotation.DateTimeFormat;


/**
 * Title: InvSearchForm <br>
 * Description: Class for holding data from the Inv table for searching. <br>
 * Copyright: Copyright (c) 2001-2022<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
 */
@Data
public class InvSearchForm implements Serializable {
	private static final long serialVersionUID = 1L;

/* info=ColInfo(fNum=19, colName=AvgEaten, msgKey=Inv.avgeaten, vName=avgeaten, type=BigDecimal, jtype=null, stype=8, gsName=Avgeaten, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=false, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=22, comment=null) */
	private BigDecimal avgeatenMin;
	private BigDecimal avgeatenMax;
/* info=ColInfo(fNum=17, colName=AvgOrder, msgKey=Inv.avgorder, vName=avgorder, type=BigDecimal, jtype=null, stype=8, gsName=Avgorder, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=false, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=22, comment=null) */
	private BigDecimal avgorderMin;
	private BigDecimal avgorderMax;
	private String comment = "";
/* info=ColInfo(fNum=11, colName=GetAlacart, msgKey=Inv.getalacart, vName=getalacart, type=Integer, jtype=null, stype=4, gsName=Getalacart, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=false, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
	private Integer getalacartMin;
	private Integer getalacartMax;
/* info=ColInfo(fNum=7, colName=Have, msgKey=Inv.have, vName=have, type=Integer, jtype=null, stype=4, gsName=Have, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=false, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
	private Integer haveMin;
	private Integer haveMax;
/* info=ColInfo(fNum=2, colName=id, msgKey=Inv.id, vName=id, type=Long, jtype=null, stype=-5, gsName=Id, length=0, pk=true, defaultVal=null, constraint=null, required=true, list=false, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment= * Table name: Inv<br>
 * Column name: id<br>
 * Catalog name: FoodInv<br>
 * Primary key sequence: 1<br>
 * Primary key name: PRIMARY<br>
 *  <br>) */
	private Long idMin;
	private Long idMax;
	private String item = "";
/* info=ColInfo(fNum=10, colName=LowInvAdj, msgKey=Inv.lowinvadj, vName=lowinvadj, type=Integer, jtype=null, stype=4, gsName=Lowinvadj, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=false, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
	private Integer lowinvadjMin;
	private Integer lowinvadjMax;
/* info=ColInfo(fNum=18, colName=Max, msgKey=Inv.max, vName=max, type=Integer, jtype=null, stype=4, gsName=Max, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=false, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
	private Integer maxMin;
	private Integer maxMax;
	private String meal = "";
/* info=ColInfo(fNum=12, colName=Need, msgKey=Inv.need, vName=need, type=Integer, jtype=null, stype=4, gsName=Need, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=false, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
	private Integer needMin;
	private Integer needMax;
/* info=ColInfo(fNum=8, colName=Old, msgKey=Inv.old, vName=old, type=Integer, jtype=null, stype=4, gsName=Old, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=false, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
	private Integer oldMin;
	private Integer oldMax;
/* info=ColInfo(fNum=3, colName=Rate, msgKey=Inv.rate, vName=rate, type=Integer, jtype=null, stype=4, gsName=Rate, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=true, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
	private Integer rateMin;
	private Integer rateMax;
/* info=ColInfo(fNum=14, colName=Subbed, msgKey=Inv.subbed, vName=subbed, type=Integer, jtype=null, stype=4, gsName=Subbed, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=false, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
	private Integer subbedMin;
	private Integer subbedMax;
/* info=ColInfo(fNum=16, colName=Tossed, msgKey=Inv.tossed, vName=tossed, type=Integer, jtype=null, stype=4, gsName=Tossed, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=false, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
	private Integer tossedMin;
	private Integer tossedMax;
/* info=ColInfo(fNum=9, colName=Total, msgKey=Inv.total, vName=total, type=Integer, jtype=null, stype=4, gsName=Total, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=false, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
	private Integer totalMin;
	private Integer totalMax;
	private String upc = "";
/* info=ColInfo(fNum=6, colName=Want, msgKey=Inv.want, vName=want, type=Integer, jtype=null, stype=4, gsName=Want, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=false, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
	private Integer wantMin;
	private Integer wantMax;
/* info=ColInfo(fNum=15, colName=Wanted, msgKey=Inv.wanted, vName=wanted, type=Integer, jtype=null, stype=4, gsName=Wanted, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=false, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
	private Integer wantedMin;
	private Integer wantedMax;
	private String sortField = "id";
	private int page = 1;
	private int pageSize = 10;
	private boolean sortAsc = true;
	private int totalPages = 0;
	private long totalItems = 0;
	private SearchType doOr = SearchType.ADD;
	private boolean advanced = true;
	/**
	 * Clones Inv obj into form
	 *
	 * @param obj
	 */
	public static InvSearchForm getInstance(Inv obj) {
		InvSearchForm form = new InvSearchForm();
		form.setAvgeatenMin(obj.getAvgeaten());
		form.setAvgeatenMax(obj.getAvgeaten());
		form.setAvgorderMin(obj.getAvgorder());
		form.setAvgorderMax(obj.getAvgorder());
		form.setComment(obj.getComment());
		form.setGetalacartMin(obj.getGetalacart());
		form.setGetalacartMax(obj.getGetalacart());
		form.setHaveMin(obj.getHave());
		form.setHaveMax(obj.getHave());
		form.setIdMin(obj.getId());
		form.setIdMax(obj.getId());
		form.setItem(obj.getItem());
		form.setLowinvadjMin(obj.getLowinvadj());
		form.setLowinvadjMax(obj.getLowinvadj());
		form.setMaxMin(obj.getMax());
		form.setMaxMax(obj.getMax());
		form.setMeal(obj.getMeal());
		form.setNeedMin(obj.getNeed());
		form.setNeedMax(obj.getNeed());
		form.setOldMin(obj.getOld());
		form.setOldMax(obj.getOld());
		form.setRateMin(obj.getRate());
		form.setRateMax(obj.getRate());
		form.setSubbedMin(obj.getSubbed());
		form.setSubbedMax(obj.getSubbed());
		form.setTossedMin(obj.getTossed());
		form.setTossedMax(obj.getTossed());
		form.setTotalMin(obj.getTotal());
		form.setTotalMax(obj.getTotal());
		form.setUpc(obj.getUpc());
		form.setWantMin(obj.getWant());
		form.setWantMax(obj.getWant());
		form.setWantedMin(obj.getWanted());
		form.setWantedMax(obj.getWanted());
		return form;
	}

	/**
	 * Generate a Sort from fields
	 * @return
	 */
	public Sort getSort() {
		if (sortAsc)
			return Sort.by(sortField).ascending();

		return Sort.by(sortField).descending();
	}

	public String getSortDir() {
		if (sortAsc)
			return "asc";
		else
			return "desc";
	}

	public String getReverseSortDir() {
		if (sortAsc)
			return "desc";
		else
			return "asc";
	}

	boolean getSortAscFlip() {
		return !sortAsc;
	}
}
