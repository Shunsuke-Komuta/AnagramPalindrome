package com.example;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class SubstringerTest {

  Substringer substringer = null;
  ArrayList<String> substrings = null;
  ArrayList<String> ofEvenNumbers = null;
  ArrayList<String> ofOddNumbers = null;

  @Before
  public void setUp() {
    substringer = new Substringer();
    substrings = new ArrayList<String>();
    ofEvenNumbers = new ArrayList<String>();
    ofOddNumbers = new ArrayList<String>();
  }

  @Test
  public void test_文字列aaを引数に渡されると奇数の部分文字列が奇数個と偶数個で別れたリストを返す() {

    substrings = substringer.substringsOfOddAndEven("aa");

    ArrayList<String> ofOddNumbers = substrings.get(0);
    ArrayList<String> ofEvenNumbers = substrings.get(1);

    assertEquals(ofOddNumbers.get(0), "a");
    assertEquals(substrings.get(0), "aa");
    assertEquals(ofOddNumbers.get(1), "a");
  }


  @Test
  public void test_文字列aaaを引数に渡されると奇数の部分文字列のリストを返す() {

    substrings = substringer.createSubstringsOfEvenNumber("aaa");

    assertEquals(substrings.get(0), "a");
    assertEquals(substrings.get(1), "aaa");
    assertEquals(substrings.get(2), "a");
    assertEquals(substrings.get(3), "a");
  }


  // public void test_文字列を引数で渡すとすべての部分文字列を格納したリストを返すメソッドを呼び出すpart1() {
  //
  // substrings = substringer.createArrayOfSubstrings("aaa");
  //
  // assertEquals(substrings.get(0), "a");
  // assertEquals(substrings.get(1), "aa");
  // assertEquals(substrings.get(2), "aaa");
  // assertEquals(substrings.get(3), "a");
  // assertEquals(substrings.get(4), "aa");
  // assertEquals(substrings.get(5), "a");
  // }
  //
  // @Test
  // public void test_文字列を引数で渡すとすべての部分文字列を格納したリストを返すメソッドを呼び出すpart2() {
  //
  // substringer.createArrayOfSubstrings("perl");
  //
  // assertEquals(substrings.get(0), "p");
  // assertEquals(substrings.get(1), "pe");
  // assertEquals(substrings.get(2), "per");
  // assertEquals(substrings.get(3), "perl");
  // assertEquals(substrings.get(4), "e");
  // assertEquals(substrings.get(5), "er");
  // assertEquals(substrings.get(6), "erl");
  // assertEquals(substrings.get(7), "r");
  // assertEquals(substrings.get(8), "rl");
  // assertEquals(substrings.get(9), "l");
  // }


}
