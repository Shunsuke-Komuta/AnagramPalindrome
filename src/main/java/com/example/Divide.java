package com.example;

import java.util.ArrayList;
import java.util.Iterator;

public class Divide {

  public ArrayList<String> OddStrings(ArrayList<String> allSubstrings) {

    Iterator<String> iterator = allSubstrings.iterator();
    while (iterator.hasNext()) {
      if (iterator.next().length() % 2 == 0) {
        iterator.remove();
      }
    }
    System.out.println(allSubstrings);
    return allSubstrings;
  }

  public ArrayList<String> EvenStrings(ArrayList<String> allSubstrings) {

    Iterator<String> iterator = allSubstrings.iterator();
    while (iterator.hasNext()) {
      if (iterator.next().length() % 2 == 1) {
        iterator.remove();
      }
    }
    System.out.println(allSubstrings);
    return allSubstrings;
  }

}
