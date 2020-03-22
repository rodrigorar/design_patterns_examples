package com.rodrigorar.creational.abstract_factory.platform_one;

import java.util.UUID;

import com.rodrigorar.creational.abstract_factory.ProductOne;

public class ProductOnePlatformOne implements ProductOne {
  private final UUID id;

  public ProductOnePlatformOne(UUID id) {
    this.id = id;
  }

  @Override
  public UUID id() {
    return this.id;
  }
}
