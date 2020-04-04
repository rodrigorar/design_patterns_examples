package com.rodrigorar.structural.facade;

class Package {
	private final Item item;
	private final String address;

	Package(Item item, String address) {
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
