package com.example;

import java.util.HashMap;
import java.util.Iterator;

public class Analysis {
  String substring;
  HashMap<String, Integer> table;
  
  public boolean isAnagramPalindrome(String substring) {
      HashMap<String, Integer> table = createStringsTable(substring);
      int valueOfOddChar = countOddChar(table);
      return valueOfOddChar <= 1;
  }

  public HashMap<String, Integer> createStringsTable(String substring) {
    HashMap<String, Integer> table = new HashMap<String, Integer>();
    for (int i = 0; i < substring.length(); i++) {
      char ch = substring.charAt(i);
      String key = String.valueOf(ch);
      int k = 0;

      if (table.containsKey(key)) {
        k = table.get(key);
      }
      k++;
      table.put(key, k);
    }
    return table;
  }

  public int countOddChar(HashMap<String, Integer> table) {
    int valueOfOdd = 0;

    Iterator<Integer> iterator = table.values().iterator();
    while (valueOfOdd < 2 && iterator.hasNext()) {
      if (iterator.next() % 2 == 1) {
        valueOfOdd++;
      }
    }
    return valueOfOdd;
  }

}
