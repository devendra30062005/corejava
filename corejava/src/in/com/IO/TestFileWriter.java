package in.com.IO;

import java.io.FileWriter;

public class TestFileWriter {
	
	public static void main(String[] args)throws Exception {
		
		FileWriter file = new FileWriter("C:\\Users\\hp\\Desktop\\rays\\Devendra.txt",true);
		
		file.write("devendra\n");
		
		file.write("krishna");
		
		file.close();
		
	}

}
