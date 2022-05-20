package edu.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Lambda_Demo {

	public static void main(String[] args) {
		
		List<String> ll = new ArrayList<String>();
		ll.add("Vishnu");
		ll.add("Riyaz");
		ll.add("Gurivi");
		ll.add("Muneeswar");
		
		
		System.out.println("**** Normal Array Concept ****");
		String aa[] = new String[10];
		aa[0] = "Vishnu";
		aa[1] = "Riyaz";
		aa[2] = "Gurivi";
		aa[3] = "Muneeswar";
		
		Arrays.asList(aa).forEach(s3->System.out.println(s3));
		
		System.out.println("**** too older way to take data ****");
		Iterator it = ll.iterator();
		while(it.hasNext()) {
			String s1 = (String)it.next();
			System.out.println(s1);
		}
		
		System.out.println("**** older way to take data ****");
		for(String s:ll) {
			System.out.println(s);
		}
		
		System.out.println("**** lambda way ****");
		ll.forEach(s3->System.out.println(s3));
		// "->" is the indication of lambda
		// consumer is functional interface and it is default available in jdk 1.8
		// lambda is a functional programming concept, based on functional interface, reduce no. of lines, optimize our program 

	}

}
