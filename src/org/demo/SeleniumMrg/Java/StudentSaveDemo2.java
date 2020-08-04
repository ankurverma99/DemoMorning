package org.demo.SeleniumMrg.Java;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class StudentSaveDemo2 {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "xyz";
		s.Dept = "mech";
		s.roll = 5;
		FileOutputStream fos = null;
		ObjectOutputStream oops = null;
		try {
			fos = new FileOutputStream("student.txt");
			oops = new ObjectOutputStream(fos);
			oops.writeObject(s);
			System.out.println("App End");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fos != null && oops != null)
				try {
					fos.close();
					oops.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
		}
	}

}
