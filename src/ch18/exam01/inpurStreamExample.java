package ch18.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class inpurStreamExample {

	public static void main(String[] args) {
		
		String filePath = "C:\\BongJava\\bong\\src\\ch18\\o1\\data.txt";
		try {
			InputStream is = new FileInputStream(filePath);
			//规过1
			/*while(true) {
				int data = is.read();
				if(data == -1) {
					break;
				}
				System.out.println(data);	
			}*/
			
			//规过2
			int data = -1;
			while((data = is.read()) != -1) {
				 System.out.print(data);
				}
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}