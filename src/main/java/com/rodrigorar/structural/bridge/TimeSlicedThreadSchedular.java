package com.rodrigorar.structural.bridge;

import java.time.Instant;

class TimeSlicedThreadSchedular extends AbstractThreadScheduler<TimeSlicedConfiguration> {

	TimeSlicedThreadSchedular(Platform platform) {
		super(platform);
	}

	@Override
	protected void configure(Thread thread, TimeSlicedConfiguration configurations) {
		thread.setName(configurations.getName());
		thread.setPriority(configurations.getPriority());
	}

	@Override
	protected void doSchedule(Thread thread, TimeSlicedConfiguration configurations) {
		System.out.println("Start Time: " + configurations.getStartTime().toString());
		System.out.println("End Time: " + configurations.getStartTime().plusMillis(configurations.getInterval().toMillis()).toString());
		while(true) {
			if (configurations.getStartTime().isAfter(Instant.now())
					&& configurations.getStartTime().plusMillis(configurations.getInterval().toMillis()).isBefore(Instant.now())
					&& ! platform.isThreadRunning(thread)) {
				System.out.println("Start thread time sliced");
				platform.runThread(thread);
			}
			if (configurations.getStartTime().plusMillis(configurations.getInterval().toMillis()).isAfter(Instant.now())
					&& platform.isThreadRunning(thread)) {
				platform.stopThread(thread);
				System.out.println("Stopping thread time sliced");
				break;
			}
		}
	}
}
