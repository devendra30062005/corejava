package in.com.IO;

import java.io.FileWriter;
import java.io.PrintWriter;

public class TestPrintWriter {
	
	public static void main(String[] args)throws Exception {
		
		FileWriter file = new FileWriter("C:\\Users\\hp\\Desktop\\rays\\devu.txt");
		
		PrintWriter out = new PrintWriter(file);
		
		out.println("Hello how are you??");
		
		out.close();
		file.close();
		
	}

}
