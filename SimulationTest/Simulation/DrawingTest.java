package Simulation;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DrawingTest
{
	private Drawing d;
	

	@Before
	public void before()
	{
		d = new Drawing();
	}

	@Test
	public void verify()
	{
		// use this instead of rectangle so everything is data based instead of visual 
		//and dont use random numbers in tests, you want concrete values. Values that you will know the output
		int xCoordinate = 130;
		int yCoordinate = 180;
	    int distance = 500;
	    int angle = 90;
	    Point2D nextPoint = d.getNextCoordinate(xCoordinate, yCoordinate, distance, angle);
	    assertEquals(130, nextPoint.x);
	    assertEquals(680, nextPoint.y);
		
		
	}
	@Test
	public void verifyDistance()
	{
		int width = 350;
		int height = 250;
		assertEquals(430,d.calcMaxDistance(width, height));
	}
	
	@Test
	public void verfiyDistancewithCoordinates()
	{
		int xCoordinate = 130;
		int yCoordinate = 180;
		int distance = d.calcMaxDistance(500, 300);//583.1
		int angle = 90;
		Point2D nextPoint = d.getNextCoordinate(xCoordinate, yCoordinate, distance, angle);
		assertEquals(130, nextPoint.x);
		assertEquals(763, nextPoint.y);
		
	}
	
	
	
}
