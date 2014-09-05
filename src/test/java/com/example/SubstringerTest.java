package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SubstringerTest {

  Substringer substringer = new Substringer();
  Analysis analysis = new Analysis();

  @Before
  public void setUp() {
  }

  @Test
  public void test_文字列abを部分文字列にしたリストを返す() {
    int count = substringer.countSatisfiedSubstrings("ab", analysis);
    assertEquals(2, count);
  }

  @Test
  public void test_文字列abcを部分文字列にしたリストを返す() {
    int count = substringer.countSatisfiedSubstrings("abc", analysis);
    assertEquals(3, count);
  }

  @Test
  public void test_文字列perlを部分文字列にしたリストを返す() {
    int count = substringer.countSatisfiedSubstrings("perl", analysis);
    assertEquals(4, count);
  }
}
