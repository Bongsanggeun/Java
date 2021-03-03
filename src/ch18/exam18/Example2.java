package ch18.exam18;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Example2 {

	public static void main(String[] args) throws Exception{
		String filePath1 = "C:\\BongJava\\bong\\src\\ch18\\exam17\\photo.jpg";
		OutputStream os = new FileOutputStream("filePath1");
		DataOutputStream dos = new DataOutputStream(os);
		
		dos.writeInt(3);
		dos.writeDouble(10.5);
		dos.writeBoolean(true);
		dos.writeUTF("ȫ�浿");
		dos.flush();
		
		dos.close();
	}

}
