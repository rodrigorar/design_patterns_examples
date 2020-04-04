package com.rodrigorar.structural;

import com.rodrigorar.structural.facade.FacadeCustomerService;

public class FacadePattern {
	public static void main(String[] args) {
		FacadeCustomerService customerService = new FacadeCustomerService();

		// Item 1
		System.out.println("Ordering item-1");
		customerService.orderItem("item-1", "address-for-item-1");
		// Item 2
		System.out.println("\n\n Ordering item-2");
		customerService.orderItem("item-2", "address-for-item-2");
		// Item 3
		System.out.println("\n\n Ordering item-3");
		customerService.orderItem("item-3", "address-for-item-3");
		// Invalid item
		System.out.println("\n\n Ordering invalid item");
		customerService.orderItem("item-10291", "address-for-item-3");
	}
}
