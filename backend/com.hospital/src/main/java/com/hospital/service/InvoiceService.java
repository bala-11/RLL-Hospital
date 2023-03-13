package com.hospital.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.bean.Invoice;
import com.hospital.repo.InvoiceRepository;

@Service

public class InvoiceService {
	@Autowired
	InvoiceRepository invoiceRepository;
	
	
	public List<Invoice> getAll(){
		return invoiceRepository.findAll();
	}

	public String createInvoice(Invoice invoice) {
		invoiceRepository.save(invoice);
		return "Invoice created";
	}
	
	
}