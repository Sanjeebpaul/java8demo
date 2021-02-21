package com.sanjeeb.demo.staticmethod;

public class StaticMethodImplementation implements IStaticInterface{
	
	public static void main(String[] args) {
		//StaticMethodImplementation s = new StaticMethodImplementation();
		//s.showMessage();
		IStaticInterface.showMessage();
	}

}
