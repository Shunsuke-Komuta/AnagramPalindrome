package com.example;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class AnalysisTest {
	ArrayList<String> substrings = null;
	Analysis analysis = null;

	@Before
	public void setUp() {
		substrings = new ArrayList<String>();
		analysis = new Analysis();
	}

	@Test
	public void test_aaの部分文字列が格納されたリストを引数で渡されるとアナグラム回文の結果を返す() {
		substrings.add("a");
		substrings.add("a");
		substrings.add("aa");
		
		int actual = analysis.result(substrings);
		
		assertEquals(3, actual);
	}
	
//	@Test
//	public void test_abの部分文字列が格納されたリストを引数で渡されるとアナグラム回文の結果を返す() {
//		substrings.add("a");
//		substrings.add("b");
//		substrings.add("ab");
//		
//		int actual = analysis.result(substrings);
//		
//		assertEquals(2, actual);
//	}
	
	@Test
	public void test_a部分文字列が引数で渡されると() {
		
	}
	

}
