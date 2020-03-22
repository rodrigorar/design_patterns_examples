package com.rodrigorar.creational.abstract_factory;

import com.rodrigorar.creational.abstract_factory.platform_one.PlatformOne;
import com.rodrigorar.creational.abstract_factory.platform_two.PlatformTwo;

public class PlatformManager {
  public static Platform platformOne() {
    return new PlatformOne();
  }

  public static Platform platformTwo() {
    return new PlatformTwo();
  }
}
