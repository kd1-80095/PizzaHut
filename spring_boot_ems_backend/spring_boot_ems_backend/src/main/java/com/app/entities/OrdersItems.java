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
@Table(name = "Orders_Item")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString


public class OrdersItems extends BaseEntity {
	//orderId --> fk
	//itemsId --> fk
	
	@Column(name="Unit_Price",length=100)
	private float unitPrice;
	@Column(name="Quantity",length=100)
	private int quantity;
	@Column(name="Total_Amount",length=100)
	private float totalAmount;
	
	
}
