package in.com.IO;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestWriteExternalizable {
	
	public static void main(String[] args) throws Exception {
		
		Person p= new Person();
		p.id= 1;
		p.name= "krishna";
		p.address= "Indore";
		
				
		FileOutputStream file = new FileOutputStream("C:\\Users\\hp\\Desktop\\rays\\tcx.txt");	
		
		ObjectOutputStream out =new ObjectOutputStream(file);
		
		out.writeObject(p);
		
		out.close();
		file.close();
		
		System.out.println("Object write successfully");
		
	
		
	}
	}


