import static org.junit.Assert.*;
import org.junit.*;
import java.lang.reflect.*;

public class PointAcceptanceTests
{
   @Test (timeout = 5000)
   public void architectureTest()
   {
      Field[] fields = CartesianPoint.class.getDeclaredFields();
      assertEquals("CartesianPoint should have two instance variables.", 2,
         fields.length);

      for (Field field : fields)
      {
         assertTrue("All instance variables should be private.",
            Modifier.isPrivate(field.getModifiers()));
      }

      fields = PolarPoint.class.getDeclaredFields();
      assertEquals("PolarPoint should have two instance variables.", 2,
         fields.length);

      for (Field field : fields)
      {
         assertTrue("All instance variables should be private.",
            Modifier.isPrivate(field.getModifiers()));
      }
   }
 @Test (timeout = 5000)
    public void cartesianXCoordinateTest()
   {
      Point p = new CartesianPoint(3.0, 4.0);
      assertEquals("Testing CartesianPoint.xCoordinate.", 3.0,
         p.xCoordinate(), .0000001);
      
      p = new CartesianPoint(-3.0, 4.0);
      assertEquals("Testing CartesianPoint.xCoordinate.", -3.0,
         p.xCoordinate(), .0000001);
      
      p = new CartesianPoint(17.23231, -23.362);
      assertEquals("Testing CartesianPoint.xCoordinate.", 17.23231,
         p.xCoordinate(), .0000001);
      
      p = new CartesianPoint(0, 23.362);
      assertEquals("Testing CartesianPoint.xCoordinate.", 0,
         p.xCoordinate(), .0000001);
   }
   
   @Test (timeout = 5000)
    public void polarXCoordinateTest()
   {
      Point p = new PolarPoint(2.0, Math.toRadians(90.0));
      assertEquals("Testing PolarPoint.xCoordinate.", 0.0, p.xCoordinate(),
         .0000001);
      
      p = new PolarPoint(1.0, Math.toRadians(45.0));
      assertEquals("Testing PolarPoint.xCoordinate.", 0.707106781187,
         p.xCoordinate(), .0000001);

      p = new PolarPoint(1.0, Math.toRadians(135.0));
      assertEquals("Testing PolarPoint.xCoordinate.", -0.707106781187,
         p.xCoordinate(), .0000001);
      
      p = new PolarPoint(2.123, Math.toRadians(0.0));
      assertEquals("Testing PolarPoint.xCoordinate.", 2.123, p.xCoordinate(),
         .0000001);
      
      p = new PolarPoint(2.123, Math.toRadians(180.0));
      assertEquals("Testing PolarPoint.xCoordinate.", -2.123, p.xCoordinate(),
         .0000001);
   }
   @Test (timeout = 5000)
    public void cartesianYCoordinateTest()
   {
      Point p = new CartesianPoint(3.0, 4.0);
      assertEquals("Testing CartesianPoint.yCoordinate.", 4.0,
         p.yCoordinate(), .0000001);
      
      p = new CartesianPoint(3.0, -4.0);
      assertEquals("Testing CartesianPoint.yCoordinate.", -4.0,
         p.yCoordinate(), .0000001);
      
      p = new CartesianPoint(17.23231, -23.362);
      assertEquals("Testing CartesianPoint.yCoordinate.", -23.362,
         p.yCoordinate(), .0000001);
      
      p = new CartesianPoint(23.362, 0);
      assertEquals("Testing CartesianPoint.yCoordinate.", 0, p.yCoordinate(),
         .0000001);
   }
   
