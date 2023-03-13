package com.hospital.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.bean.Adminlogin;

@Repository
public interface AdminLoginRepository extends JpaRepository<Adminlogin, String> {

}
