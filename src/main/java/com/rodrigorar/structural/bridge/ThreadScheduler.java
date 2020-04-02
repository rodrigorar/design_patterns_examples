package com.rodrigorar.structural.bridge;

public interface ThreadScheduler<T> {
	void schedule(Thread thread, T configurations);
}