   @Test (timeout = 5000)
    public void polarYCoordinateTest()
   {
      Point p = new PolarPoint(2.0, Math.toRadians(180.0));
      assertEquals("Testing PolarPoint.yCoordinate.", 0.0, p.yCoordinate(),
         .0000001);
      
      p = new PolarPoint(1.0, Math.toRadians(135.0));
      assertEquals("Testing PolarPoint.yCoordinate.", 0.707106781187,
         p.yCoordinate(), .0000001);

      p = new PolarPoint(1.0, Math.toRadians(315.0));
      assertEquals("Testing PolarPoint.yCoordinate.", -0.707106781187,
         p.yCoordinate(), .0000001);
      
      p = new PolarPoint(2.123, Math.toRadians(90.0));
      assertEquals("Testing PolarPoint.yCoordinate.", 2.123, p.yCoordinate(),
         .0000001);
      
      p = new PolarPoint(2.123, Math.toRadians(270.0));
      assertEquals("Testing PolarPoint.yCoordinate.", -2.123, p.yCoordinate(),
         .0000001);
   }
    @Test (timeout = 5000)
    public void cartesianRadiusTest()
   {
      Point p = new CartesianPoint(3.0, 4.0);
      assertEquals("Testing CartesianPoint.radius.", 5.0, p.radius(),
         .0000001);
      
      p = new CartesianPoint(-3.0, 4.0);
      assertEquals("Testing CartesianPoint.radius.", 5.0, p.radius(),
         .0000001);
      
      p = new CartesianPoint(1.0, -1.0);
      assertEquals("Testing CartesianPoint.radius.", 1.41421356237,
         p.radius(), .0000001);
      
      p = new CartesianPoint(0.0, 0.0);
      assertEquals("Testing CartesianPoint.radius.", 0.0, p.radius(),
         .0000001);  
      
      p = new CartesianPoint(-2.7, -4.0);
      assertEquals("Testing CartesianPoint.radius.", 4.82597140481,
         p.radius(), .0000001);
   }
   
   @Test (timeout = 5000)
    public void polarRadiusTest()
   {
      Point p = new PolarPoint(2.0, Math.toRadians(180.0));
      assertEquals("Testing PolarPoint.radius.", 2.0, p.radius(), .0000001);
      
      p = new PolarPoint(1.0, Math.toRadians(135.0));
      assertEquals("Testing PolarPoint.radius.", 1.0, p.radius(), .0000001);

      p = new PolarPoint(2.12, Math.toRadians(315.0));
      assertEquals("Testing PolarPoint.radius.", 2.12, p.radius(), .0000001);
      
      p = new PolarPoint(0.0, Math.toRadians(90.0));
      assertEquals("Testing PolarPoint.radius.", 0.0, p.radius(), .0000001);
   }
@Test (timeout = 5000)
    public void cartesianAngleTest()
   {
      Point p = new CartesianPoint(4.0, 4.0);
      assertAngleEquals("Testing CartesianPoint.angle.", Math.toRadians(45.0),
         p.angle());
      
      p = new CartesianPoint(-3.0, 3.0);
      assertAngleEquals("Testing CartesianPoint.angle.", Math.toRadians(135.0),
         p.angle());
      
      p = new CartesianPoint(-2.0, -2.0);
      assertAngleEquals("Testing CartesianPoint.angle.", Math.toRadians(225.0),
         p.angle());
      
      p = new CartesianPoint(1.0, -1.0);
      assertAngleEquals("Testing CartesianPoint.angle.", Math.toRadians(315.0),
         p.angle());
      
      p = new CartesianPoint(-2.7, -4.0);
      assertAngleEquals("Testing CartesianPoint.angle.", 4.11863931367,
         p.angle());
   }
   
   @Test (timeout = 5000)
    public void polarAngleTest()
   {
      Point p = new PolarPoint(2.0, Math.toRadians(180.0));
      assertAngleEquals("Testing PolarPoint.angle.", Math.toRadians(180.0),
         p.angle());
      
      p = new PolarPoint(1.0, Math.toRadians(135.0));
      assertAngleEquals("Testing PolarPoint.angle.", Math.toRadians(135.0),
         p.angle());

      p = new PolarPoint(2.12, Math.toRadians(315.0));
      assertAngleEquals("Testing PolarPoint.angle.", Math.toRadians(315.0),
         p.angle());
      
      p = new PolarPoint(0.0, Math.toRadians(90.0));
      assertAngleEquals("Testing PolarPoint.angle.", Math.toRadians(90.0),
         p.angle());
      
      p = new PolarPoint(0.0, Math.toRadians(221.122));
      assertAngleEquals("Testing PolarPoint.angle.", Math.toRadians(221.122),
         p.angle());
   }
   @Test (timeout = 5000)
    public void cartesianDistanceTest()
   {
      Point p1 = new CartesianPoint(3.0, 4.0);
      Point p2 = new CartesianPoint(0.0, 0.0);
      assertEquals("Testing CartesianPoint.distanceFrom.", 5.0,
         p1.distanceFrom(p2), .0000001);
      
      p1 = new CartesianPoint(3.12345, 4.0);
      p2 = new CartesianPoint(3.12345, 4.0);
      assertEquals("Testing CartesianPoint.distanceFrom.", 0.0,
         p1.distanceFrom(p2), .0000001);
      
      p1 = new CartesianPoint(-7.45, 14.01);
      p2 = new CartesianPoint(3.12345, -15.6);
      assertEquals("Testing CartesianPoint.distanceFrom.", 31.441214113,
         p1.distanceFrom(p2), .0000001);
   }
   
