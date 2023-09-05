package in.com.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestReadImage {
	
	public static void main(String[] args)throws Exception {
		
		
		FileInputStream in = new FileInputStream ("C:\\Users\\hp\\Desktop\\Devendra\\DEVENDRA.jpeg");
		
		FileOutputStream out = new FileOutputStream("C:\\Users\\hp\\Desktop\\Devendra\\xyz.jpeg");
		
		
		int ch = in.read();
		
		while (ch != - 1) {
		
		out. write(ch);
		
		
		
		System.out.println((char)ch);
		
		ch = in.read();
		}
		
		out.close();
		in.close();
		
		System.out.println("Nice Pic...!!");
		
		
	}

	}




