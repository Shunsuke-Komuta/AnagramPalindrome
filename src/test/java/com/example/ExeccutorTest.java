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
    executor = new Executor();

    String[] array = new String[] { "aaa", "aab", "aabc", "pepper" };
    int[] expected = new int[] { 6, 5, 6, 13 }; 
    
    for (int i = 0; i < array.length; ++i) {
    	int result = executor.getResult(array[i]);
    	assertEquals(expected[i], result);
    }
  }
}
