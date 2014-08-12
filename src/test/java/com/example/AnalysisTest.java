package com.example;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

public class AnalysisTest {
  ArrayList<String> substrings = null;
  ArrayList<String> oddStrings = null;
  ArrayList<String> evenStrings = null;

  Analysis analysis = null;

  @Before
  public void setUp() {
    substrings = new ArrayList<String>();
    oddStrings = new ArrayList<String>();
    evenStrings = new ArrayList<String>();

    analysis = new Analysis();
  }

  @Test
  public void test_aa部分文字列が格納されたリストを引数で渡されるとアナグラム回文の結果を返す() {
    substrings.add("a");
    substrings.add("a");
    substrings.add("aa");

    int actual = analysis.result(substrings);

    assertEquals(3, actual);
  }

  @Test
  public void test_a_aが格納されたリストが渡されると文字とその個数を格納したものを返す() {
    oddStrings.add("a");
    oddStrings.add("a");
    HashMap<String, Integer> oddTable = new HashMap<String, Integer>();

    oddTable = analysis.createOddStringsTabel(oddStrings);

    assertEquals(2, (int) oddTable.get("a"));
  }

  @Test
  public void test_a_bが格納されたリストが渡されると文字とその個数を格納したものを返す() {
    oddStrings.add("a");
    oddStrings.add("b");
    HashMap<String, Integer> oddTable = new HashMap<String, Integer>();

    oddTable = analysis.createOddStringsTabel(oddStrings);

    assertEquals(1, (int) oddTable.get("a"));
    assertEquals(1, (int) oddTable.get("b"));
  }

}