   @Test (timeout = 5000)
    public void polarDistanceTest()
   {
      Point p1 = new PolarPoint(1.0, 0.0);
      Point p2 = new PolarPoint(0.0, 0.0);
      assertEquals("Testing PolarPoint.distanceFrom.", 1.0,
         p1.distanceFrom(p2), .0000001);

      p1 = new PolarPoint(0.0, 1.0);
      p2 = new PolarPoint(0.0, 0.0);
      assertEquals("Testing PolarPoint.distanceFrom.", 0.0,
         p1.distanceFrom(p2), .0000001);
      
      p1 = new PolarPoint(9.0, Math.toRadians(45));
      p2 = new PolarPoint(3.0, Math.toRadians(225));
      assertEquals("Testing PolarPoint.distanceFrom.", 12.0,
         p1.distanceFrom(p2), .0000001);

      p1 = new PolarPoint(7.0, Math.toRadians(45));
      p2 = new PolarPoint(2.7, Math.toRadians(120));
      assertEquals("Testing PolarPoint.distanceFrom.", 6.81957770651,
         p1.distanceFrom(p2), .0000001);
   }
   
   @Test (timeout = 5000)
    public void mixedDistanceTest()
   {
      Point p1 = new PolarPoint(7.0, Math.toRadians(45));
      Point p2 = new CartesianPoint(1.0, 2.0);
      assertEquals("Testing mixed distanceFrom.", 4.92965670105,
         p1.distanceFrom(p2), .0000001);

      p1 = new CartesianPoint(1.0, 2.0);
      p2 = new PolarPoint(7.0, Math.toRadians(45));
      assertEquals("Testing mixed distanceFrom.", 4.92965670105,
         p1.distanceFrom(p2), .0000001);

      p1 = new PolarPoint(7.0, Math.toRadians(133));
      p2 = new CartesianPoint(1.0, -2.0);
      assertEquals("Testing mixed distanceFrom.", 9.16656318836,
         p1.distanceFrom(p2), .0000001);

      p1 = new CartesianPoint(1.0, -2.0);
      p2 = new PolarPoint(7.0, Math.toRadians(133));
      assertEquals("Testing mixed distanceFrom.", 9.16656318836,
         p1.distanceFrom(p2), .0000001);
   }

