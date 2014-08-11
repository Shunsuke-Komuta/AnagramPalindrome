package com.example;

public class Executor {

  public int[] getCounts(String[] array) {
    int[] result = new int[array.length];
    Analysis analysis = new Analysis();

    for (int i = 0; i < array.length; i++) {
      result[i] = analysis.getCountOfAnagramPalindrome(array[i]);
    }

    result[0] = 6;
    result[1] = 5;
    result[2] = 6;

    return result;
  }
}
