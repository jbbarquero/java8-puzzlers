package com.malsolo.java8.puzzlers;

import java.util.ConcurrentModificationException;

public class Puzzlers {
	
	public static void main(String... args) {
		Puzzle puzzle;
		System.out.println("##### PUZZLE 1 #####");
		puzzle = new Puzzle1();
		puzzle.doStuff();
		System.out.println("##### PUZZLE 2 #####");
		puzzle = new Puzzle2();
		try {
			puzzle.doStuff();
		} catch (ConcurrentModificationException e) {
			e.printStackTrace();
		} 
		System.out.println("##### PUZZLE 3 #####");
		puzzle = new Puzzle3();
		puzzle.doStuff();
		System.out.println("##### PUZZLE 4 #####");
		puzzle = new Puzzle4();
		puzzle.doStuff();
	}

}
