package com.rodrigorar.behavioral.state;

public class StateOn extends State {

	public StateOn() {
		System.out.println("Light switch on");
	}

	@Override
	void push(LightSwitch machine) {
		machine.setState(new StateOff());
	}
}
