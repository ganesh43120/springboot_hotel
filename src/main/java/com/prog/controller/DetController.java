package com.prog.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.prog.entity.Details;

import com.prog.service.DetService;


@Controller
public class DetController {
	@Autowired
	private DetService service;
	
	@GetMapping("/searchroom")
	public String SearchroomForm() {
		
		return "search";
	}
	

	
	@PostMapping("/searchroom")
	public String searchRoom(@ModelAttribute Details e) {
		
		System.out.println(e);
		
		service.addDet(e);
		
		return "redirect:/";
	}
}
