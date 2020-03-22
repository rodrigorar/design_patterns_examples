package com.rodrigorar.creational.abstract_factory.platform_two;

import java.util.UUID;

import com.rodrigorar.creational.abstract_factory.ProductTwo;

public class ProductTwoPlatformTwo implements ProductTwo {
  private final UUID id;

  public ProductTwoPlatformTwo(UUID id) {
    this.id = id;
  }

  @Override
  public UUID id() {
    return this.id;
  }
}
