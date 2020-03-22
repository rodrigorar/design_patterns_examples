package com.rodrigorar.creational;

import com.rodrigorar.creational.abstract_factory.Platform;
import com.rodrigorar.creational.abstract_factory.ProductOne;
import com.rodrigorar.creational.abstract_factory.ProductTwo;
import com.rodrigorar.creational.abstract_factory.PlatformManager;

public class AbstractFactoryPattern {
  public static void main(String[] args) {
    // Platform One

    Platform platform1 = PlatformManager.platformOne();
    ProductOne product1Platform1 = platform1.makeProductOne();
    System.out.println("Product 1 Platform 1: " + product1Platform1.id());
    ProductTwo product2Platform1 = platform1.makeProductTwo();
    System.out.println("Product 2 Platform 1: " + product2Platform1.id());

    // Platform Two

    Platform platform2 = PlatformManager.platformTwo();
    ProductOne product1Platform2 = platform2.makeProductOne();
    System.out.println("Product 1 Platform 2: " + product1Platform2.id());
    ProductTwo product2Platform2 = platform2.makeProductTwo();
    System.out.println("Product 2 Platform 2: " + product2Platform2.id());
  }
}
