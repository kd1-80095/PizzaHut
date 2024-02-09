package com.app.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "cart")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString//(exclude = "password") // toString excluding password
public class Cart extends BaseEntity {
	
	
	 @OneToMany(mappedBy = "mycart",cascade=CascadeType.ALL,orphanRemoval = true)
	//@OneToMany(cascade=CascadeType.ALL)
	// @JoinColumn(name ="item_id")     
	private List<Items> item=new ArrayList<Items>();
	
	 @OneToOne
	 @JoinColumn(name ="customer_id",nullable =false)
     private CustomerEntity customerId;
	 
	@Column(name="quantity")
	private int quantity;
	 
	@Column(name="total_amount")
	private double totalAmount;
	
	@Column(name="unit_price")
	private double unitPrice;
	
	
}

