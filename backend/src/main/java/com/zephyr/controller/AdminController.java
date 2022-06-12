package com.zephyr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zephyr.models.Table;
import com.zephyr.service.AdminService;

/**
 * 
 * @author Sidharth Singh
 * @implNote Handles the Restaurant internal billing related end points like logging out, settling bill,
 * freeing up table etc.
 *
 */
@RequestMapping("/admin")
@RestController
public class AdminController {
	
	@Autowired
	private AdminService adminSvc;
	
	@GetMapping("/get_tables")
	public List<Table> getTables() {
		return this.adminSvc.getTables();
	}
}
