package in.com.oops;

public class Circle extends Shape{
	
	private double radius;
	
	public double   getRadius  () {
		return radius;
	}
	
    public void setRadius (double r) {
    	radius = r;
    }
    
    public double area() {
    	
    double area = 3.14* radius * radius;
    
    return area;
    

	}
    	
    	
    }

