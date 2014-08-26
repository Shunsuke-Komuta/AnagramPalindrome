package com.example;

import java.util.Scanner;

public class Main {

  static Executor executor = new Executor();

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int num = scanner.nextInt();
    String[] array = new String[num];
    int[] result = new int[num];

    for (int i = 0; i < num; i++) {
      array[i] = scanner.next();
    }
    
    result = executor.getResult(array);

    for (int i = 0; i < num; i++) {
      System.out.println(result[i]);
    }
  }
}
