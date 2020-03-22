package com.rodrigorar.creational.abstract_factory.platform_two;

import java.util.UUID;

import com.rodrigorar.creational.abstract_factory.ProductOne;

public class ProductOnePlatformTwo implements ProductOne {
  private final UUID id;

  public ProductOnePlatformTwo(UUID id) {
    this.id = id;
  }

  @Override
  public UUID id() {
    return this.id;
  }
}
