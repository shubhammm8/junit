package com.kalinga.TestSuite;

import com.kalinga.TestCases.TestCase1;
import com.kalinga.test.TestingMessage;

import junit.framework.TestResult;
import junit.framework.TestSuite;

public class TestSuite1 {

	public static void main(String[] args) {
		
		TestSuite testSuite=new TestSuite(TestCase1.class,TestingMessage.class);
		TestResult res=new TestResult();
		testSuite.run(res);
		System.out.println(res.runCount());
		
	}

}
