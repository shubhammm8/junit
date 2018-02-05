package com.kalinga.TestSuite;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestAssertion {
	@Test
	public static void Testing(){
		System.out.println("hi i m test");
		
	}
	
	@Before
	public  void TestBefore(){
		System.out.println("hi i will be up before Test");
	}
	
	@After
	public static void TestAfter(){
		System.out.println("hi i will be up after test");
	}
	@BeforeClass
	public  void TestbeforeClass(){
		System.out.println("hi i will start once before Class");
	}
	@AfterClass
	public  void TestAfterClass(){
		
		System.out.println("hi i will start once after class");
	}
	
	

}
