package com.example;

import java.util.ArrayList;

public class Substringer {

  public ArrayList<String> createArrayOfSubstrings(String string) {
    ArrayList<String> substrings = new ArrayList<String>();

    int length = string.length();
    int beginIndex = 0;
    int endIndex = 0;

    for (int i = 0; i < length; i++) {
      beginIndex = 0;
      endIndex = i + 1;
      for (int k = 0; endIndex <= length; k++) {
        substrings.add(string.substring(beginIndex, endIndex));
        ++beginIndex;
        ++endIndex;
      }
    }
    return substrings;
  }
}
