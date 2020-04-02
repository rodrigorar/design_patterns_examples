package com.rodrigorar.structural.bridge;

public class FactoryThreadScheduler {
	public enum Type {
		PREEMPTIVE, TIME_SLICED
	}

	public ThreadScheduler get(Type type, Platform platform) {
		final ThreadScheduler threadScheduler;
		switch (type) {
			case PREEMPTIVE:
				threadScheduler = new PreemptiveThreadScheduler(platform);
				break;
			case TIME_SLICED:
				threadScheduler = new TimeSlicedThreadSchedular(platform);
				break;
			default:
				throw new UnsupportedOperationException();
		}
		return threadScheduler;
	}
}
