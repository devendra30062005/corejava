package in.com.IO;

import java.io.FileReader;

public class TestFileReader {
	public static void main(String[] args) throws Exception{
		
		FileReader file = new FileReader("C:\\Users\\hp\\Desktop\\Devendra\\Devendra.txt");
		
		int ch = file.read();
		
		while(ch !=-1) {
			System.out.print((char)ch);
			
			ch = file.read();
		}
		
		file.close();
		
	}

}
