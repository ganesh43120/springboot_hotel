package com.prog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.prog.entity.Customer;
import com.prog.service.CusService;




@Controller
public class CusController {
	
	@Autowired
	private CusService service;
	
	@GetMapping("/")
	public String home(Model m) {
		
		List<Customer> cus=service.getAllCus();
		m.addAttribute("cus", cus);
		return "index";
	}
	
	@GetMapping("/addcustomer")
	public String addCustomerForm() {
		
		return "add_cus";
	}
	
	@PostMapping("/register")
	public String cusRegister(@ModelAttribute Customer e) {
		
		System.out.println(e);
		
		service.addCus(e);
		
		return "redirect:/";
			
	}
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable int id,Model m) {
		
		Customer e=service.getCusById(id);
		
		m.addAttribute("cus",e);
		return "edit";
	}
	
	@PostMapping("/update")
	public String updateCus(@ModelAttribute Customer e) {
		service.addCus(e);
		return "redirect:/";
	}
	@GetMapping("/delete/{id}")
	public String deleteCus(@PathVariable int id) {
		
		service.deleteCus(id);
		return "redirect:/";
		
	}
	
	
	

}

