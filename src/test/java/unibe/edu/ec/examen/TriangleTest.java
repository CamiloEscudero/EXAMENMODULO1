package unibe.edu.ec.examen;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TriangleTest {
	private Triangle triangle;
	
	@Before
	public void before() {
		this.triangle= new Triangle(5.5);
	
	}

	@Test
	public void testCalculatePerimeter() {
		assertEquals(16.5, triangle.calculatePerimeter(), 0.10);
	}
	
	@Test
	public void testCalculateArea() {
		assertEquals(16.5, triangle.calculateArea(6.0), 0.10);
	}
	
	@Test
	public void testCalculateVolumeofapyramid() {
		assertEquals(12.5,triangle.calculateVolumeofapyramid(6.0,2.5), 0.10);
	}

}
