package com.rodrigorar.behavioral.mediator;

public class Producer {
	private final Mediator<String> mediator;
	private int index;

	public Producer(Mediator<String> mediator) {
		this.mediator = mediator;
		this.index = 0;
	}

	public void produce() {
		this.mediator.store("Production value " + index);
		index++;
	}
}
