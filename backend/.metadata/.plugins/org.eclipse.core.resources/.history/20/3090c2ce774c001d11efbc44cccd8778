package com.hospital.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.support.ReflectivePropertyAccessor.OptimalPropertyAccessor;
import org.springframework.stereotype.Service;

import com.hospital.bean.Patient;
import com.hospital.repo.DoctorRepository;
import com.hospital.repo.PatientRepository;

@Service
public class DoctorService {
	@Autowired
	DoctorRepository docrepo;
	@Autowired
	PatientRepository patrepo;
	
	public List<Patient> viewPatient(int did) {
		List<Patient> result = patrepo.findByDpid(did);
		return result;
	}
	
	public List<Patient> viewAppointment(int did) {
		return patrepo.getappoinmentsByid(did);
	}
	
	public String deleteAppointment(Patient patient) {
		
	Optional<Patient> result  = patrepo.findById(patient.getPid());
	if(result.isPresent()) {
		Patient p = result.get();
		patient.setPstatus("consulted");
		patrepo.saveAndFlush(p);
		return "patient record deleted";
	
	}else {
		return "patient not found";
	}
	}
	
	public List<Patient> dischargePatientByid(int did) {
		
		return patrepo.dischargePatientByid(did);
	}
}
