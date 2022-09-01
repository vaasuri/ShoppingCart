package com.aasurihome.shoppingcart.util;

import org.springframework.stereotype.Component;

import com.aasurihome.shoppingcart.model.Inventory;
import com.aasurihome.shoppingcart.model.Product;

@Component
public class InventoryBuilder {
	
	private Inventory inventory;
	

	public InventoryBuilder(Inventory inventory) {
		
		this.inventory = inventory;
		
		Product iPhone = new Product(1001, "iPhone", 1000.00);
		Product camera = new Product(1002, "camera", 500.00);
		Product sdCard = new Product(1003, "SD Card", 200.00);
		Product tv = new Product(1004, "TV", 3000.00);
		
		inventory.add(tv, 3);
		inventory.add(iPhone, 20);
		inventory.add(camera, 20);
		inventory.add(sdCard, 30);

	}


	public Inventory getInventory() {
		return inventory;
	}

}
