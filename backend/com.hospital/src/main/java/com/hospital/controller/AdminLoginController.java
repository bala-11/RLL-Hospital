package com.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.bean.Adminlogin;
import com.hospital.service.AdminLoginService;

@RestController
@RequestMapping("admin-login")
@CrossOrigin
public class AdminLoginController {

	
	@Autowired
	AdminLoginService adminLoginService;
	
	
	@PostMapping(value = "signIn",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String signIn(@RequestBody Adminlogin adminLogin) {
		//System.out.println("I cam here");
		return adminLoginService.signIn(adminLogin);
		
	}
	
	@PostMapping(value = "signUp",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String signUp(@RequestBody Adminlogin login) {
		//System.out.println(login);
		return adminLoginService.signUp(login);
	}
}