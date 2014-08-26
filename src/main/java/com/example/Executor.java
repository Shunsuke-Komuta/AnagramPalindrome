package com.example;

import java.util.ArrayList;

public class Executor {

  static Substringer substringer = new Substringer();
  static Analysis analysis = new Analysis();

  public int getResult(String text) {
      ArrayList<String> substringList = substringer.createSubstringList(text);
      return analysis.result(substringList);
  }
}
