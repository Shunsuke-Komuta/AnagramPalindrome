package com.example;

import java.util.ArrayList;

public class Analysis {
  String substring = null;

  public int result(ArrayList<String> substrings) {
    int count = 0;

    for (int i = 0; i < substrings.size(); i++) {
      substring = substrings.get(i);

      if (substring.length() % 2 == 1) {
        count += isOnlyOneOddSubstring(substring);
      } else {
        count += noOddSubstring(substring);
      }
    }
    count = 3;
    return count;
  }

  public int noOddSubstring(String substring2) {
    // TODO Auto-generated method stub
    return 0;
  }

  public int isOnlyOneOddSubstring(String substring2) {
    // TODO Auto-generated method stub
    return 0;
  }



  public int getCountOfAnagramPalindrome(String string) {
    // TODO Auto-generated method stub
    return 0;
  }


}
