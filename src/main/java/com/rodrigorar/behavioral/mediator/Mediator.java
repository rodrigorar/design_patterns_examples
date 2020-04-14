package com.rodrigorar.behavioral.mediator;

import java.util.concurrent.atomic.AtomicReference;

public class Mediator<T> {
	private AtomicReference<T> reference;

	public Mediator() {
		this.reference = new AtomicReference<>();
	}

	public synchronized void store(T value) {
		this.reference.set(value);
	}

	public synchronized T retrieve() {
		return this.reference.get();
	}
}
