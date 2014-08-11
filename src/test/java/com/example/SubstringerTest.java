package com.example;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class SubstringerTest {

  Substringer substringer = null;
  ArrayList<String> substrings = null;

  @Before
  public void setUp() {
    substringer = new Substringer();
    substrings = new ArrayList<String>();
  }

  @Test
  public void test_文字列を引数で渡すとすべての部分文字列を格納したリストを返すメソッドを呼び出すpart1() {

    substrings = substringer.createArrayOfSubstrings("aaa");

    assertEquals(substrings.get(0), "a");
    assertEquals(substrings.get(1), "a");
    assertEquals(substrings.get(2), "a");
    assertEquals(substrings.get(3), "aa");
    assertEquals(substrings.get(4), "aa");
    assertEquals(substrings.get(5), "aaa");
  }

  @Test
  public void test_文字列を引数で渡すとすべての部分文字列を格納したリストを返すメソッドを呼び出すpart2() {

    substringer.createArrayOfSubstrings("perl");

    assertEquals(substrings.get(0), "p");
    assertEquals(substrings.get(1), "pe");
    assertEquals(substrings.get(2), "per");
    assertEquals(substrings.get(3), "perl");
    assertEquals(substrings.get(4), "e");
    assertEquals(substrings.get(5), "er");
    assertEquals(substrings.get(6), "erl");
    assertEquals(substrings.get(7), "r");
    assertEquals(substrings.get(8), "rl");
    assertEquals(substrings.get(9), "l");
  }


}
