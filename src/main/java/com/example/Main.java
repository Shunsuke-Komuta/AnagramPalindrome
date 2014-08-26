package com.example;

import java.util.Scanner;

import com.example.Executor;

public class Main {

  static Executor executor = new Executor();

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();

    for (int i = 0; i < num; i++) {
      String text = scanner.next();
      int result = executor.getResult(text);
      System.out.println(result);
    }
    
    scanner.close();
  }
}
