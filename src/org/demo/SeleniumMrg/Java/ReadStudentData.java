package org.demo.SeleniumMrg.Java;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadStudentData {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("data.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object o = ois.readObject();
			Student s = null;
			if (o instanceof Student)
				s = (Student) o;
			System.out.println(s.name + "  " + s.Dept + " " + s.roll);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
