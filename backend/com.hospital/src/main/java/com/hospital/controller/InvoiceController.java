package com.hospital.controller;
import java.util.List;

import javax.management.AttributeNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.bean.Invoice;
import com.hospital.repo.InvoiceRepository;
import com.hospital.service.InvoiceService;
//import com.hospital.service.InvoiceService;
@RestController
@CrossOrigin
@RequestMapping(value  ="admin/api")
public class InvoiceController {
	@Autowired
	InvoiceService invoiceService;
	
	@GetMapping(value = "viewInvoices",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Invoice> getAllInvoices(){
		return invoiceService.getAll();
	}
	
	@PostMapping(value = "createInvoices", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String  createInvoice(@RequestBody Invoice invoice) {
		return invoiceService.createInvoice(invoice);
	}
	
//	@GetMapping("/invoice/{id}")
//	public ResponseEntity<Invoice> getInvoiceById(@PathVariable int id) throws AttributeNotFoundException {
//		
//		Invoice invoice = invoiceRepository.findById(id)
//				.orElseThrow(() -> new AttributeNotFoundException("Not found" + id));
//		
//		return ResponseEntity.ok(invoice);
//	}
//	
	

}
