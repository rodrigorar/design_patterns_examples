package com.rodrigorar.behavioral.observer;

public class ObserverTwo implements Observer {
	private final Subject subject;

	public ObserverTwo(Subject subject) {
		this.subject = subject;
		subject.addObserver(this);
	}

	@Override
	public void update() {
		String state = this.subject.getState();
		System.out.println("Observer Two loaded state: " + state);
	}
}
