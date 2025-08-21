package com.net.page_sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.hibernate.query.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

@Component
public class PageAndSortOperations {
	
	
	
	@Autowired
	private ProductRepository productRepository;
	
	public void addEmployee()
	{
		List<Product> products = new ArrayList<>();

		Product p1 = new Product();
		p1.setId(1);
		p1.setName("Laptop");
		p1.setPrice("75000");
		products.add(p1);

		Product p2 = new Product();
		p2.setId(2);
		p2.setName("Smartphone");
		p2.setPrice("30000");
		products.add(p2);

		Product p3 = new Product();
		p3.setId(3);
		p3.setName("Headphones");
		p3.setPrice("2500");
		products.add(p3);

		Product p4 = new Product();
		p4.setId(4);
		p4.setName("Keyboard");
		p4.setPrice("1500");
		products.add(p4);

		Product p5 = new Product();
		p5.setId(5);
		p5.setName("Mouse");
		p5.setPrice("800");
		products.add(p5);

		Product p6 = new Product();
		p6.setId(6);
		p6.setName("Monitor");
		p6.setPrice("12000");
		products.add(p6);

		Product p7 = new Product();
		p7.setId(7);
		p7.setName("Printer");
		p7.setPrice("9000");
		products.add(p7);

		Product p8 = new Product();
		p8.setId(8);
		p8.setName("Tablet");
		p8.setPrice("20000");
		products.add(p8);

		Product p9 = new Product();
		p9.setId(9);
		p9.setName("Smartwatch");
		p9.setPrice("5000");
		products.add(p9);

		Product p10 = new Product();
		p10.setId(10);
		p10.setName("External Hard Drive");
		p10.setPrice("4500");
		products.add(p10);

		// Save all to DB
		productRepository.saveAll(products);

	}
	
	public void findAllEmployeeSort()
	{
	List<Product> emp=	productRepository.findAll(Sort.by(Direction.DESC, "id"));
	emp.forEach(System.out::println);
	}
	
	
	public void pagingEmployees(int pageNumber,int recordPage)
	{
		List<Product> products=productRepository.findAll(PageRequest.of(pageNumber, recordPage)).getContent();
		products.forEach(System.out::println);
	}
	
	
	
}
