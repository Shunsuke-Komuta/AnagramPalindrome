package com.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Analysis {
  String substring = null;
  HashMap<String, Integer> table = null;

  public int result(ArrayList<String> List) {
    int count = 0;
    int valueOfOddChar = 0;

    for (int i = 0; i < List.size(); i++) {
      substring = List.get(i);
      HashMap<String, Integer> table = createStringsTable(substring);
      valueOfOddChar = countOddChar(table);

      if (substring.length() % 2 == 1 && valueOfOddChar == 1) {
        count++;
      }
      if (substring.length() % 2 == 0 && valueOfOddChar == 0) {
        count++;
      }
    }
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

  public int countOddChar(HashMap<String, Integer> table) {
    int valueOfOdd = 0;

    for (String key : table.keySet()) {
      if (table.get(key) % 2 == 1) {
        valueOfOdd++;
      }
    }
    return valueOfOdd;
  }

}
