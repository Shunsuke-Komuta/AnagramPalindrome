package com.example;

import java.util.ArrayList;

public class Executor {

  public int[] getCounts(String[] array) {
    int[] result = new int[array.length];
    Substringer substringer = new Substringer();
    Analysis analysis = new Analysis();

    for (int i = 0; i < array.length; i++) {
      ArrayList<String> substringList = substringer.createSubstringList(array[i]);
      int count = analysis.result(substringList);
      result[i] = count;
    }
    return result;
  }
}
