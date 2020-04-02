package com.rodrigorar.structural.bridge;

abstract class AbstractThreadScheduler<T> implements ThreadScheduler<T> {
	protected Platform platform;

	AbstractThreadScheduler(Platform platform) {
		this.platform = platform;
	}

	protected abstract void configure(Thread thread, T configurations);

	protected abstract void doSchedule(Thread thread, T configurations);

	@Override
	public void schedule(Thread thread, T configurations) {
		configure(thread, configurations);
		doSchedule(thread, configurations);
	}
}
