package com.rodrigorar.structural.bridge;

public class FactoryPlatform {
	public enum PlatformName {
		PLATFORM_1, PLATFORM_2
	}

	public Platform get(PlatformName name) {
		final Platform platform;
		switch (name) {
			case PLATFORM_1:
				platform = new Platform1();
				break;
			case PLATFORM_2:
				platform = new Platform2();
				break;
			default:
				throw new UnsupportedOperationException("Unsupported platform " + name);
		}
		return platform;
	}
}
