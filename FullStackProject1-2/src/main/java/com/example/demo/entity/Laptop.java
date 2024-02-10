package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Laptop {

	@Id
	int id;
	String name;
	String Color;

	public Laptop() {
		super();
	}

	public Laptop(int id, String name, String color) {
		super();
		this.id = id;
		this.name = name;
		Color = color;
	}

	public int getId() {
		return id;
	}

	// setter
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	// setter
	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return Color;
	}

	// setter

	public void setColor(String color) {
		Color = color;
	}

	@Override
	public String toString() {
		return "Laptop [id=" + id + ", name=" + name + ", Color=" + Color + "]";
	}

	
	

}
