package com.sanjeeb.demo.defaultmethod.dimondproblem;

public interface IPlant {
	default void showMessage() {
		System.out.println("This is a plant");
	}
}
