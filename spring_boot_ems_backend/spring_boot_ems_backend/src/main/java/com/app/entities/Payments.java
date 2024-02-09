package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Payments")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Payments extends BaseEntity {
	//ordersId --> FK
	@Column( name= "Payment_Method",length = 20, nullable = false)
	private String paymentMethod;
	@Column( name= "Transaction_Id",length = 20, nullable = false)
	private String transactionId;
	
}
