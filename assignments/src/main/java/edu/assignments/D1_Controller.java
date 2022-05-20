package edu.assignments;

import java.util.Scanner;

public class D1_Controller {
	void additon() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first Number:");
		int i1 = s.nextInt();
		
		System.out.println("Enter Second Number:");
		int i2 = s.nextInt();
		
		int k = i1+i2;
		System.out.println("Addition of two numbers is: "+k);
	}
	
	void print10times() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a name:");
		String name = s.next();
		System.out.println("Printing "+name+" Vertically");
		int n=1;
		while (n<11) {
			System.out.println(name);
			n++;
		}
		System.out.println("Printing "+name+" Horizantally");
		int m=1;
		while (m<11) {
			System.out.print(name+", ");
			m++;
		}
	}
}