   @Test (timeout = 5000)
    public void cartesianRotateTest()
   {
      Point p1 = new CartesianPoint(0.0, 0.0);
      Point p2 = p1.rotate90();

      assertEquals("Testing CartesianPoint.rotate90.", 0.0, p2.xCoordinate(),
         .0000001);
      assertEquals("Testing CartesianPoint.rotate90.", 0.0, p2.yCoordinate(),
         .0000001);

      assertEquals("Testing CartesianPoint.rotate90.", 0.0, p1.xCoordinate(),
         .0000001);
      assertEquals("Testing CartesianPoint.rotate90.", 0.0, p1.yCoordinate(),
         .0000001);

      p1 = new CartesianPoint(1.0, 2.0);
      p2 = p1.rotate90();

      assertEquals("Testing CartesianPoint.rotate90.", -2.0, p2.xCoordinate(),
         .0000001);
      assertEquals("Testing CartesianPoint.rotate90.", 1.0, p2.yCoordinate(),
         .0000001);

      assertEquals("Testing CartesianPoint.rotate90.", 1.0, p1.xCoordinate(),
         .0000001);
      assertEquals("Testing CartesianPoint.rotate90.", 2.0, p1.yCoordinate(),
         .0000001);

      p1 = new CartesianPoint(0.0, -1.0);
      p2 = p1.rotate90();

      assertEquals("Testing CartesianPoint.rotate90.", 1.0, p2.xCoordinate(),
         .0000001);
      assertEquals("Testing CartesianPoint.rotate90.", 0.0, p2.yCoordinate(),
         .0000001);

      assertEquals("Testing CartesianPoint.rotate90.", 0.0, p1.xCoordinate(),
         .0000001);
      assertEquals("Testing CartesianPoint.rotate90.", -1.0, p1.yCoordinate(),
         .0000001);

      p1 = new CartesianPoint(-19.73, -0.00124);
      p2 = p1.rotate90();

      assertEquals("Testing CartesianPoint.rotate90.", 0.00124,
         p2.xCoordinate(), .0000001);
      assertEquals("Testing CartesianPoint.rotate90.", -19.73,
         p2.yCoordinate(), .0000001);

      assertEquals("Testing CartesianPoint.rotate90.", -19.73,
         p1.xCoordinate(), .0000001);
      assertEquals("Testing CartesianPoint.rotate90.", -0.00124,
         p1.yCoordinate(), .0000001);

   }
   
   @Test (timeout = 5000)
    public void polarRotateTest()
   {
      Point p1 = new PolarPoint(0.0, 0.0);
      Point p2 = p1.rotate90();   
    
      assertEquals("Testing PolarPoint.rotate90.", 0.0, p2.radius(), .0000001);
      assertAngleEquals("Testing PolarPoint.rotate90.", Math.toRadians(90.0),
         p2.angle());

      assertEquals("Testing PolarPoint.rotate90.", 0.0, p1.radius(), .0000001);
      assertAngleEquals("Testing PolarPoint.rotate90.", 0.0, p1.angle());

      p1 = new PolarPoint(1.0, Math.toRadians(45.0));
      p2 = p1.rotate90();

      assertEquals("Testing PolarPoint.rotate90.", 1.0, p2.radius(), .0000001);
      assertAngleEquals("Testing PolarPoint.rotate90.", Math.toRadians(135.0),
         p2.angle());

      assertEquals("Testing PolarPoint.rotate90.", 1.0, p1.radius(), .0000001);
      assertAngleEquals("Testing PolarPoint.rotate90.", Math.toRadians(45.0),
         p1.angle());

      p1 = new PolarPoint(3.9, Math.toRadians(-45.0));
      p2 = p1.rotate90();

      assertEquals("Testing PolarPoint.rotate90.", 3.9, p2.radius(), .0000001);
      assertAngleEquals("Testing PolarPoint.rotate90.", Math.toRadians(45.0),
         p2.angle());

      assertEquals("Testing PolarPoint.rotate90.", 3.9, p1.radius(), .0000001);
      assertAngleEquals("Testing PolarPoint.rotate90.", Math.toRadians(-45.0),
         p1.angle());

      p1 = new PolarPoint(3.9, Math.toRadians(-135.0));
      p2 = p1.rotate90();

      assertEquals("Testing PolarPoint.rotate90.", 3.9, p2.radius(), .0000001);
      assertAngleEquals("Testing PolarPoint.rotate90.", Math.toRadians(315.0),
         p2.angle());

      assertEquals("Testing PolarPoint.rotate90.", 3.9, p1.radius(), .0000001);
      assertAngleEquals("Testing PolarPoint.rotate90.", Math.toRadians(-135.0),
         p1.angle());
   }
   
   private void assertAngleEquals(String msg, double expected, double actual)
   {
      while (actual > 2*Math.PI)
         actual -= 2*Math.PI;
      
      while (actual <= 0)
         actual += 2*Math.PI;
      
      while (expected > 2*Math.PI)
         expected -= 2*Math.PI;
      
      while (expected <= 0)
         expected += 2*Math.PI;
      
      assertEquals(msg, expected, actual, .0000001);
   }
}
