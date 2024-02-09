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
@Table(name = "Delivery_Person")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(exclude = "password")
public class DeliveryPerson extends BaseEntity {
	@Column(name="First_Name",length = 20)
	private String firstName;
	@Column(name="Last_Name",length = 20)
	private String lastName;
	@Column(name="Email",length = 30, unique = true)
	private String email;
	@Column(length = 40, nullable = false)
	private String password;
	@Column(length = 15, nullable = false)
	private String contactNo;
	private int rating;
	@Column( name ="Delivery_Boy_Status",length = 300)
	private String DeliveryBoyStatus; //available/Not available
	
	
	

}
