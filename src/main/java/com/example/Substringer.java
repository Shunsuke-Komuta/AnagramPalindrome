package com.example;

import java.util.ArrayList;

public class Substringer {

  public ArrayList<String> createSubstringList(String string) {
    ArrayList<String> substringList = new ArrayList<String>();

    int length = string.length();
    int beginIndex = 0;
    int endIndex = 0;

    for (int i = 0; i < length; i++) {
      beginIndex = 0;
      endIndex = i + 1;
      do {
        substringList.add(string.substring(beginIndex, endIndex));
        ++beginIndex;
        ++endIndex;
      } while (endIndex <= length);
    }
    return substringList;
  }
}
