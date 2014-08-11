package com.example;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class AnalysisTest {

  @Test
  public void test＿奇数個で構成された部分文字列が格納されたリストを引数で渡されるとアナグラム回文の個数を返す() {
    ArrayList<String> substrings = new ArrayList<String>();
    substrings.add("a");
    // substrings.add("aa");
    substrings.add("aaa");
    // substrings.add("a");
    // substrings.add("aa");
    substrings.add("a");

    Analysis analysis = new Analysis();

    int actual = analysis.result(substrings);

    assertEquals(actual, 4);
  }

  @Test
  public void test＿偶数個で構成された部分文字列が格納されたリストを引数で渡されるとアナグラム回文の個数を返す() {
    ArrayList<String> substrings = new ArrayList<String>();
    // substrings.add("a");
    substrings.add("aa");
    // substrings.add("aaa");
    // substrings.add("a");
    substrings.add("aa");
    // substrings.add("a");

    Analysis analysis = new Analysis();

    int actual = analysis.result(substrings);

    assertEquals(actual, 2);
  }
}
