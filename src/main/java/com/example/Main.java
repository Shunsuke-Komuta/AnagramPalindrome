package com.example;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("チェックする文字列の数：");
    int num = scanner.nextInt();
    System.out.println("文字列を入力して下さい");

    String[] array = new String[num];
    int[] result = new int[num];

    for (int i = 0; i < num; i++) {
      array[i] = scanner.nextLine();
    }

    Executor executor = new Executor();

    result = executor.getCounts(array);

  }

}
