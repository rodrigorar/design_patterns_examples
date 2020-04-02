package com.rodrigorar.structural.bridge;

import java.time.Duration;
import java.time.Instant;

public class TimeSlicedConfiguration {
	private String name;
	private int priority;
	private Instant startTime;
	private Duration interval;

	public TimeSlicedConfiguration(String name, int priority, Instant startTime, Duration interval) {
		this.name = name;
		this.priority = priority;
		this.startTime = startTime;
		this.interval = interval;
	}

	public String getName() {
		return name;
	}

	public int getPriority() {
		return priority;
	}

	public Instant getStartTime() {
		return startTime;
	}

	public Duration getInterval() {
		return interval;
	}
}