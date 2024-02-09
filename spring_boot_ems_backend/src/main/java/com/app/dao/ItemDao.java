package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entities.Items;

@Repository
public interface ItemDao extends JpaRepository<Items, Long> {
}
