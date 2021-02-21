package com.sanjeeb.demo.defaultmethod;

public interface DefaultMethodInterface {
 default void showMessage() {
	 System.out.println("This is the message from default method");
 }
}
