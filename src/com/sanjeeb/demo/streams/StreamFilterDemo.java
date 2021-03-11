package com.sanjeeb.demo.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterDemo {

	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(1,20,13,17,9,5,18,4,98);
		List<Integer> evenList = numberList.stream().filter(i->i%2 == 0).collect(Collectors.toList());
		System.out.println(numberList);
		System.out.println(evenList);
	}

}
