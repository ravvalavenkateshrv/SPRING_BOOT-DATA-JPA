package com.net.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.net.bean.Product;
import com.net.bean.Student;
import com.net.repository.ProductRepository;
import com.net.repository.StudentRepository;

@Component
public class DatabaseOperations {

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	
	public void addProduct()
	{
		Product product=new Product();
		product.setId(5);
		product.setName("venkat");
		product.setPrice(34);
		
		productRepository.save(product);
	}
	
	public void addAllProducts()
	{
		Product product=new Product();
		product.setId(6);
		product.setName("pavan");
		product.setPrice(34);
		
		Product product2=new Product();
		product2.setId(5);
		product2.setName("venkat");
		product2.setPrice(34);
		
		
		Product product3=new Product();
		product3.setId(8);
		product3.setName("mohan");
		product3.setPrice(34);
		
		
		List<Product> list=new ArrayList<>();
		list.add(product);
		list.add(product2);
		list.add(product3);
		
		productRepository.saveAll(list);
	}
	
	public void findTheProduct()
	{
		Optional<Product> optionalProduct=productRepository.findById(8);
		System.out.println(optionalProduct);
		
		Product product=optionalProduct.get();
		System.out.print(product);
		
		
	}
	
	public void findTheAllProducts()
	{
		List<Product> products=productRepository.findAll();
		
		for(Product product:products)
		{
			System.out.println(product);
		}
	}
	
	public void findTheAllbyProducts()
	{
		List<Integer> list=new ArrayList<>();
		list.add(6);
		list.add(5);
		list.add(8);
		
		List<Product> products=productRepository.findAllById(list);
		for(Product product:products)
		{
			System.out.println(product);
		}
	}
	
	public void deleteTheProduct()
	{
	 Product product=productRepository.findById(6).get();
	 
	 productRepository.delete(product);
	 
	}
	public void deleteTheProductById()
	{
	 productRepository.deleteById(5);
	 
	
	 
	}
	public void deleteTheAllProducts()
	{
	 productRepository.deleteAll();
	 
	
	 
	}
	
	
	
}
