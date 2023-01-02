package com.accenture.numberGueser;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class Players {
	String name;
	int number;
	public Players(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}
	
	public String getName() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name");
		name = scan.next();
		return name;
	}
	
	public int getChoice() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter choice");
		number = scan.nextInt();
		return number;
	}
	
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Choice: " + number);
	}
	
}
