package com.example;

public class Executor {

  static Substringer substringer = new Substringer();
  static Analysis analysis = new Analysis();

  public int getResult(String text) {
      return substringer.countSatisfiedSubstrings(text, analysis);
  }
}
