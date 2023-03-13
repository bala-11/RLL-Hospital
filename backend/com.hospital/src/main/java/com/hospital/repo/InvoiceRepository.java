package com.hospital.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.bean.Invoice;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Integer>{
}
