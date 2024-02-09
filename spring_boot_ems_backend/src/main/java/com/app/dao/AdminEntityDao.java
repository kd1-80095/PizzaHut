package com.app.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.app.entities.AdminEntity;


public interface AdminEntityDao extends JpaRepositoryImplementation<AdminEntity, Long> {
	//derived finder 
		Optional<AdminEntity> findByEmail(String email);

}
