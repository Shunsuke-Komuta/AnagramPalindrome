package com.example;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

public class AnalysisTest {
  Analysis analysis = null;

  @Before
  public void setUp() {
    analysis = new Analysis();
  }

  @Test
  public void test_文字aとその個数を格納したものを返す() {
    HashMap<String, Integer> table = analysis.createStringsTable("a");
    assertEquals(1, (int) table.get("a"));
  }

  @Test
  public void test_文字bとその個数を格納したものを返す() {
	HashMap<String, Integer> table = analysis.createStringsTable("b");
    assertEquals(1, (int) table.get("b"));
  }

  @Test
  public void test_文字aaとその個数を格納したものを返す() {
    HashMap<String, Integer> table = analysis.createStringsTable("aa");
    assertEquals(2, (int) table.get("a"));
  }

  @Test
  public void test_文字abとその個数を格納したものを返す() {
    HashMap<String, Integer> table = analysis.createStringsTable("ab");
    assertEquals(1, (int) table.get("a"));
    assertEquals(1, (int) table.get("b"));
  }

  @Test
  public void test_文字abccbaとその個数を格納したものを返す() {
    HashMap<String, Integer> table = analysis.createStringsTable("abccba");

    assertEquals(2, (int) table.get("a"));
    assertEquals(2, (int) table.get("b"));
    assertEquals(2, (int) table.get("c"));
  }

  @Test
  public void test_文字aaの部分文字とその個数を参照し文字が奇数個の文字の数0を返す() {
	  HashMap<String, Integer> table = new HashMap<String, Integer>();
	  table.put("a", 2);

    int actual = analysis.countOddChar(table);

    assertEquals(0, actual);
  }

  @Test
  public void test_文字aabの部分文字とその個数を参照し文字が奇数個の文字の数1を返す() {
	  HashMap<String, Integer> table = new HashMap<String, Integer>();
      table.put("a", 2);
      table.put("b", 1);

    int actual = analysis.countOddChar(table);

    assertEquals(1, actual);
  }

  @Test
  public void test_文字aaaの部分文字とその個数を参照し文字が奇数個の文字の数1を返す() {
	  HashMap<String, Integer> table = new HashMap<String, Integer>();
    table.put("a", 3);

    int actual = analysis.countOddChar(table);

    assertEquals(1, actual);
  }

  @Test
  public void test_文字abcの部分文字とその個数を参照し文字が奇数個の文字の数2を返す() {
	  HashMap<String, Integer> table = new HashMap<String, Integer>();
    table.put("a", 1);
    table.put("b", 1);
    table.put("c", 1);

    int actual = analysis.countOddChar(table);

    assertEquals(2, actual);
  }

  @Test
  public void test_文字abbcccddddeeeeeの部分文字とその個数を参照し文字が奇数個の文字の数2を返す() {
	  HashMap<String, Integer> table = new HashMap<String, Integer>();
    table.put("a", 1);
    table.put("b", 2);
    table.put("c", 3);
    table.put("d", 4);
    table.put("d", 5);

    int actual = analysis.countOddChar(table);

    assertEquals(2, actual);
  }
}
