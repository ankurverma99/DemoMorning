package org.demo.SeleniumMrg.Java;

public class Child extends Parent {

	@Override
	public int add(int n) {
		return n - 3;
	}

	public static void main(String[] args) {
		Parent p = new Child();
		int res = p.add(5);
		System.out.println(res);
	}
}
