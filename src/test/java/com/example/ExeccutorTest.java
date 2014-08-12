package com.example;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

public class ExeccutorTest extends TestCase {
  Executor executor = null;

  @Before
  public void setUp() {

  }

  @Test
  public void test＿文字列が格納された配列を引数に渡されると別のメソッドを呼び出す() {
    String[] array = new String[4];
    int[] result = new int[4];

    executor = new Executor();
    array[0] = "aaa";
    array[1] = "aab";
    array[2] = "aabc";
    array[3] = "pepper";

    result = executor.getCounts(array);

    assertEquals(result[0], 6);
    assertEquals(result[1], 5);
    assertEquals(result[2], 6);
    assertEquals(result[3], 13);

  }
}
