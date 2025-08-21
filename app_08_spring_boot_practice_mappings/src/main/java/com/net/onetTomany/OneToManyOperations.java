package com.net.onetTomany;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OneToManyOperations {
	
	
	@Autowired
	private CartRepository cartRepository;
	
	public void addCartItems()
	{
		
		Product product=new Product(1,"pixel",40000);
		Product product2=new Product(2,"Iphone",50000);
		
		Cart cart=new Cart();
		cart.setId(11);
		cart.setTotalCost(50000);
		cart.setProducts(List.of(product,product2));
		
		cartRepository.save(cart);
		
		System.out.println("Successfully inserted");
		
	
	}

}
