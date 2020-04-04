package com.rodrigorar.structural.facade;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

class OrderFulfillement {
	private Map<String, Item> itemsAvailable;

	OrderFulfillement() {
		itemsAvailable = new HashMap<>();
		itemsAvailable.put("item-1", new Item("item-1", "item-1-description", new BigDecimal("1.10")));
		itemsAvailable.put("item-2", new Item("item-2", "item-2-description", new BigDecimal("3.50")));
		itemsAvailable.put("item-3", new Item("item-3", "item-3-description", new BigDecimal("2.25")));
		itemsAvailable.put("item-4", new Item("item-4", "item-4-description", new BigDecimal("4.30")));
		itemsAvailable.put("item-5", new Item("item-5", "item-5-description", new BigDecimal("2.10")));
	}

	Optional<Item> getItem(String name) {
		System.out.println("Fullfilling order for item " + name);
		return Optional.ofNullable(this.itemsAvailable.get(name));
	}

	Package packageItem(Item item, String address) {
		System.out.println("Packaging item " + item.getName());
		return new Package(item, address);
	}
}
