package com.sanjeeb.demo.defaultmethod.dimondproblem;

public interface IAnimal {
	default void showMessage() {
		System.out.println("This is a animal");
	}
}
