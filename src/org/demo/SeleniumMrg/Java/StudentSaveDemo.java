package org.demo.SeleniumMrg.Java;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class StudentSaveDemo {
	public static void main(String[] args) throws Exception {
		Student s = new Student();
		s.name = "Ankur";
		s.roll = 9;
		s.Dept = "cse";
		FileOutputStream fos = new FileOutputStream("data.txt");
		ObjectOutputStream oops = new ObjectOutputStream(fos);
		oops.writeObject(s);
		fos.close();
		System.out.println("App End");

	}

}
