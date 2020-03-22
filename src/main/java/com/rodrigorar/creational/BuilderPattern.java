package com.rodrigorar.creational;

import java.util.List;
import java.util.ArrayList;

import com.rodrigorar.creational.builder.Element;
import com.rodrigorar.creational.builder.Converter;
import com.rodrigorar.creational.builder.Reader;
import com.rodrigorar.creational.builder.converters.ASCIIConverter;
import com.rodrigorar.creational.builder.converters.JSONConverter;

public class BuilderPattern {
  public static void main(String[] args) {
    Element lineElement1 = new Element(Element.Type.LINE, "Line number 1");
    Element lineElement2 = new Element(Element.Type.LINE, "Line number 2");
    Element lineElement3 = new Element(Element.Type.LINE, "Line number 3");

    Element paragraphElement1 = new Element(Element.Type.PARAGRAPH, "Paragraph Element 1");
    Element paragraphElement2 = new Element(Element.Type.PARAGRAPH, "Paragraph Element 2");
    Element paragraphElement3 = new Element(Element.Type.PARAGRAPH, "Paragraph Element 3");

    Element tableElement1 = new Element(Element.Type.TABLE,"Table element 1");
    Element tableElement2 = new Element(Element.Type.TABLE, "Table element 2");
    Element tableElement3 = new Element(Element.Type.TABLE, "Table element 3");

    List<Element> elements = new ArrayList<>();
    elements.add(lineElement1);
    elements.add(lineElement2);
    elements.add(lineElement3);
    elements.add(paragraphElement1);
    elements.add(paragraphElement2);
    elements.add(paragraphElement3);
    elements.add(tableElement1);
    elements.add(tableElement2);
    elements.add(tableElement3);

    // ASCII Converter

    Reader asciiReader = new Reader(new ASCIIConverter(), elements);
    String asciiDocument = asciiReader.parseInput().getDocument();
    System.out.print("ASCII: \n" + asciiDocument);

    Reader jsonReader = new Reader(new JSONConverter(), elements);
    String jsonDocument = jsonReader.parseInput().getDocument();
    System.out.print("JSON: \n" + jsonDocument);
  }
}
