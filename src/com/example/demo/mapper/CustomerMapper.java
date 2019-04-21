package com.example.demo.mapper;

import java.util.List;

import com.example.demo.entity.Customer;

public interface CustomerMapper {
	
	List<Customer> getAll();
	
	Customer getOne(Integer id);
	
	void insert(Customer customer);
	
	void update(Customer customer);
	
	void delete(Integer id);
	
}
