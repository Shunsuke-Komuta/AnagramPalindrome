package com.example;

import java.util.ArrayList;


public class Substringer {

  public ArrayList<String> createArrayOfSubstrings(String string) {
    ArrayList<String> substrings = new ArrayList<String>();

    int j = string.length();
    int beginIndex = 0;
    int endIndex = 0;

    for (int i = 0; i < j; i++) {
      beginIndex = 0;
      endIndex = i;
      for (i = 0; i < j; i++) {

        if (endIndex == j) {
          substrings.add(string.substring(beginIndex));
          System.out.println(string.substring(beginIndex));
        } else {
          substrings.add(string.substring(beginIndex, endIndex));
          System.out.println(string.substring(beginIndex, endIndex));
        }
        ++beginIndex;
        ++endIndex;
      }
    }
    return substrings;

  }
}
