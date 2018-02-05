package com.kalinga.parameterized;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner2 {

	public static void main(String[] args) {
	
		Result res=JUnitCore.runClasses(parameterized.class);
		
		for(Failure f:res.getFailures()){
			System.out.println(f.toString());
		}
		
		
		System.out.println(res.wasSuccessful());
	}

}
