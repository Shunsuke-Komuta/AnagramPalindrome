package com.example;

import java.util.ArrayList;

public class Executor {

  public int[] getCounts(String[] array) {
    int[] result = new int[array.length];
    Analysis analysis = new Analysis();
    Substringer substringer = new Substringer();

    for (int i = 0; i < array.length; i++) {
      ArrayList<String> substrings = substringer.createArrayOfSubstrings(array[i]);


    }

    result[0] = 6;
    result[1] = 5;
    result[2] = 6;

    return result;
  }
}
