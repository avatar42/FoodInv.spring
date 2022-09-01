package com.dea42.foodInv.controller;

import com.dea42.foodInv.entity.Account;
import com.dea42.foodInv.entity.Inv;
import com.dea42.foodInv.entity.Orders;
import com.dea42.foodInv.paging.PageInfo;
import com.dea42.foodInv.paging.PagingRequest;
import com.dea42.foodInv.search.AccountSearchForm;
import com.dea42.foodInv.search.InvSearchForm;
import com.dea42.foodInv.search.OrdersSearchForm;
import com.dea42.foodInv.service.AccountServices;
import com.dea42.foodInv.service.InvServices;
import com.dea42.foodInv.service.OrdersServices;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Title: ApiController <br>
 * Description: Api REST Controller. <br>
 * Copyright: Copyright (c) 2001-2022<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
 */
@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private InvServices invServices;
    @Autowired
    private AccountServices accountServices;
    @Autowired
    private OrdersServices ordersServices;

    public ApiController(){
    }

    @GetMapping("/invs")
    public List<Inv> getAllInvs(){
        return this.invServices.listAll(null).toList();
    }

	@PostMapping(value = "/invs/list")
	public PageInfo<Inv> listInv(HttpServletRequest request,@RequestBody PagingRequest pagingRequest) {

		return invServices.getInvs(request, pagingRequest);
	}

    @GetMapping("/accounts")
    public List<Account> getAllAccounts(){
        return this.accountServices.listAll(null).toList();
    }

	@PostMapping(value = "/accounts/list")
	public PageInfo<Account> listAccount(HttpServletRequest request,@RequestBody PagingRequest pagingRequest) {

		return accountServices.getAccounts(request, pagingRequest);
	}

    @GetMapping("/orderss")
    public List<Orders> getAllOrderss(){
        return this.ordersServices.listAll(null).toList();
    }

	@PostMapping(value = "/orderss/list")
	public PageInfo<Orders> listOrders(HttpServletRequest request,@RequestBody PagingRequest pagingRequest) {

		return ordersServices.getOrderss(request, pagingRequest);
	}
}
