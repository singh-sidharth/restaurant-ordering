package com.zephyr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zephyr.models.MenuDao;
import com.zephyr.service.UserService;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userSvc;
	
	@GetMapping("get_menu")
	public List<MenuDao> getMenu(){
		return this.userSvc.getMenu();
	}
	
}
