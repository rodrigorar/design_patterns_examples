package com.rodrigorar.creational.builder;

import java.util.List;

public class Reader {
  private List<Element> elements;
  private Converter converter;

  public Reader(Converter converter, List<Element> elements) {
    this.elements = elements;
    this.converter = converter;
  }

  public Converter parseInput() {
    elements.forEach(element -> {
      switch (element.getType()) {
        case LINE:
          converter.makeLine(element);
          break;
        case PARAGRAPH:
          converter.makeParagraph(element);
          break;
        case TABLE:
          converter.makeTable(element);
          break;
        default:
          throw new RuntimeException("Unknown element type");
      }
    });
    return converter;
  }
}
