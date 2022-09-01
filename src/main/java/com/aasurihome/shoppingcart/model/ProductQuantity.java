package com.aasurihome.shoppingcart.model;

public class ProductQuantity {

	private Product product;
	private int count;
	
	public ProductQuantity() {
		
	}
	public ProductQuantity(Product product, int count) {
		this.product = product;
		this.count = count;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
}
