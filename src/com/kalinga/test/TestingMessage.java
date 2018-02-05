package com.kalinga.test;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import com.kalinga.example.MethodClass;

public class TestingMessage {
	
	MethodClass m=new MethodClass("hi i m the message");
	
	
	@Test
	@Ignore
	public void testingprintmessage(){
		assertEquals("hi i m the message",m.printMessage());
		
		
	}
	@Test(timeout=1)
	public void testingAddMethod(){
		
		assertEquals(5,m.add(2, 3));
		assertFalse(m.add(2, 3)>6);
		
	}
	
	
	

}
