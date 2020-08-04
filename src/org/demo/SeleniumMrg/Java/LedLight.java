package org.demo.SeleniumMrg.Java;

public class LedLight {

	public static void main(String[] args) {
		Light l = new Light() {

			@Override
			public String giveLight() {
				return "Give LED Light";
			}

		};
		
		System.out.println(l.giveLight());
	}

}
