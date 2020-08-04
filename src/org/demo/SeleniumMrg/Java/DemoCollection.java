package org.demo.SeleniumMrg.Java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DemoCollection {
	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		s.add("ABC");
		s.add("XYZ");
		s.add("PQR");
		s.add("Ankit");
		
		for (String value : s) {
			System.out.println(value);
		}
		
		System.out.println("========================");

		List<String> l = new ArrayList<String>(s);
		for (String val : l) {
			System.out.println(val);
		}

		List<String> l1 = new ArrayList<String>();
		l1.addAll(s);
		System.out.println("====================================");
		for (String val1 : l1) {
			System.out.println(val1);
		}

	}

}
