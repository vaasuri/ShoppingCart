package com.aasurihome.shoppingcart.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	private List<ProductQuantity> entries;
	
	public ShoppingCart() {
		entries = new ArrayList<ProductQuantity>();
	}
	
	public void add(Product product, int count) {
		ProductQuantity entry = new ProductQuantity(product, count);
		entries.add(entry);
	}

}
