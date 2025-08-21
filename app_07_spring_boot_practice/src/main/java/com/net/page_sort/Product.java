package com.net.page_sort;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity

@Data
public class Product {
	
	
	@Id
	@Column(name="product_id")
	private int id;
	
	@Column(name="product_name")
	private String name;
	
	
	
	@Column(name="product_price")
	private String price;

}
