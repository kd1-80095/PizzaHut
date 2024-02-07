package com.app.dao;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.CustomerEntity;
import com.app.entities.CustomerEntity;

public interface CustomerEntityDao extends JpaRepository<CustomerEntity,Long>{
//derived finder 
	Optional<CustomerEntity> findByEmail(String email);
}