package com.zephyr.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_tbl")
public class UserDao {
	@Id
	@GeneratedValue
	private Long id;
	@Column(name="table_no", nullable = false)
	private Integer tableNo;
	@Column(name="password", nullable = false)
	private String password;
	@Column(name="table_status")
	private String tableStatus;
	public UserDao() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
