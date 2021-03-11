package com.sanjeeb.demo.methodref;

interface MethodRefDemoTest {
	public void showMessage();
}

public class TestingMethodRef{
	public static void printMessage() {
		System.out.println("This is the implementation of Method Ref Demo");
	}
	
	public void print() {
		System.out.println("This is instant method");
	}
	
	public static void main(String[] args) {
		//MethodRefDemoTest demo = TestingMethodRef::printMessage;
		//demo.showMessage();
		MethodRefDemoTest ref = new TestingMethodRef()::print;
		ref.showMessage();
		
	}
}
