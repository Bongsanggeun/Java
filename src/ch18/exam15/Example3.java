package ch18.exam15;

import java.io.File;

public class Example3 {

	public static void main(String[] args) {
		File file = new File("C:/Temp");
		String[] list = file.list();
		for(String name : list) {
			System.out.println(name);
		}
	}

}
