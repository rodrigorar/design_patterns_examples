package com.rodrigorar.behavioral;

import com.rodrigorar.behavioral.template_method.Lumberjack;
import com.rodrigorar.behavioral.template_method.Manager;
import com.rodrigorar.behavioral.template_method.Postman;
import com.rodrigorar.behavioral.template_method.Worker;

public class TemplateMethodPattern {
	public static void main(String[] args) {
		System.out.println("Lumberjack: ");
		Worker lumberJack = new Lumberjack();
		lumberJack.dailyRoutine();

		System.out.print("\nPostman: ");
		Worker postman = new Postman();
		postman.dailyRoutine();

		System.out.println("\nManager: ");
		Worker manager = new Manager();
		manager.dailyRoutine();
	}
}
