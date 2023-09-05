package in.com.threads;

public class WithoutThreads{
	
	String name = null;
	
	public WithoutThreads(String name) {
		
		this.name =name ;
	}
public void run() {
	for (int i = 1; i <=5; i++) {
		
		System.out.println(i+""+name);
		
	}
}
}


	
			
	
    

