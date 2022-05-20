package edu.assignments.map;

import java.util.*;

public class MapDemo {

	public static void main(String[] args) {

		Map<String, String> hm = new HashMap<String, String>();
		hm.put("Name","Muneeswar");
		hm.put("Pass","Mune");
		hm.put("Email", null);
		hm.put("Address","Muneeswar");
		
		//System.out.println(hm.get("Name"));
		
		
		
		Set s = hm.entrySet();
		
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			Map.Entry me = (Map.Entry) itr.next();
			System.out.println(me.getKey()+" : "+me.getValue());
			
		}
		

	}

}
