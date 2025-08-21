package com.net.entity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.net.entity.Product;
import com.net.repository.ProductRepository;


@Component
public class ProductController {

	
	@Autowired
	private ProductRepository productRepository;
	
	public void addEmployee()
	{
		Product product=new Product();
		product.setName("pixel");
		product.setPrice("30k");
		
		productRepository.save(product);
		
		System.out.println("Succesfulyy inserted");
	}
	
	public void findAllProducts()
	{
		List<Product> products=productRepository.findAllProducts();
		products.forEach(System.out::println);
	}
}
