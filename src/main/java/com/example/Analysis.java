package com.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Analysis {
  String substring = null;

  public int result(ArrayList<String> substrings) {
    int count = 0;

    for (int i = 0; i < substrings.size(); i++) {
      substring = substrings.get(i);
    }
    count = 3;
    return count;
  }

  public HashMap<String, Integer> createOddStringsTabel(ArrayList<String> oddStrings) {
    HashMap<String, Integer> oddTable = new HashMap<String, Integer>();

    for (int i = 0; i < oddStrings.size(); i++) {
      String string = oddStrings.get(i);
      int k = 0;

      if (oddTable.containsKey(string)) {
        k = oddTable.get(string);
      }
      k++;
      oddTable.put(string, k);
    }
    return oddTable;
  }
}
