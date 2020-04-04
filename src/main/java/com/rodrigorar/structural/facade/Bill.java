package com.rodrigorar.structural.facade;

class Bill {
	private final Item item;
	private final String address;

	Bill(Item item, String address) {
		this.item = item;
		this.address = address;
	}

	Item getItem() {
		return item;
	}

	String getAddress() {
		return address;
	}
}
