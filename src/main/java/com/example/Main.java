package com.example;

import java.util.Scanner;

import jdk.nashorn.internal.runtime.Timing;

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

    long start = System.currentTimeMillis();
    Timing timing = new Timing();

    result = executor.getResult(array);

    for (int i = 0; i < num; i++) {
      System.out.println(result[i]);
    }
    long stop = System.currentTimeMillis();
    System.out.println("実行にかかった時間は " + (stop - start) + " ミリ秒です。");
  }
}
