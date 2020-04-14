package com.rodrigorar.behavioral.mediator;

public class Consumer {
	private final Mediator<String> mediator;

	public Consumer(Mediator<String> mediator) {
		this.mediator = mediator;
	}

	public void consume() {
		String value = this.mediator.retrieve();
		System.out.println("Retrived value: " + value);
	}
}
