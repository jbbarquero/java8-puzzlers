package com.malsolo.java8.puzzlers;

import java.util.stream.Stream;

public class Puzzle4 implements Puzzle {

	@Override
	public void doStuff() {
		System.out.println(Stream.of(-3, -2, -1, 0, 1, 2, 3).max(Math::max).get());
	}

}
