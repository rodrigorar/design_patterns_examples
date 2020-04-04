package com.rodrigorar.structural.facade;

class BillingFulfillement {

	Bill billItem(Item item, String address) {
		System.out.println("Billing for item " + item.getName() + " to address " + address);
		return new Bill(item, address);
	}
}
