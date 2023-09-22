package com.ventech.graphql.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ventech.graphql.main.model.Customer;
import com.ventech.graphql.main.repository.CustomerRepo;

@RestController
@RequestMapping("/api")
public class CustomerController {

	@Autowired
	private CustomerRepo customerRepo;
	
	@PostMapping("/customers")
	public Customer postCustomer(@RequestBody Customer customer){
		
		return customerRepo.save(customer);
	}
	
	
	@GetMapping("/customers")
	public List<Customer> getCustomer(){
		
		return customerRepo.findAll();
	}
	
	
	@GetMapping("/customers/{id}")
	public Customer getCustomer(@PathVariable ("id") long id){
		
		return customerRepo.findById(id).orElseThrow(()->{
			return new RuntimeException();
		});
	}
	
	
}
