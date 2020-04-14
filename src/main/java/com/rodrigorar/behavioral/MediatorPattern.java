package com.rodrigorar.behavioral;

import com.rodrigorar.behavioral.mediator.Consumer;
import com.rodrigorar.behavioral.mediator.Mediator;
import com.rodrigorar.behavioral.mediator.Producer;

public class MediatorPattern {
	public static void main(String[] args) {
		Mediator<String> mediator = new Mediator<>();
		Producer producer = new Producer(mediator);
		Consumer consumer = new Consumer(mediator);

		producer.produce();
		consumer.consume();
		producer.produce();
		consumer.consume();
		producer.produce();
		consumer.consume();
	}
}
