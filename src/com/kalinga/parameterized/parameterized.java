package com.kalinga.parameterized;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.kalinga.example.MethodClass;

@RunWith(Parameterized.class)
public class parameterized {
	 private Integer inputNumber1;
	 private Integer inputNumber2;
	 MethodClass m;

	 @Before
	 public void initial(){
		 
		 
		m= new MethodClass("hi");
	 }
public void putting(int x,int y){
this.inputNumber1=x;
this.inputNumber2=y;
	
	
}
@Parameterized.Parameters
public static Collection testn(){
	return Arrays.asList(new Object[][]{
		{2,2},
		{2,3},
		{1,1}
	});
	
}	



@Test
public void checking(){
	
	assertEquals(5,m.add(inputNumber1,inputNumber2));
	
	
	
}


}
