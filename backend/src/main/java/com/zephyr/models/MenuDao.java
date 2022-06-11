package com.zephyr.models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="items_tbl")
public class MenuDao{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="item_id")
	private Long menuId;
	private String name;
	private Float cost;
	private String description;
	private String category;
	@ManyToMany
	private Set<CartDao> carts;
	public MenuDao() {}
	public MenuDao(Long menuId, String name, Float cost, String description, String category, Set<CartDao> carts) {
		super();
		this.menuId = menuId;
		this.name = name;
		this.cost = cost;
		this.description = description;
		this.category = category;
		this.carts = carts;
	}
	@Override
	public String toString() {
		return "MenuDao [menuId=" + menuId + ", name=" + name + ", cost=" + cost + ", description=" + description
				+ ", category=" + category + ", carts=" + carts + "]";
	}
	public Long getMenuId() {
		return menuId;
	}
	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getCost() {
		return cost;
	}
	public void setCost(Float cost) {
		this.cost = cost;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Set<CartDao> getCarts() {
		return carts;
	}
	public void setCarts(Set<CartDao> carts) {
		this.carts = carts;
	}
}
