package com.zephyr.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zephyr.models.OrderDto;
import com.zephyr.models.Table;
import com.zephyr.repositories.OrderRepository;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private OrderRepository orderRepo;
	
	@Override
	public void userLogout(long userId) {
		this.orderRepo.updatePaymentStatusByOrderId(userId);
	
	}

	@Override
	public List<Table> getTables() {
		Table tbl = new Table("1","free");
		List<Table> tables = new ArrayList<Table>();
		tables.add(tbl);
		return tables;
	}

	@Override
	public OrderDto viewTableDetails(long orderId) {
		
		return null;
	}

	@Override
	public void updateUserCart(long cartId) {
		
		
	}

}
