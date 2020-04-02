package com.rodrigorar.structural;

import com.rodrigorar.structural.bridge.FactoryPlatform;
import com.rodrigorar.structural.bridge.FactoryThreadScheduler;
import com.rodrigorar.structural.bridge.Platform;
import com.rodrigorar.structural.bridge.PreemptiveConfigurations;
import com.rodrigorar.structural.bridge.ThreadScheduler;
import com.rodrigorar.structural.bridge.TimeSlicedConfiguration;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class BridgePattern {
	public static void main(String[] args) {
		FactoryPlatform factoryPlatform = new FactoryPlatform();
		FactoryThreadScheduler factoryThreadScheduler = new FactoryThreadScheduler();

		Platform platform1 = factoryPlatform.get(FactoryPlatform.PlatformName.PLATFORM_1);
		ThreadScheduler schedulerPreemptive;
		schedulerPreemptive = factoryThreadScheduler.get(
				FactoryThreadScheduler.Type.PREEMPTIVE, platform1);
		PreemptiveConfigurations preemptiveConfigurations;
		preemptiveConfigurations = new PreemptiveConfigurations("thread-preemptive", 3);
		schedulerPreemptive.schedule(new Thread(), preemptiveConfigurations);

		Platform platform2 = factoryPlatform.get(FactoryPlatform.PlatformName.PLATFORM_2);
		ThreadScheduler schedulerPreemptive2;
		schedulerPreemptive2 = factoryThreadScheduler.get(
				FactoryThreadScheduler.Type.PREEMPTIVE, platform2);
		PreemptiveConfigurations preemptiveConfigurations2;
		preemptiveConfigurations2 = new PreemptiveConfigurations("thread-preemptive", 3);
		try {
			schedulerPreemptive2.schedule(new Thread(), preemptiveConfigurations2);
		} catch (Exception e) {
			System.out.println("Exception thrown for preemptive 2");
		}

		Platform platform3 = factoryPlatform.get(FactoryPlatform.PlatformName.PLATFORM_1);
		ThreadScheduler schedulerTimeSliced3;
		schedulerTimeSliced3 = factoryThreadScheduler.get(
				FactoryThreadScheduler.Type.TIME_SLICED, platform3);
		TimeSlicedConfiguration timeSlicedConfiguration;
		timeSlicedConfiguration = new TimeSlicedConfiguration(
				"thread-time-sliced"
				, 2, Instant.now().plusMillis(100)
				, Duration.of(10, ChronoUnit.MILLIS));
		schedulerTimeSliced3.schedule(new Thread(), timeSlicedConfiguration);

		Platform platform4 = factoryPlatform.get(FactoryPlatform.PlatformName.PLATFORM_2);
		ThreadScheduler schedulerTimeSliced4;
		schedulerTimeSliced4 = factoryThreadScheduler.get(
				FactoryThreadScheduler.Type.TIME_SLICED, platform4);
		TimeSlicedConfiguration timeSlicedConfiguration2;
		timeSlicedConfiguration2 = new TimeSlicedConfiguration(
				"thread-time-sliced"
				, 2, Instant.now().plusMillis(10000)
				, Duration.of(5000, ChronoUnit.MILLIS));
		try {
			schedulerTimeSliced4.schedule(new Thread(), timeSlicedConfiguration2);
		} catch (Exception e) {
			System.out.println("Exception throw for time-sliced-2");
		}
	}
}
