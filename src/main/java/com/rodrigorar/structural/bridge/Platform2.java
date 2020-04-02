package com.rodrigorar.structural.bridge;

class Platform2 implements Platform {

	@Override
	public void runThread(Thread thread) {
		System.out.println("Started running " + thread.getName() + " in platform 2");
	}

	@Override
	public void stopThread(Thread thread) {
		System.out.println("Stopped runing " + thread.getName() + " in platform 2");
	}

	@Override
	public boolean isThreadRunning(Thread thread) {
		System.out.println("Platform 2 is thread running");
		throw new UnsupportedOperationException("Platform2 does not support this operation");
	}
}
