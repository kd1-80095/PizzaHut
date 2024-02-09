package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Items")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString//(exclude = "password") // toString excluding password
public class Items extends BaseEntity {
	
	@Column(name="item_Name",length = 20, unique = true)
	private String itemName;
	@Column(name="item_Description",length = 100)
	private String itemDescription;
	@Column(name="item_Category",length = 100)
	private String category;
	@Column(name="item_Type",length = 50)
	private String type;
	private int rating;
	
	@Column(name="item_Price",length = 30)
	private float itemPrice;
	
	@Column(name ="item_Image",length = 300)
	@Lob
	private byte[] image;
	
	@ManyToOne
	@JoinColumn(name = "cart_id", nullable = false)
	private Cart mycart;
	
}

