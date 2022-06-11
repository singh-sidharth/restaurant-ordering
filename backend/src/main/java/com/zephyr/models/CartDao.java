package com.zephyr.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="cart_tbl")
public class CartDao implements Serializable{
	
	@Id
	@GeneratedValue
	@Column(name="cart_id")
	private Long id; 
	@ManyToOne(fetch=FetchType.LAZY, optional = false)
	@JoinColumn(name="order_id", nullable=false)
	private OrderDao order;
	@Column(name="placed_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date placedAt;
	@ManyToMany(mappedBy="carts")
	@JoinTable(name="cart_to_ite_mapping",
	joinColumns = @JoinColumn(name="menu_id"),
	inverseJoinColumns = @JoinColumn(name="item_id"))
	private Set<MenuDao> menus;
	public CartDao() {}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public OrderDao getOrder() {
		return order;
	}
	public void setOrder(OrderDao order) {
		this.order = order;
	}
	public Date getPlacedAt() {
		return placedAt;
	}
	public void setPlacedAt(Date placedAt) {
		this.placedAt = placedAt;
	}
	public Set<MenuDao> getMenus() {
		return menus;
	}
	public void setMenus(Set<MenuDao> menus) {
		this.menus = menus;
	}
	public CartDao(Long id, OrderDao order, Date placedAt, Set<MenuDao> menus) {
		super();
		this.id = id;
		this.order = order;
		this.placedAt = placedAt;
		this.menus = menus;
	}
	@Override
	public String toString() {
		return "CartDao [id=" + id + ", order=" + order + ", placedAt=" + placedAt + ", menus=" + menus + "]";
	}
	
	
}
