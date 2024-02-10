package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Laptop;
import com.example.demo.serviceimpl.LaptopServiceImpl;

@RestController
public class LaptopController {

	@Autowired
	public LaptopServiceImpl laptopServiceImpl;

	@GetMapping(value = "/get")
	public List<Laptop> getLaptop() {
		return laptopServiceImpl.getLaptop();

	}

	@GetMapping(value = "/getById/{id}")
	public Laptop getLaptopById(@PathVariable Integer id) {
		return laptopServiceImpl.getLaptopById(id);
	}
	
	@GetMapping(value="/getByName/{name}")
	public Laptop getLaptopByName(@PathVariable String name) {
		return laptopServiceImpl.getLaptopByName(name);
	}

	@PostMapping(value = "/post")
	public Laptop postLaptop(@RequestBody Laptop laptop) {
		return laptopServiceImpl.postLaptop(laptop);
	}
	

	@DeleteMapping(value = "/deleteById/{id}")
	public Laptop deleteLaptop(@PathVariable Integer id) {
		return laptopServiceImpl.deleteLaptop(id);
	}

}
