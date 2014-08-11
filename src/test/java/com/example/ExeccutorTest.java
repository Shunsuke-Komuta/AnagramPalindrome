package com.example;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

public class ExeccutorTest extends TestCase {
  Executor executor = null;
  String[] array = new String[3];
  int[] result = new int[3];

  @Before
  public void setUp() {
    executor = new Executor();
    array[0] = "aaa";
    array[1] = "aab";
    array[2] = "aabc";
  }

  // @Test
  // public void test＿文字列が格納された配列を引数に渡されるとint型の配列を返す(){
  // int[] result = analysis.getCounts(array);
  //
  // assertEquals(int, result.getClass());
  // }

  @Test
  public void test＿文字列が格納された配列を引数に渡されると別のメソッドを呼び出す() {

    result = executor.getCounts(array);

    assertEquals(result[0], 6);
    assertEquals(result[1], 5);
    assertEquals(result[2], 6);
  }
}
