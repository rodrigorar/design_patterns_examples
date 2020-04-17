package com.rodrigorar.behavioral.observer;

public class ObserverOne implements Observer {
	private final Subject subject;

	public ObserverOne(Subject subject) {
		this.subject = subject;
		subject.addObserver(this);
	}

	@Override
	public void update() {
		String state = this.subject.getState();
		System.out.println("Observer One Loaded: " + state);
	}
}
