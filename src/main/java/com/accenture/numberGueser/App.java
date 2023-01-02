package com.accenture.numberGueser;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		System.out.println("Running program ...");
		// remember to import spring-context dependency into pom.xml
		// notice that we are now using AnnotationConfig instead of XmlApplication
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		System.out.println("Bean Factory created Bean Object ... \n");
		Randomizer rz = context.getBean("randomizer", Randomizer.class);
		rz.generate();
		
		Players p1 = context.getBean("player", Players.class);
		String p1Name = p1.getName();
		int p1Choice = p1.getChoice();
		p1.display();
		Players p2 = context.getBean("player", Players.class);
		String p2Name = p2.getName();
		int p2Choice = p2.getChoice();
		p2.display();
		Players p3 = context.getBean("player", Players.class);
		String p3Name = p3.getName();
		int p3Choice = p3.getChoice();
		p3.display();
		
		rz.check(p1Name, p1Choice);
		rz.check(p2Name, p2Choice);
		rz.check(p3Name, p3Choice);

		rz.results();
		
		System.out.println("Program end");
	}
}