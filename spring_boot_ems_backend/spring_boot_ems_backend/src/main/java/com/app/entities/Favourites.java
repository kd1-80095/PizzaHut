package com.app.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Table (name = "Favourites")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Favourites extends BaseEntity {
	
	
	//private CustomerEntity customerId;
	
	private String sample;
	//private Items itemId;
	
	
	
	
	
	
}