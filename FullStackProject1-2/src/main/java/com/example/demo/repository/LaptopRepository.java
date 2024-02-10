package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Laptop;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Integer> {

	@Query("SELECT l FROM Laptop l WHERE l.name = :name")
	
	Laptop findByName(String name);
	
	

}
