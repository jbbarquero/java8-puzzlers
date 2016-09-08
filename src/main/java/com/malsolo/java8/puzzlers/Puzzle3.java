package com.malsolo.java8.puzzlers;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Puzzle3 implements Puzzle {

	@Override
	public void doStuff() {
		killAll();
	}
	
	public void killAll() {
		ExecutorService ex = Executors.newSingleThreadExecutor();
		List<String> sentence = Arrays.asList("Punish");
		ex.submit(() -> Files.write(Paths.get("sentence.txt"), sentence)); //1 implicit return, due to the arrow
		// Doesn't compile ex.submit(() -> ( Files.write(Paths.get("sentence.txt"), sentence); )); //2 Explicit return
		// Doesn't compile ex.submit(() -> { Files.write(Paths.get("sentence.txt"), sentence); }); //2 Explicit return
	}

}
