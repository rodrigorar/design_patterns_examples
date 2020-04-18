package com.rodrigorar.behavioral.state;

public class LightSwitch {
	private State currentState;

	public LightSwitch() {
		this.currentState = new StateOff();
	}

	void setState(State state) {
		this.currentState = state;
	}

	public void push() {
		this.currentState.push(this);
	}
}
