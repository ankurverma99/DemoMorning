package org.demo.SeleniumMrg.Java;

import java.util.ArrayList;
import java.util.List;

public class DemoCollections {
	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		lst.add("Akshay");
		lst.add("Priyanka");
		lst.add("Abhisek");
		lst.add("Deepak");
		lst.add("Chetan");
		List<String> lst1 = new ArrayList<String>();
		lst1.add("SQL");
		lst1.add("Manual");
		lst1.add("java");
		for (String subject : lst1) {
			for (String name : lst) {
				System.out.println("Name of the student is : " + name + "  has attented subject   :" + subject);
			}
			System.out.println("----------------------------------");
		}
	}

}
