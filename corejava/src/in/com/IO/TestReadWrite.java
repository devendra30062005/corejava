package in.com.IO;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class TestReadWrite {
	public static void main(String[] args) throws Exception{
		

		FileReader read = new FileReader("C:\\Users\\hp\\Desktop\\Devendra\\Devendra.txt");
		
		BufferedReader in = new BufferedReader(read);
		
		FileWriter write = new FileWriter("C:\\Users\\hp\\Desktop\\Devendra\\Krishna.txt",true);
		
		PrintWriter out = new PrintWriter(write);
		
		String line = in.readLine();
		
		while(line!=null) {
			
			out.println(line);
			
			line = in.readLine();
		}
		
		out.close();
		write.close();
		in.close();
		read.close();
		
	}

		
		
		
		
		
	}
	
