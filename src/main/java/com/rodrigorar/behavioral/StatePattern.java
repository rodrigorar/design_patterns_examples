package com.rodrigorar.behavioral;

import com.rodrigorar.behavioral.state.LightSwitch;

public class StatePattern {
	public static void main(String[] args) {
		LightSwitch lightSwitch = new LightSwitch();
		lightSwitch.push();
		lightSwitch.push();
		lightSwitch.push();
	}
}
