package org.demo.SeleniumMrg.Java;

public class Dmo2Impl implements IDemo {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		IDemo d = new Dmo2Impl();
		System.out.println(d.add(4, 5));
		IDemo id = new IDemo() {

			@Override
			public int add(int a, int b) {
				return a + b;
			}
		};
		System.out.println(id.add(5, 6));
	}

}
