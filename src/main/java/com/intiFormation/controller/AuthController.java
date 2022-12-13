package com.intiFormation.controller;



import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:4200")
public class AuthController {
	
	
	
	@RequestMapping("/afficherLogin")
	public String afficherLogin() {
		return "loginUser";
	}
	
	@RequestMapping("/bonjour")
	public String bienvenue() {
		return "bonjour";
	}
	
	@RequestMapping("/accessDenied")
	public String accesRefuse() {
		return "accessDenied";
	}
}
