package com.rodrigorar.structural.bridge;

import java.util.LinkedList;
import java.util.List;

class Platform1 implements Platform {
	private List<Thread> runningThreads = new LinkedList<>();

	@Override
	public void runThread(Thread thread) {
		System.out.println("Started running in platform1 thread " + thread.getName());
		this.runningThreads.add(thread);
	}

	@Override
	public void stopThread(Thread thread) {
		System.out.println("Stopped running in plateform1 thread " + thread.getName());
		this.runningThreads.remove(thread);
	}

	@Override
	public boolean isThreadRunning(Thread thread) {
		return this.runningThreads.contains(thread);
	}
}
