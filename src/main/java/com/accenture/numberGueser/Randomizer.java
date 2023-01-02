package com.accenture.numberGueser;

import java.util.Scanner;

public class Randomizer {
	private int randomNumber;
	
	public Randomizer() {
		System.out.println("Randomizer instantiated...");
	}

	public void generate() {
		int min = 0;
		int max = 10;
		
		System.out.println("A number has been picked from " + min + " to " + max +"\n");
		randomNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);
		System.out.println("State your name and guess the number.\n");
	}
	
	public void check(String name, int number) {
		if(number == randomNumber) {
			System.out.println(name + " correct!");
		}
		else {
			System.out.println(name + " incorrect");
		}
	}

	public void results() {
		System.out.println("\nNumber chosen: " + randomNumber +"\n");
	}
}