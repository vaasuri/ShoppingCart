package com.aasurihome.shoppingcart;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.aasurihome.shoppingcart.model.Inventory;
import com.aasurihome.shoppingcart.model.ProductQuantity;
import com.aasurihome.shoppingcart.util.InventoryBuilder;

@SpringBootApplication
public class ShoppingCartApplication {

	public static void main(String[] args) {
		ApplicationContext factory = SpringApplication.run(ShoppingCartApplication.class, args);
		
		InventoryBuilder builder = factory.getBean(InventoryBuilder.class);
		
		Inventory inventory = builder.getInventory();
		List<ProductQuantity> productEntries = inventory.getProductEntries();
		
		for (ProductQuantity pq : productEntries) {
			System.out.println(pq.getProduct().getName() + " : " + pq.getProduct().getPrice() + " : " + pq.getCount());
		}
		
		System.out.println("Exiting Application!");
	}

}
