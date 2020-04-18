package com.rodrigorar.behavioral.state;

public class StateOff extends State {

	public StateOff() {
		System.out.println("Light switch off");
	}

	@Override
	void push(LightSwitch machine) {
		machine.setState(new StateOn());
	}
}
