package com.example;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class DivideTest {

  @Test
  public void test_a_b_abが格納されたリストを奇数文字の部分文字列に分類したリストを返す() {
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
  public void test_a_b_c_d_ab_bc_cd_abc_bcd_abcdが格納されたリストを奇数文字の部分文字列に分類したリストを返す() {
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
  public void test_a_b_abが格納されたリストを偶数文字の部分文字列に分類したリストを返す() {
    ArrayList<String> allSubstrings = new ArrayList<String>();
    allSubstrings.add("a");
    allSubstrings.add("b");
    allSubstrings.add("ab");

    Divide divide = new Divide();

    ArrayList<String> oddSubstrings = divide.EvenStrings(allSubstrings);

    assertEquals("ab", oddSubstrings.get(0));
  }

  @Test
  public void test_abcdが格納されたリストを偶数文字の部分文字列に分類したリストを返す() {
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
