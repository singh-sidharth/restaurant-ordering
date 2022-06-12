package com.zephyr.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_tbl")
public class UserDao {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
	public UserDao(Long id, Integer tableNo, String password, String tableStatus) {
		super();
		this.id = id;
		this.tableNo = tableNo;
		this.password = password;
		this.tableStatus = tableStatus;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getTableNo() {
		return tableNo;
	}
	public void setTableNo(Integer tableNo) {
		this.tableNo = tableNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTableStatus() {
		return tableStatus;
	}
	public void setTableStatus(String tableStatus) {
		this.tableStatus = tableStatus;
	}
	@Override
	public String toString() {
		return "UserDao [id=" + id + ", tableNo=" + tableNo + ", password=" + password + ", tableStatus=" + tableStatus
				+ "]";
	}
	
	
}
