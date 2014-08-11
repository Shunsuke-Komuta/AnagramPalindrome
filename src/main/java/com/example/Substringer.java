package com.example;

import java.util.ArrayList;


public class Substringer {

  public ArrayList<String> substringsOfOddAndEven(String string) {
    ArrayList<String> substringsOfOdd = new ArrayList<String>();
    ArrayList<String> substringsOfEven = new ArrayList<String>();

    int n = 0;

    for (int beginIndex = 0; beginIndex <= string.length(); beginIndex++) {
      ++n;
      for (int endIndex = 2 * n + 1; endIndex <= string.length(); endIndex +) {
        String substring = null;

        if (endIndex == string.length()) {
          substring = string.substring(beginIndex);
        } else {
          substring = string.substring(beginIndex, endIndex);
        }
        substrings.add(substring);
      }
    }
    return substrings;
  }
}
