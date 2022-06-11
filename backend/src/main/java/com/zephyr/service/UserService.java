package com.zephyr.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zephyr.models.MenuDao;


public interface UserService {
	
	public List<MenuDao> getMenu();
}