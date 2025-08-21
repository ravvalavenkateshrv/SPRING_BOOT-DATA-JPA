package com.net.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.net.bean.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
