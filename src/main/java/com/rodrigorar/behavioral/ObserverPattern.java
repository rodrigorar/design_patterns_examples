package com.rodrigorar.behavioral;

import com.rodrigorar.behavioral.observer.Observer;
import com.rodrigorar.behavioral.observer.ObserverOne;
import com.rodrigorar.behavioral.observer.ObserverTwo;
import com.rodrigorar.behavioral.observer.Subject;

public class ObserverPattern {
	public static void main(String[] args) {
		Subject subject = new Subject();
		Observer observerOne = new ObserverOne(subject);
		Observer observerTwo = new ObserverTwo(subject);

		subject.setState("state-change-1");
		subject.setState("state-change-2");
		subject.setState("state-change-3");
	}
}
