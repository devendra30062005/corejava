package in.com.oops;

public class TestShape {
	
	public static void main(String[] args) {
		
		Circle c =   new Circle ();
		c.setColor("Red");
		c.setBorderWidth(5);
		c.setRadius(2);
		
		
		Rectangle r = new Rectangle();
		r.setColor("black");
		r.setBorderWidth(5);
		
		Triangle t = new Triangle();
		t.setColor("purple");
		
		

		System.out.println(c.getColor());
		
		System.out.println(c.getBorderWidth());
		
		System.out.println(c.getRadius());
		
		System.out.println(c.area());
		
		System.out.println(r.getColor());
		
		System.out.println(r.getBorderWidth());
		
		System.out.println(t.getColor());
		
		
		
	
	}

}
