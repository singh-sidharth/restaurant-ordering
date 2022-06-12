package com.zephyr.models;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="cart_tbl")
public class CartDao implements Serializable{
	
	private static final long serialVersionUID = -7374311315868195595L;
	@Id
	@GeneratedValue
	@Column(name="cart_id")
	private Long cartId; 
	@ManyToOne(cascade=CascadeType.ALL, fetch =FetchType.EAGER, optional = false)
	@JoinColumn(name="order_id")
	private OrderDao order;
	@Column(name="placed_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date placedAt;
	@ManyToMany
	@JoinTable(name="individual_orders",
	joinColumns = @JoinColumn(name="cart_id"),
	inverseJoinColumns = @JoinColumn(name="item_id"))
	private Set<MenuDao> menus = new HashSet<MenuDao>();
	public CartDao() {}
	public Long getId() {
		return cartId;
	}
	public void setId(Long id) {
		this.cartId = id;
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
		this.cartId = id;
		this.order = order;
		this.placedAt = placedAt;
		this.menus = menus;
	}
	@Override
	public String toString() {
		return "CartDao [id=" + cartId + ", order=" + order + ", placedAt=" + placedAt + ", menus=" + menus + "]";
	}
	
	public void addItem(MenuDao item) {
		this.menus.add(item);
	}
	
}
