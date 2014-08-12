package com.example;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class SubstringerTest {

  Substringer substringer = null;
  ArrayList<String> substringlist = null;

  @Before
  public void setUp() {
    substringer = new Substringer();
    substringlist = new ArrayList<String>();
  }

  @Test
  public void test_文字列abを部分文字列にしたリストを返す() {

    substringlist = substringer.createSubstringList("ab");

    assertEquals("a", substringlist.get(0));
    assertEquals("b", substringlist.get(1));
    assertEquals("ab", substringlist.get(2));
  }

  @Test
  public void test_文字列abcを部分文字列にしたリストを返す() {

    substringlist = substringer.createSubstringList("abc");

    assertEquals("a", substringlist.get(0));
    assertEquals("b", substringlist.get(1));
    assertEquals("c", substringlist.get(2));
    assertEquals("ab", substringlist.get(3));
    assertEquals("bc", substringlist.get(4));
    assertEquals("abc", substringlist.get(5));
  }

  @Test
  public void test_文字列perlを部分文字列にしたリストを返す() {

    substringlist = substringer.createSubstringList("perl");

    assertEquals("p", substringlist.get(0));
    assertEquals("e", substringlist.get(1));
    assertEquals("r", substringlist.get(2));
    assertEquals("l", substringlist.get(3));
    assertEquals("pe", substringlist.get(4));
    assertEquals("er", substringlist.get(5));
    assertEquals("rl", substringlist.get(6));
    assertEquals("per", substringlist.get(7));
    assertEquals("erl", substringlist.get(8));
    assertEquals("perl", substringlist.get(9));
  }
}
