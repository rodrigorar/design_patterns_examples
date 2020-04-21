package com.rodrigorar.behavioral.template_method;

public abstract class Worker {

	protected void getUp() {
		System.out.println("Getting up");
	}

	protected void eatBreakfast() {
		System.out.println("Eating breakfast");
	}

	protected void goToWork() {
		System.out.println("Going to work");
	}

	protected abstract void work();

	protected void returnToHome() {
		System.out.println("Returning home");
	}

	protected void relax() {
		System.out.println("Relaxing");
	}

	protected final void sleep() {
		System.out.println("Sleeping");
	}

	public final void dailyRoutine() {
		getUp();
		eatBreakfast();
		goToWork();
		work();
		returnToHome();
		relax();
		sleep();
	}
}
