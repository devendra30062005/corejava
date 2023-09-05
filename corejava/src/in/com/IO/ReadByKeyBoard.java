package in.com.IO;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadByKeyBoard {

	

	public static void main(String[] args)throws Exception {
		
		System.out.println("plz enter here....");
		
		InputStreamReader isReader= new InputStreamReader(System.in);
		
		
		BufferedReader in = new BufferedReader(isReader);
		
		
		FileWriter write = new FileWriter("C:\\Users\\hp\\Desktop\\Devendra\\xyz.txt");
		
		
		
		
		PrintWriter out = new  PrintWriter(write);
		
		String line = in .readLine();
		
		while(!(line.equals("bye"))) {
			
			out.println (line);
			
			line = in . readLine();
			
		}
		
		System.out.println("This compiler is stopped....!!!!");
		
		
		out.close();
		write.close();
		in.close();
		}
		

	}


