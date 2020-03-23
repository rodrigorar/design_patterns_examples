package com.rodrigorar.creational;

import java.math.BigDecimal;

import com.rodrigorar.creational.factory_method.Product;

public class FactoryMethodPattern {
  public static void main(String[] args) {
    Product productOne;
    productOne = Product.make(Product.Type.ONE, "product-1", "product-1 description", BigDecimal.ONE);
    Product productTwo;
    productTwo = Product.make(Product.Type.TWO, "product-2", "product-2 description", new BigDecimal("2"));

    System.out.println("Product 1 : " + productOne.getClass().getSimpleName());
    System.out.println("Name: " + productOne.getName());
    System.out.println("Description: " + productOne.getDescription());
    System.out.println("Price: " + productOne.getPrice().toPlainString());

    System.out.println("Product 2 : " + productTwo.getClass().getSimpleName());
    System.out.println("Name: " + productTwo.getName());
    System.out.println("Description: " + productTwo.getDescription());
    System.out.println("Price: " + productTwo.getPrice().toPlainString());
  }
}
