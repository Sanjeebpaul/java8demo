package com.sanjeeb.demo.defaultmethod.dimondproblem;

public class TestDimondProblem implements IAnimal, IPlant {
	@Override
	public void showMessage() {
		//System.out.println("This is from implementation");
		//IPlant.super.showMessage();
		IAnimal.super.showMessage();
	}

	public static void main(String args[]) {
		TestDimondProblem t = new TestDimondProblem();
		t.showMessage();
	}
}
