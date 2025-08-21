package com.net.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.net.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	
	@Query(value="select p from Product p",nativeQuery=false)
	public List<Product> findAllProducts();

}
