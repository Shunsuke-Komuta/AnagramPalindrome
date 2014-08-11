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

    assertEquals("a", substrings.get(0));
    assertEquals("a", substrings.get(1));
    assertEquals("a", substrings.get(2));
    assertEquals("aa", substrings.get(3));
    assertEquals("aa", substrings.get(4));
    assertEquals("aaa", substrings.get(5));
  }

  @Test
  public void test_文字列を引数で渡すとすべての部分文字列を格納したリストを返すメソッドを呼び出すpart2() {

    substringer.createArrayOfSubstrings("perl");

    assertEquals("p", substrings.get(0));
    assertEquals("pe", substrings.get(1));
    assertEquals("per", substrings.get(2));
    assertEquals("perl", substrings.get(3));
    assertEquals("e", substrings.get(4));
    assertEquals("er", substrings.get(5));
    assertEquals("erl", substrings.get(6));
    assertEquals("r", substrings.get(7));
    assertEquals("rl", substrings.get(8));
    assertEquals("l", substrings.get(9));
  }


}
