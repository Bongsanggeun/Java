package ch18.exam11;

import java.io.IOException;
import java.io.InputStream;

public class Example {

	public static void main(String[] args) {
		try {
			InputStream is = System.in;
			byte[] data = new byte[100];
			while(true) {
				int readNum = is.read(data);
				String srt = new String(data, 0, readNum);
				System.out.println(srt);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
