package com.kalinga.example;

public class MethodClass {
	
	private String message;
	
	public MethodClass(String m){
		this.message=m;
	}
	
	public String printMessage(){
	System.out.println("the message is - "+this.message);
	return this.message;
	
	}

	public int add(int x,int y){
		System.out.println((x+y));
		return (x+y);
		
	}
	
}
