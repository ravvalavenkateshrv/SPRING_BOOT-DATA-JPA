package com.net.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.net.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer> {

}
