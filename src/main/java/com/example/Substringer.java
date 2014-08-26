package com.example;

public class Substringer {

  public int countSatisfiedSubstrings(String string, Analysis analysis) {
    int length = string.length();
    int count = 0;

    for (int i = 0; i < length; i++) {
      int beginIndex = 0;
      int endIndex = i + 1;
      do {
    	if (analysis.isAnagramPalindrome(string.substring(beginIndex, endIndex))) {
    		++count;
    	}
        ++beginIndex;
        ++endIndex;
      } while (endIndex <= length);
    }
    return count;
  }
}
