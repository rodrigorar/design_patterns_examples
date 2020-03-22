package com.rodrigorar.creational.builder.converters;

import com.rodrigorar.creational.builder.Converter;
import com.rodrigorar.creational.builder.Element;

public class ASCIIConverter implements Converter {
    private StringBuilder builder;

    public ASCIIConverter() {
      this.builder = new StringBuilder();
    }

    @Override
    public void makeLine(Element element) {
      this.builder.append(element.getContent());
      this.builder.append(".\n");
    }

    @Override
    public void makeParagraph(Element element) {
      this.builder.append("\n");
      this.builder.append(element.getContent());
      this.builder.append(".\n\n");
    }

    @Override
    public void makeTable(Element element) {
      this.builder.append("------------------------------------------------------\n");
      this.builder.append(element.getContent());
      this.builder.append("\n------------------------------------------------------\n");
    }

    @Override
    public String getDocument() {
      return this.builder.toString();
    }

}
