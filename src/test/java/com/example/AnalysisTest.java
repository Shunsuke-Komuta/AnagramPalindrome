package com.example;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

public class AnalysisTest {
  ArrayList<String> substringList = null;
  HashMap<String, Integer> table = null;
  Analysis analysis = null;


  @Before
  public void setUp() {
    substringList = new ArrayList<String>();
    analysis = new Analysis();
    table = new HashMap<String, Integer>();
  }

  @Test
  public void test_文字aとその個数を格納したものを返す() {
    substringList.add("a");

    table = analysis.createStringsTable(substringList.get(0));

    assertEquals(1, (int) table.get("a"));
  }

  @Test
  public void test_文字bとその個数を格納したものを返す() {
    substringList.add("b");

    table = analysis.createStringsTable(substringList.get(0));

    assertEquals(1, (int) table.get("b"));
  }

  @Test
  public void test_文字aaとその個数を格納したものを返す() {
    substringList.add("aa");

    table = analysis.createStringsTable(substringList.get(0));

    assertEquals(2, (int) table.get("a"));
  }

  @Test
  public void test_文字abとその個数を格納したものを返す() {
    substringList.add("ab");

    table = analysis.createStringsTable(substringList.get(0));

    assertEquals(1, (int) table.get("a"));
    assertEquals(1, (int) table.get("b"));
  }

  @Test
  public void test_文字abccbaとその個数を格納したものを返す() {
    substringList.add("abccba");
    String str = substringList.get(0);

    table = analysis.createStringsTable(str);

    assertEquals(2, (int) table.get("a"));
    assertEquals(2, (int) table.get("b"));
    assertEquals(2, (int) table.get("c"));
  }

  @Test
  public void test_文字aaの部分文字とその個数を参照し文字が奇数個の文字の数0を返す() {
    table.put("a", 2);

    int actual = analysis.odd(table);

    assertEquals(0, actual);
  }

  @Test
  public void test_文字aabの部分文字とその個数を参照し文字が奇数個の文字の数1を返す() {
    table.put("a", 2);
    table.put("b", 1);

    int actual = analysis.odd(table);

    assertEquals(1, actual);
  }

  @Test
  public void test_文字aaaの部分文字とその個数を参照し文字が奇数個の文字の数1を返す() {
    table.put("a", 3);

    int actual = analysis.odd(table);

    assertEquals(1, actual);
  }

  @Test
  public void test_文字abcの部分文字とその個数を参照し文字が奇数個の文字の数1を返す() {
    table.put("a", 1);
    table.put("b", 1);
    table.put("c", 1);

    int actual = analysis.odd(table);

    assertEquals(3, actual);
  }

  @Test
  public void test_a_a_aaが格納されたリストを渡すと3を返す() {
    substringList.add("a");
    substringList.add("a");
    substringList.add("aa");

    int actual = analysis.result(substringList);

    assertEquals(3, actual);
  }

  @Test
  public void test_a_b_abが格納されたリストを渡すと2を返す() {
    substringList.add("a");
    substringList.add("b");
    substringList.add("ab");

    int actual = analysis.result(substringList);

    assertEquals(2, actual);
  }
}
