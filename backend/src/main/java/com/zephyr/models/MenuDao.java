package com.zephyr.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="items_tbl")
public class MenuDao{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="item_id")
	private Long id;
	private String name;
	private Float cost;
	private String description;
	private String category;
	public MenuDao(Long id, String name, Float cost, String description, String category) {
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.description = description;
		this.category = category;
	}
	public MenuDao() {}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "MenuDao [id=" + id + ", name=" + name + ", cost=" + cost + ", description=" + description
				+ ", category=" + category + "]";
	}
}
