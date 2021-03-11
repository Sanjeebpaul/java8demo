package com.sanjeeb.demo.nullable;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class NullableTest {

	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("Sandy","Sumit","Anil","Bikash",null,"Anmol");
		nameList.stream().forEach(str->Optional.ofNullable(str).ifPresent(name->System.out.println(name)));

	}

}
