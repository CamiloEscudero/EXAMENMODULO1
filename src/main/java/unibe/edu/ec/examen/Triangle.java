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
	
}
