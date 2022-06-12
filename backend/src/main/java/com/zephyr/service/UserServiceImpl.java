package com.zephyr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zephyr.repositories.MenuRepository;
import com.zephyr.repositories.OrderRepository;
import com.zephyr.models.MenuDao;
import com.zephyr.models.OrderDao;
import com.zephyr.models.OrderDto;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private MenuRepository menuRepo;
	@Autowired
	private OrderRepository orderRepo;
	
	@Override
	public List<MenuDao> getMenu(){
		List<MenuDao> menu = this.menuRepo.findAll();
		return menu;
	}

	@Override
	public Long placeOrder(OrderDto order) {
		long orderId = -1;
		if(order.getOrderId() == -1) {
			List<Long> matchedPending = this.orderRepo.findOrderId(Long.valueOf(1));
			if(matchedPending.size() == 1) {
				orderId = matchedPending.get(0).intValue();
				}
			else {
				OrderDao newOrder = new OrderDao();
				newOrder.setPaymentStatus("pending");
				orderId = this.orderRepo.save(newOrder).getOrderId();
			}
		}
		return orderId;
	}

	@Override
	public OrderDto getBill(long orderId) {
		OrderDto billedCart = new OrderDto();
		
		
		return billedCart;
	}
	
	
}
