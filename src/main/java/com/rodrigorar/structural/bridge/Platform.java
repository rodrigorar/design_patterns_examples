package com.rodrigorar.structural.bridge;

public interface Platform {
	void runThread(Thread thread);
	void stopThread(Thread thread);
	boolean isThreadRunning(Thread thread);
}
