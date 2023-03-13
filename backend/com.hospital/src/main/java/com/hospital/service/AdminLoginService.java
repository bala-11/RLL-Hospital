package com.hospital.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.bean.Adminlogin;
import com.hospital.repo.AdminLoginRepository;

@Service
public class AdminLoginService {
	@Autowired
	AdminLoginRepository adminLoginRepository;
	public String signIn(Adminlogin login) {
		Optional<Adminlogin> result = adminLoginRepository.findById(login.getEmailid());  //checking the record based on email id
		if(result.isPresent()) {
					Adminlogin ll = result.get();
					if(ll.getPassword().equals(login.getPassword())) {		
						return "Admin Login successfull";
						}					
					else {
						return "Incorrect password";
					}
		}else {
			return "This EmailId is not registered";
		}
	}
		
				
	public String signUp(Adminlogin login) {
		Optional<Adminlogin> result = adminLoginRepository.findById(login.getEmailid());
		if(result.isPresent()) {
					return "This Email is already registered";
		}else {
			adminLoginRepository.save(login);
				return "Account created successfully";
			}
			
		}	
	}