package com.net.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="product_mapping")
@Data
public class Product {
	
	
	@Id
	private int productId;
	private String productName;
	private int productPrice;

}
