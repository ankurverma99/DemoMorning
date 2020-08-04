package org.demo.SeleniumMrg.Java;

public class AddDemo {

	public static void main(String[] args) {
		Addable ad = new Addable() {
			@Override
			public int add(int a, int b) {
				return a + b;
			}
		};
		System.out.println("Sum Is  : " + ad.add(6, 5));
	}

}
