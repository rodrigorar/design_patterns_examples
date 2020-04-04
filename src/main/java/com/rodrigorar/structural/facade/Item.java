package com.rodrigorar.structural.facade;

import java.math.BigDecimal;

class Item {
	private final String name;
	private final String description;
	private final BigDecimal price;

	Item(String name, String description, BigDecimal price) {
		this.name = name;
		this.description = description;
		this.price = price;
	}

	String getName() {
		return name;
	}

	String getDescription() {
		return description;
	}

	BigDecimal getPrice() {
		return price;
	}
}
