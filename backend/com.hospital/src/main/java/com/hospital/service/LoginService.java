package com.hospital.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.bean.Login;
import com.hospital.repo.DoctorRepository;
import com.hospital.repo.LoginRepository;
import com.hospital.repo.PatientRepository;

@Service
public class LoginService {
	
	@Autowired
	LoginRepository loginrepo;
	@Autowired
	DoctorRepository docrepo;
	@Autowired
	PatientRepository patrepo;
	
	public String signIn(Login login) {
		Optional<Login> result = loginrepo.findById(login.getEmailid());
		if(result.isPresent()) {
					Login ll = result.get();
					if(ll.getPassword().equals(login.getPassword())) {		
						if(login.getRole().equals(ll.getRole()) && login.getRole().equals("doctor")) {
							return "Doctor sucessfully login";
						}else if(login.getRole().equals(ll.getRole()) && login.getRole().equals("patient")){
							return "Patient successfully login";
						}else {
							return "No data found with these details";
						}					
					}else {
						return "Incorrect Password";
					}
		}else {
			return "Incorrect Id";
		}	
	}
	

	
	public String signUp(Login login) {
		Optional<Login> result = loginrepo.findById(login.getEmailid());
		if(result.isPresent()) {
					return "This id is already registered";
		}else {
		if(login.getRole().equals("doctor")) {
            if(docrepo.checkEmail(login.getEmailid()).isPresent()) {
            	loginrepo.save(login);
				return "Account created successfully";
				
            }else {
            	return "Invalid Credentials";
            }
		}else {
			if(patrepo.checkEmail(login.getEmailid()).isPresent()) {
            	loginrepo.save(login);
				return "Account created successfully";
				
            }else {
            	return "Invalid Credentials";
            }
			
		}	
		
	}
	}
	

}
