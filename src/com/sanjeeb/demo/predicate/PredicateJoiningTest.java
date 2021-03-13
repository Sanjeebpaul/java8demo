package com.sanjeeb.demo.predicate;

import java.util.function.Predicate;

public class PredicateJoiningTest {

	public static void main(String[] args) {
		int x[] = { 0, 5, 10, 15, 20, 25, 30 };
		Predicate<Integer> p1 = i -> i > 10;
		Predicate<Integer> p2 = i -> i % 2 == 0;
		System.out.println("The numbers greater than 10");
		process(p1, x);
		System.out.println("The number which are even");
		process(p2, x);
		System.out.println("The number not greater than 10");
		process(p1.negate(), x);
		System.out.println("The number greater than 10 and even are");
		process(p1.and(p2), x);
		System.out.println("The number greater than 10 or even are");
		process(p1.or(p2), x);

	}

	private static void process(Predicate<Integer> p, int[] x) {
		for (int j : x) {
			if (p.test(j)) {
				System.out.println(j);
			}
		}
	}

}
