package com.rodrigorar.behavioral;

import com.rodrigorar.behavioral.strategy.FactoryService;
import com.rodrigorar.behavioral.strategy.Service;

public class StrategyPattern {
	public static void main(String[] args) {
		Service<Boolean> serviceOne = FactoryService.serviceOne("test-1");
		Boolean serviceOneExecuted = serviceOne.execute();
		if (serviceOneExecuted) {
			System.out.println("Service one has executed successfully");
		}

		Service<String> serviceTwo = FactoryService.serviceTwo(true);
		String serviceTwoExecutedResult = serviceTwo.execute();
		System.out.println(serviceTwoExecutedResult);
		Service<String> serviceTwoQuiet = FactoryService.serviceTwo(false);
		String serviceTwoQuietResult = serviceTwoQuiet.execute();
		System.out.println(serviceTwoQuietResult);
	}
}
