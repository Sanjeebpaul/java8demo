package com.sanjeeb.demo.lamdaexpression;

@FunctionalInterface
interface LambdaInterface{
	public void showMessage(int a,int b);
}

public class TestLambda {

	public static void main(String[] args) {
		//LambdaInterface s = () -> System.out.println("this is a simple Lambda expression");
		//s.showMessage();
		LambdaInterface l = (a,b) -> System.out.println("Sum of the entered number = "+ (a+b));
		l.showMessage(10, 20);
	}

}
