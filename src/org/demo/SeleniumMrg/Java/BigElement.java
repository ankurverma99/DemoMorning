package org.demo.SeleniumMrg.Java;

import java.util.ArrayList;
import java.util.List;

public class BigElement {
	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(15);
		lst.add(5);
		lst.add(17);
		lst.add(23);
		lst.add(9);
		int big = lst.get(0);
		for (int i = 1; i < lst.size(); i++) {
			if (big < lst.get(i))
				big = lst.get(i);
		}
		System.out.println(big);
	}

}
