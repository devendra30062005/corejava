package in.com.oopsabs;

public class TestShape {
	
	public static void main(String[] args) {
		
		
		Rectangle r = new Rectangle();
		
		r.hello();
		r.area();
		
		Shape s = new Rectangle();
		
		s.hello();
		
		Shape.hello();
	}

}
