package com.rodrigorar.creational.builder;

public class Element {
  public enum Type {
    LINE,
    PARAGRAPH,
    TABLE
  }

  private final Type type;
  private final String content;

  public Element(Type type, String content) {
    this.type = type;
    this.content = content;
  }

  public Type getType() {
    return this.type;
  }

  public String getContent() {
    return this.content;
  }
}
