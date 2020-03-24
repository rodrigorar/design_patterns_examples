package com.rodrigorar.creational;

import com.rodrigorar.creational.singleton.Government;

public class SingletonPattern {
	public static void main(String[] args) {
		System.out.println("Creation PS Government");
		Government psGovernment = Government.getInstance("PS - Government");
		System.out.println("Current Government: " + psGovernment.getName());

		System.out.println("Trying to create a PSD governement");
		Government psdGovernment = Government.getInstance("PSD - Government");
		System.out.println("Current Government: " + psdGovernment.getName());
	}
}
