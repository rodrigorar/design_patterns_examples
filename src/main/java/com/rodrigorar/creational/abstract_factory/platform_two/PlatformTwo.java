package com.rodrigorar.creational.abstract_factory.platform_two;

import java.util.UUID;

import com.rodrigorar.creational.abstract_factory.Platform;
import com.rodrigorar.creational.abstract_factory.ProductOne;
import com.rodrigorar.creational.abstract_factory.ProductTwo;

public class PlatformTwo implements Platform {

  @Override
  public ProductOne makeProductOne() {
    return new ProductOnePlatformTwo(UUID.randomUUID());
  }

  @Override
  public ProductTwo makeProductTwo() {
    return new ProductTwoPlatformTwo(UUID.randomUUID());
  }
}
