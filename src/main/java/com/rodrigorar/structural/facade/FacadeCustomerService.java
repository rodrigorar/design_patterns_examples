package com.rodrigorar.structural.facade;

import com.rodrigorar.structural.bridge.FactoryThreadScheduler;

import java.util.Optional;

public class FacadeCustomerService {
	private final OrderFulfillement orderFulfillement;
	private final BillingFulfillement billingFulfillement;
	private final ShippingFulfillement shippingFulfillement;

	public FacadeCustomerService() {
		this.orderFulfillement = new OrderFulfillement();
		this.billingFulfillement = new BillingFulfillement();
		this.shippingFulfillement = new ShippingFulfillement();
	}

	public void orderItem(String name, String address) {
		System.out.println("Talking to order fulfillement");
		Optional<Item> item = this.orderFulfillement.getItem(name);
		if (item.isPresent()) {
			Package aPackage = this.orderFulfillement.packageItem(item.get(), address);
			this.billingFulfillement.billItem(item.get(), address);
			this.shippingFulfillement.ship(aPackage);
		} else {
			System.out.println("There is no package " + name);
		}
	}
}
