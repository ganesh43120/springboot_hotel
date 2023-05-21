package com.prog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prog.entity.Customer;
import com.prog.repository.CusRepo;

import java.util.List;
import java.util.Optional;

@Service
public class CusService {
	
	@Autowired
	private CusRepo repo;
	
	public void addCus(Customer e) {
		repo.save(e);
		
	}
	
	public List<Customer> getAllCus(){
		return repo.findAll();
	}
	
	public Customer getCusById(int id) {
		
		Optional<Customer> e=repo.findById(id);
		if(e.isPresent()) {
			return e.get();
		}
		return null;
	}
	
	public void deleteCus(int id) {
		repo.deleteById(id);
	}

}
