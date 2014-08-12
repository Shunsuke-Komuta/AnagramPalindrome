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

  public HashMap<String, Integer> createStringsTable(String substring) {
    HashMap<String, Integer> oddTable = new HashMap<String, Integer>();
    int k = 0;
    String key = null;

    for (int i = 0; i < substring.length(); i++) {
      char ch = substring.charAt(i);
      key = String.valueOf(ch);
      k = 0;

      if (oddTable.containsKey(key)) {
        k = oddTable.get(key);
      }
      k++;
      oddTable.put(key, k);
    }
    return oddTable;
  }
}
