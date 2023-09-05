package in.com.oops;

public class Shape {
	
	private String color = null;
	
	private int borderwith = 0;
			
	public Shape() {

}
	public Shape(String color,int borderWith){
		this.color = color;
		this.borderwith = borderwith;
	}
	public void setColor(String color) {
		this.color = color;
	} 
	
	public String getColor() {
		return color;
	}
	
	public void setBorderWidth(int borderWidth) {
		this.borderwith = borderWidth;
	}
	
	public int getBorderWidth() {
		return borderwith;
	}
		
}	
	
		
	
