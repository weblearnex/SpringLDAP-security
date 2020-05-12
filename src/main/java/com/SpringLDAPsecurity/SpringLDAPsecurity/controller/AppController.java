package com.SpringLDAPsecurity.SpringLDAPsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@GetMapping("/")
	public String getWelcome(){
		return "<h1>Welcome for All</h1>";
	}
	
	@GetMapping("/admin")
	public String getAdmin(){
		return "<h1>Welcome admin Api</h1>";
	}
	
	@GetMapping("/user")
	public String getUser(){
		return "<h1>Welcome user Api</h1>";
	}
	

}
