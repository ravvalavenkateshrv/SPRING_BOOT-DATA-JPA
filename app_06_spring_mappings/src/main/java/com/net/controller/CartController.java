package com.net.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.net.entity.Cart;
import com.net.entity.Product;
import com.net.repository.CartRepository;

@Component
public class CartController {
	
	
	@Autowired
	private CartRepository cartRepository;
	
	public void addCartItems()
	{
		
		Product product=new Product();
		product.setProductId(11);
		product.setProductName("Mobiles");
		product.setProductPrice(100);
		
		Product product2=new Product();
		product2.setProductId(22);
		product2.setProductName("Kids");
		product2.setProductPrice(900);
		
		List<Product> productList=new ArrayList<>();
		productList.add(product2);
		productList.add( product);
		
		
		
		
		Cart cart=new Cart();
		cart.setCartId(1);
		cart.setTotalPrice(1000);
		
		cart.setProduct(List.of(product,product2));
	//	cart.setProduct(productList);
		
		cartRepository.save(cart);
		System.out.println("Successfully inserted");
	}
	
	public void getCartDetials()
	{
		Optional<Cart> carts=cartRepository.findById(1);
	     Cart cart=carts.get();
		System.out.println(cart.getCartId());
		System.out.println(cart.getTotalPrice());
	}

}
