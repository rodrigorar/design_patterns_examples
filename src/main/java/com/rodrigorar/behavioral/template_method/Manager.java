package com.rodrigorar.behavioral.template_method;

public class Manager extends Worker {
	@Override
	protected void work() {
		System.out.println("Doing the managing");
	}

	@Override
	protected void relax() {
		System.out.println("Doing the relaxing after doing the managing");
	}
}
