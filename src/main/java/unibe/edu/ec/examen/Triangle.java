package unibe.edu.ec.examen;

public class Triangle {
	private double side;
	
	public Triangle(double  side) {
		super();
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
    public double calculatePerimeter() {
    	double perimeter = side+side+side;
    	return perimeter;
    }
    
    public double calculateArea(double height) {
    	double area = side*height/2;
		return area;
    }
	
    public double calculateVolumeofapyramid(double height,double side) {
    	double volume = (1.0/3.0)*side*side*height;
    	return volume;
    }
}
