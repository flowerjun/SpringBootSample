package com.example.simple.web;

import com.example.simple.service.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.simple.domain.Customer;

@RestController
@RequestMapping("/customer")
public class CustomController {

	@Autowired CustomService service;
	
	@PostMapping(value="/",
				produces="application/json")
	public Customer insert(@RequestBody Customer customer){
		return service.insert(customer);
	}
	
	@GetMapping(value="/{id}")
	public Customer find(@PathVariable Long id){
		return service.find(id);
	}
}