package com.rodrigorar.creational.builder.converters;

import com.rodrigorar.creational.builder.Converter;
import com.rodrigorar.creational.builder.Element;

public class JSONConverter implements Converter {
  private StringBuilder lineBuilder;
  private StringBuilder paragraphBuilder;
  private StringBuilder tableBuilder;

  public JSONConverter() {
    this.lineBuilder = new StringBuilder();
    this.lineBuilder.append("lines: [");

    this.paragraphBuilder = new StringBuilder();
    this.paragraphBuilder.append("paragraphs: [");

    this.tableBuilder = new StringBuilder();
    this.tableBuilder.append("tables: [");
  }

  @Override
  public void makeLine(Element element) {
    this.lineBuilder.append("{\n");
    this.lineBuilder.append("\"line\":\"");
    this.lineBuilder.append(element.getContent());
    this.lineBuilder.append("\"\n},\n");
  }

  @Override
  public void makeParagraph(Element element) {
    this.paragraphBuilder.append("{\n");
    this.paragraphBuilder.append("\"paragraph\":\"");
    this.paragraphBuilder.append(element.getContent());
    this.paragraphBuilder.append("\"\n},\n");
  }

  @Override
  public void makeTable(Element element) {
    this.tableBuilder.append("\n");
    this.tableBuilder.append("\"table\":\"");
    this.tableBuilder.append(element.getContent());
    this.tableBuilder.append("\"\n},\n");
  }

  @Override
  public String getDocument() {
    this.lineBuilder.append("\n]");
    this.paragraphBuilder.append("\n]");
    this.tableBuilder.append("\n]");
    return new StringBuilder()
      .append("{\n")
      .append(this.lineBuilder.toString()).append(",\n")
      .append(this.paragraphBuilder.toString()).append(",\n")
      .append(this.tableBuilder.toString()).append("\n}")
      .toString();
  }

}
