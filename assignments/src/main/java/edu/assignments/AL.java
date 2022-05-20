package edu.assignments;
import java.util.*;

public class AL {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(1);
		al.add(1);
		al.add(20);
		al.add(50);
		al.add(7);
		al.add(7);
		
		Set<Integer> s = new HashSet<>(al);
		
		for(Integer k: s) {
			System.out.println(k);
		}
	
	}

}

// arraylist to set
// does not repeat duplicates in a set