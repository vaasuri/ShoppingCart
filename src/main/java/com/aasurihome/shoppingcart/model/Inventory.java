package com.aasurihome.shoppingcart.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Inventory {
	private List<ProductQuantity> productEntries;
	
	public Inventory() {
		productEntries = new ArrayList<ProductQuantity>();
		
	}
	
	public void add(Product product, int count) {
		ProductQuantity entry = new ProductQuantity(product, count);
		productEntries.add(entry);
		
	}

	public List<ProductQuantity> getProductEntries() {
		return productEntries;
	}
	
	
}
