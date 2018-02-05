package com.kalinga.TestCases;

import org.junit.Before;
import org.junit.Test;

import com.kalinga.example.MethodClass;

import junit.framework.TestCase;

public class TestCase1 extends TestCase {
	
	int x,y;
	
	@Before
	public void setUp(){
		x=2;
		y=3;
		
	} 
	@Test
	public void testingadd(){
		MethodClass m=new MethodClass("hi");
		System.out.println(" Test cases "+this.countTestCases());
		this.setName("MEssi");
		System.out.println(" Test Name "+this.getName() );
		assertEquals(5,m.add(x, y));
		
		
		
	}
	
	
	public void tearDown(){
		
	}
}
