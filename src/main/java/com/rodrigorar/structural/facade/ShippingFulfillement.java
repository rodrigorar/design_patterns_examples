package com.rodrigorar.structural.facade;

import java.util.LinkedList;
import java.util.List;

class ShippingFulfillement {
	private final List<Package> shippedItems;

	ShippingFulfillement() {
		this.shippedItems = new LinkedList<>();
	}

	void ship(Package aPackage) {
		System.out.println("Shipping item " + aPackage.getItem().getName() + " to address " + aPackage.getAddress());
	}
}
