package com.rodrigorar.structural;

import com.rodrigorar.structural.decorator.House;
import com.rodrigorar.structural.decorator.HouseCore;
import com.rodrigorar.structural.decorator.LeavingRoom;
import com.rodrigorar.structural.decorator.Kitchen;

public class DecoratorPattern {
	public static void main(String[] args) {
		House house = new Kitchen(new LeavingRoom(new HouseCore()));
		house.layout();
	}
}
