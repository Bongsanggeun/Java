package ch18.exam04;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Example {

	public static void main(String[] args) {
		
		String filePath = "C:\\\\BongJava\\\\bong\\\\src\\\\ch18\\\\exam02\\\\data.txt";
		try {
			OutputStream os = new FileOutputStream(filePath);
			os.write(65);
			os.write(66);
			os.write(67);
			os.flush();
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
