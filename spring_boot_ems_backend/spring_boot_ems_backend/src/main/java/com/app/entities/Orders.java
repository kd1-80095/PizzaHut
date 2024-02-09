package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Orders")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString


public class Orders extends BaseEntity {
	
	//customerID FK
	@Column(name="Order_Total",length=100)
	private float orderTotal;
	@Column(name="Order_Time",length=100)
	private LocalDate oTime;
	@Column(name="Delivery_Time",length=100)
	private LocalDate dTime;
	private String status; //delivered or not delivered
	

}
