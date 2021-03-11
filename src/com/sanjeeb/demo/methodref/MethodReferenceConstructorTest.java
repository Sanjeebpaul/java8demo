package com.sanjeeb.demo.methodref;

interface MethodRefUsingConstruct {
	public void show();
}

class ConstructorTest {
	public ConstructorTest() {
		System.out.println("This is a method reference using constructor");
	}
}

public class MethodReferenceConstructorTest {

	public static void main(String[] args) {
		MethodRefUsingConstruct t = ConstructorTest::new;
		t.show();
	}

}
