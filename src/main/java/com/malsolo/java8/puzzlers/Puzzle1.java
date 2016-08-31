package com.malsolo.java8.puzzlers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Puzzle1 implements Puzzle {

	@Override
	public void doStuff() {
		List<String> list = new ArrayList<>();//Arrays.asList("milk", "bread", "sausage");
		list.add("milk");
		list.add("bread");
		list.add("sausage");
		Stream<String> stream = list.stream();
		list.add("eggs, don't forget eggs!");
		stream.forEach(System.out::println);
	}

}
