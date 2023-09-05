package in.com.IO;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestSerializable {
	
    public static void main(String[] args) throws Exception {
    	
    	MarkSheet m = new MarkSheet();
    	
    	m.id = 1;
    	m.name = "krishna";
    	m.physics = 80;
    	m.chemistry= 80;
    	m.maths = 80;
    	m.total = m.physics+ m.chemistry+ m.maths;
    	
    	FileOutputStream file = new FileOutputStream("C:\\Users\\hp\\Desktop\\rays\\rays.txt");
    	
    	ObjectOutputStream out = new ObjectOutputStream (file);
    	
    	out.writeObject(m);
    	
    	out.close();
    	file.close();
    	
    	System.out.println("Object write successfully....!!!!!");
		
	}
}
