package com.rodrigorar.creational.abstract_factory.platform_one;

import java.util.UUID;

import com.rodrigorar.creational.abstract_factory.ProductTwo;

public class ProductTwoPlatformOne implements ProductTwo {
  private final UUID id;

  public ProductTwoPlatformOne(UUID id) {
    this.id = id;
  }

  @Override
  public UUID id() {
    return this.id;
  }
}
