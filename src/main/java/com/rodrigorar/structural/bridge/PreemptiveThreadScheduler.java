package com.rodrigorar.structural.bridge;

class PreemptiveThreadScheduler extends AbstractThreadScheduler<PreemptiveConfigurations> {

	PreemptiveThreadScheduler(Platform platform) {
		super(platform);
	}

	@Override
	protected void configure(Thread thread, PreemptiveConfigurations configurations) {
		thread.setName(configurations.getName());
		thread.setPriority(configurations.getPriority());
	}

	@Override
	protected void doSchedule(Thread thread, PreemptiveConfigurations configurations) {
		platform.runThread(thread);
	}
}
