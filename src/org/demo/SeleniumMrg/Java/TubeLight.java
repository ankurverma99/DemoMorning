package org.demo.SeleniumMrg.Java;

public class TubeLight {

	public static void main(String[] args) {
		Light l = new Light() {
			@Override
			public String giveLight() {
				return "Give TubeLight";
			}
		};
		System.out.println(l.giveLight());
	}

}
