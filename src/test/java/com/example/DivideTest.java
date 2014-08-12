package com.example;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class DivideTest {

  @Test
  public void test_a_b_abが格納されたリストを受け取ると奇数個で構成された部分文字列が格納されたリストを返すメソッド() {
    ArrayList<String> allSubstrings = new ArrayList<String>();
    allSubstrings.add("a");
    allSubstrings.add("b");
    allSubstrings.add("ab");

    Divide divide = new Divide();

    ArrayList<String> oddSubstrings = divide.OddStrings(allSubstrings);

    assertEquals("a", oddSubstrings.get(0));
    assertEquals("b", oddSubstrings.get(1));
  }

  @Test
  public void test_abcdの部分文字列が格納されたリストを受け取ると奇数個で構成された部分文字列が格納されたリストを返すメソッド() {
    ArrayList<String> allSubstrings = new ArrayList<String>();
    allSubstrings.add("a");
    allSubstrings.add("b");
    allSubstrings.add("c");
    allSubstrings.add("d");
    allSubstrings.add("ab");
    allSubstrings.add("bc");
    allSubstrings.add("cd");
    allSubstrings.add("abc");
    allSubstrings.add("bcd");
    allSubstrings.add("abcd");

    Divide divide = new Divide();

    ArrayList<String> oddSubstrings = divide.OddStrings(allSubstrings);

    assertEquals("a", oddSubstrings.get(0));
    assertEquals("b", oddSubstrings.get(1));
    assertEquals("c", oddSubstrings.get(2));
    assertEquals("d", oddSubstrings.get(3));
    assertEquals("abc", oddSubstrings.get(4));
    assertEquals("bcd", oddSubstrings.get(5));
  }

  @Test
  public void test_a_b_abが格納されたリストを受け取ると偶数個で構成された部分文字列が格納されたリストを返すメソッド() {
    ArrayList<String> allSubstrings = new ArrayList<String>();
    allSubstrings.add("a");
    allSubstrings.add("b");
    allSubstrings.add("ab");

    Divide divide = new Divide();

    ArrayList<String> oddSubstrings = divide.EvenStrings(allSubstrings);

    assertEquals("ab", oddSubstrings.get(0));
  }

  @Test
  public void test_abcdの部分文字列が格納されたリストを受け取ると偶数個で構成された部分文字列が格納されたリストを返すメソッド() {
    ArrayList<String> allSubstrings = new ArrayList<String>();
    allSubstrings.add("a");
    allSubstrings.add("b");
    allSubstrings.add("c");
    allSubstrings.add("d");
    allSubstrings.add("ab");
    allSubstrings.add("bc");
    allSubstrings.add("cd");
    allSubstrings.add("abc");
    allSubstrings.add("bcd");
    allSubstrings.add("abcd");

    Divide divide = new Divide();

    ArrayList<String> oddSubstrings = divide.EvenStrings(allSubstrings);

    assertEquals("ab", oddSubstrings.get(0));
    assertEquals("bc", oddSubstrings.get(1));
    assertEquals("cd", oddSubstrings.get(2));
    assertEquals("abcd", oddSubstrings.get(3));
  }

}
