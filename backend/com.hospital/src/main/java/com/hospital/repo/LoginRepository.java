package com.hospital.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hospital.bean.Login;
@Repository
public interface LoginRepository extends JpaRepository<Login, String> {
	@Query("select l from Login l where l.emailid = :emailid")
	Optional<Login> findByEmail(String emailid);

}
