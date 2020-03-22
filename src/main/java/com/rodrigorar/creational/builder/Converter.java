package com.rodrigorar.creational.builder;

public interface Converter {
  void makeLine(Element element);
  void makeParagraph(Element element);
  void makeTable(Element table);
  String getDocument();
}
