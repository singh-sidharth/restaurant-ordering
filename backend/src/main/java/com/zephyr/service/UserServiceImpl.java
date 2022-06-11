package com.zephyr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zephyr.repositories.MenuRepository;
import com.zephyr.repositories.OrderRepository;
import com.zephyr.models.MenuDao;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private MenuRepository menuRepo;
	
	@Override
	public List<MenuDao> getMenu(){
		List<MenuDao> menu = this.menuRepo.findAll();
		return menu;
	}
	
	
}
