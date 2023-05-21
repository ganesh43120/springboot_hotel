package com.prog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	@GetMapping("/login")
	public String loginpage() {
		return "login";
	}
	
	@PostMapping("/login")
	public String page(@RequestParam String userid,@RequestParam String password) {
		if(userid.equals("root") && password.equals("12345")) {
		return "index";
	  }
		else {
		System.out.println("Please provid correct userid and Password");
		return "elogin";
		}
	 }
}