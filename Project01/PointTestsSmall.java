/**
 * A starter JUnit test class to test the Project 01 CartesianPoint.java
 * and PolarPoint.java classes. 
 *
 * @author Saba Ramadan
 * @version Project 01
 * @version CPE102-09
 * @version Spring 2016
 */

import static org.junit.Assert.*;
import org.junit.*;

public class PointTestsSmall
{
    @Test public void cartesianXCoordinateTest()
    {
        Point p = new CartesianPoint(3.0, 4.0);
        assertEquals(3.0, p.xCoordinate(), .0000001);
    }
    
    @Test public void polarXCoordinateTest()
    {
        Point p = new PolarPoint(2.0, Math.toRadians(90.0));
        assertEquals(0.0, p.xCoordinate(), .0000001);
    }

    @Test public void cartesianYCoordinateTest()
    {
        Point p = new CartesianPoint(3.0, 4.0);
        assertEquals(4.0, p.yCoordinate(), .0000001);
    }
   
    @Test public void polarYCoordinateTest()
    {
        Point p = new PolarPoint(2.0, Math.toRadians(180.0));
        assertEquals(0.0, p.yCoordinate(), .0000001);
    }

    @Test public void cartesianRadiusTest()
    {
        Point p = new CartesianPoint(3.0, 4.0);
        assertEquals(5.0, p.radius(), .0000001);
    }
   
    @Test public void polarRadiusTest()
    {
        Point p = new PolarPoint(2.0, Math.toRadians(180.0));
        assertEquals(2.0, p.radius(), .0000001);
    }
    
    @Test public void cartesianAngleTest()
    {
        Point p = new CartesianPoint(4.0, 4.0);
        assertAngleEquals(Math.toRadians(45.0), p.angle());
    }
   
    @Test public void polarAngleTest()
    {
        Point p = new PolarPoint(2.0, Math.toRadians(180.0));
        assertAngleEquals(Math.toRadians(180.0), p.angle());
    }

    @Test public void cartesianDistanceTest()
    {
        Point p1 = new CartesianPoint(3.0, 4.0);
        Point p2 = new CartesianPoint(0.0, 0.0);
        assertEquals(5.0, p1.distanceFrom(p2), .0000001);
    }
   
    @Test public void polarDistanceTest()
    {
        Point p1 = new PolarPoint(1.0, 0.0);
        Point p2 = new PolarPoint(0.0, 0.0);
        assertEquals(1.0, p1.distanceFrom(p2), .0000001);
    }

    @Test public void cartesianRotateTest()
    {
        // (0.0, 0.0) rotate90
        Point p1 = new CartesianPoint(1.0, 0.0);
        Point p2 = p1.rotate90();

        // correct rotate
        assertEquals(0.0, p2.xCoordinate(), .0000001);
        assertEquals(1.0, p2.yCoordinate(), .0000001);
    }
   
    @Test public void polarRotateTest()
    {
        // 0.0:0.0 rotate90
        Point p1 = new PolarPoint(0.0, 0.0);
        Point p2 = p1.rotate90();

        // correct rotate
        assertAngleEquals(Math.toRadians(90.0), p2.angle());
    }
     
    private void assertAngleEquals(double expected, double actual)
    {
        while (actual > 2*Math.PI)
            actual -= 2*Math.PI;
     
        while (actual <= 0)
            actual += 2*Math.PI;

        while (expected > 2*Math.PI)
            expected -= 2*Math.PI;

        while (expected <= 0)
            expected += 2*Math.PI;

        assertEquals(expected, actual, .0000001);
    }
}
