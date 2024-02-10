package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Laptop;
import com.example.demo.repository.LaptopRepository;
import com.example.demo.service.LaptopService;

@Service
public class LaptopServiceImpl implements LaptopService {

	@Autowired

	public LaptopRepository LaptopRepository;

	@Override
	public List<Laptop> getLaptop() {

		return LaptopRepository.findAll();
	}

	@Override
	public Laptop getLaptopById(Integer id) {
		Optional<Laptop> laptop = LaptopRepository.findById(id);
		return laptop.orElse(null);
	}
	
	@Override
	public Laptop getLaptopByName(String name) {
		Laptop laptop=LaptopRepository.findByName(name);
		return laptop;
	}

	@Override
	public Laptop postLaptop(Laptop laptop) {
		return LaptopRepository.save(laptop);
	}

	@Override
	public Laptop deleteLaptop(Integer id) {
		LaptopRepository.deleteById(id);
		return null;
	}

}
