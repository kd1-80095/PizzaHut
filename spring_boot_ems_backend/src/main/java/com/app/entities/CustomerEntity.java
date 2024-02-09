package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Customer")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(exclude = "password") // toString excluding password
public class CustomerEntity extends BaseEntity {
	@Column(name="First_Name",length = 20)
	private String firstName;
	@Column(name="Last_Name",length = 20)
	private String lastName;
	@Column(name="Email",length = 30, unique = true)
	private String email;
	@Column(length = 300, nullable = false)
	private String password;
	@Column(length = 300, nullable = false)
	private String address;
	@Column(length = 300, nullable = false)
	private String contactNo;
	
}

