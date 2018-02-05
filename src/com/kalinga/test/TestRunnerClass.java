package com.kalinga.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunnerClass {

	public static void main(String[] args) {
		
		
		Result result=JUnitCore.runClasses(TestingMessage.class);
		
		
		for(Failure f:result.getFailures()){
			System.out.println(f.toString());
		}
		

		System.out.println(result.wasSuccessful());
	}

}
