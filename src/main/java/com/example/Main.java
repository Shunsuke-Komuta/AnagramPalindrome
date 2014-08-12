package com.example;

import java.util.Scanner;

public class Main {

  static Executor executor = new Executor();

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("チェックする文字列の数：");
    int num = scanner.nextInt();
    String[] array = new String[num];
    int[] result = new int[num];

    System.out.println("文字列を入力して下さい");
    for (int i = 0; i < num; i++) {
      array[i] = scanner.next();
    }

    result = executor.getCounts(array);

    for (int i = 0; i < num; i++) {
      System.out.println(result[i]);
    }
  }
}
