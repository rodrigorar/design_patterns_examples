package com.rodrigorar.creational.factory_method;

import java.math.BigDecimal;

public abstract class Product {
  public enum Type {
    ONE,
    TWO
  }

  public abstract String getName();
  public abstract String getDescription();
  public abstract BigDecimal getPrice();

  public static final Product make(
    Type type,
    String name,
    String description,
    BigDecimal price) {

      final Product result;
      switch (type) {
        case ONE:
          result = new ProductOne(name, description, price);
          break;
        case TWO:
          result = new ProductTwo(name, description, price);
          break;
        default:
          throw new RuntimeException("Unknown product type");
      }
      return result;
  }
}
