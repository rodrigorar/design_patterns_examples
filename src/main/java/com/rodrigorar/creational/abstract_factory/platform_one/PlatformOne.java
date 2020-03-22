package com.rodrigorar.creational.abstract_factory.platform_one;

import java.util.UUID;

import com.rodrigorar.creational.abstract_factory.Platform;
import com.rodrigorar.creational.abstract_factory.ProductOne;
import com.rodrigorar.creational.abstract_factory.ProductTwo;

public class PlatformOne implements Platform {

  @Override
  public ProductOne makeProductOne() {
    return new ProductOnePlatformOne(UUID.randomUUID());
  }

  @Override
  public ProductTwo makeProductTwo() {
    return new ProductTwoPlatformOne(UUID.randomUUID());
  }
}
