package com.malsolo.java8.puzzlers;

import java.util.ConcurrentModificationException;

public class Puzzlers {
	
	public static void main(String... args) {
		System.out.println("##### PUZZLE 1 #####");
		Puzzle puzzle = new Puzzle1();
		puzzle.doStuff();
		System.out.println("##### PUZZLE 2 #####");
		puzzle = new Puzzle2();
		try {
			puzzle.doStuff();
		} catch (ConcurrentModificationException e) {
			e.printStackTrace();
		} 
	}

}
