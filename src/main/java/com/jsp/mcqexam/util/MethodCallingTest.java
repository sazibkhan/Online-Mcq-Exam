package com.jsp.mcqexam.util;

public  class MethodCallingTest {
	//Define
	public void disply() {	
		
		
	}
	
	//declare
	//public abstract void display1();
	
	
	//call
	public void doTest() {
		disply();
	}
	
	
	public int createTest(int a) {
		return a+10;
	}
	
	public void callCreateTest() {
	int a =5;
		//System.out.println(createTest(5));
		createTest(a);
	}
	
	public static void main(String[] args) {
		
		MethodCallingTest callingTest = new MethodCallingTest();
		callingTest.callCreateTest();
		
		System.out.println(callingTest);
		
	}
	
	
}
