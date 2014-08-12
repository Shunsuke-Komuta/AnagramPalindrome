package com.example;

import java.util.ArrayList;

public class Executor {

  static Substringer substringer = new Substringer();
  static Analysis analysis = new Analysis();

  public int[] getResult(String[] array) {
    int[] result = new int[array.length];

    for (int i = 0; i < array.length; i++) {
      ArrayList<String> substringList = substringer.createSubstringList(array[i]);
      int count = analysis.result(substringList);
      result[i] = count;
    }
    return result;
  }
}
