package com.rodrigorar.behavioral.observer;

import java.util.LinkedList;
import java.util.List;

public class Subject {
	private final List<Observer> observers;
	private String state;

	public Subject() {
		this.observers = new LinkedList<>();
	}

	public void addObserver(Observer observer) {
		this.observers.add(observer);
	}

	private void update() {
		this.observers.forEach(Observer::update);
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
		this.update();
	}
}
