package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "feedback")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Feedback extends BaseEntity {
	

	// Customer ID FK
//	 @ManyToOne
//	 @JoinColumn(name ="customer_id",nullable =false)
//	 private CustomerEntity customerId;

	@Column(name="suggetion",length = 50)
	private String suggestion;
}
