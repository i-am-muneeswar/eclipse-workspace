package edu.assignments.set;

import java.util.*;

public class SetDemo {

	public static void main(String[] args) {

		Set<String> s = new HashSet<String>();
		s.add("e");
		s.add("d");
		s.add("c");
		s.add("b");
		s.add("a");
		
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//s.forEach(S->System.out.println(S));

	}

}
