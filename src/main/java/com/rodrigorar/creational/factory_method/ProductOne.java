package com.rodrigorar.creational.factory_method;

import java.math.BigDecimal;

public class ProductOne extends Product {
  private final String name;
  private final String description;
  private BigDecimal price;

  public ProductOne(String name, String description, BigDecimal price) {
    this.name = name;
    this.description = description;
    this.price = price;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public String getDescription() {
    return this.description;
  }

  @Override
  public BigDecimal getPrice() {
    return this.price;
  }
}
