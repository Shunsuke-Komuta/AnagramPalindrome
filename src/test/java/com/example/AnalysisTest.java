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
  HashMap<String, Integer> oddTable = null;
  Analysis analysis = null;


  @Before
  public void setUp() {
    substrings = new ArrayList<String>();
    oddStrings = new ArrayList<String>();
    evenStrings = new ArrayList<String>();
    analysis = new Analysis();
    oddTable = new HashMap<String, Integer>();
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
  public void test_aが格納されたリストが渡されると文字とその個数を格納したものを返す() {
    oddStrings.add("a");

    oddTable = analysis.createStringsTable(oddStrings.get(0));

    assertEquals(1, (int) oddTable.get("a"));
  }

  @Test
  public void test_bが格納されたリストが渡されると文字とその個数を格納したものを返す() {
    oddStrings.add("b");

    oddTable = analysis.createStringsTable(oddStrings.get(0));

    assertEquals(1, (int) oddTable.get("b"));
  }

  @Test
  public void test_aaが格納されたリストが渡されると文字とその個数を格納したものを返す() {
    oddStrings.add("aa");

    oddTable = analysis.createStringsTable(oddStrings.get(0));

    assertEquals(2, (int) oddTable.get("a"));
  }

  @Test
  public void test_abが格納されたリストが渡されると文字とその個数を格納したものを返す() {
    oddStrings.add("ab");

    oddTable = analysis.createStringsTable(oddStrings.get(0));

    assertEquals(1, (int) oddTable.get("a"));
    assertEquals(1, (int) oddTable.get("b"));
  }

  @Test
  public void test_abccbaが格納されたリストが渡されると文字とその個数を格納したものを返す() {
    oddStrings.add("abccba");
    String str = oddStrings.get(0);

    oddTable = analysis.createStringsTable(str);

    assertEquals(2, (int) oddTable.get("a"));
    assertEquals(2, (int) oddTable.get("b"));
    assertEquals(2, (int) oddTable.get("c"));
  }
}
