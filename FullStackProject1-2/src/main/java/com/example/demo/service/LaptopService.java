package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Laptop;

public interface LaptopService {

	public List<Laptop> getLaptop();
	
	public Laptop getLaptopById(Integer id);
	
	public Laptop getLaptopByName(String name);
	
	public Laptop postLaptop(Laptop laptop);
	
	public Laptop deleteLaptop(Integer id);
	

}
