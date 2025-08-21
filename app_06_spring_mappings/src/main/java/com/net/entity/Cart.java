package com.net.entity;

import java.util.List;

import org.hibernate.annotations.Cascade;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="cart_mapping")
@Data

public class Cart {
	
	@Id
	private int cartId;
	private int totalPrice;
	
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="cart_id")
	private List<Product> product;
	
	

	
	
}
