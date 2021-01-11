/**
 * DES
 *
 * @author Saba Ramadan
 * @version Project 01
 * @version CPE102-09
 * @version Spring 2016
 */

public class PolarPoint implements Point
{
     private double angle;
     private double radius;

     public PolarPoint(double radius, double angle)
     {
         this.radius = radius;
         this.angle = angle;
     }

     public double xCoordinate()
     {
          double x = radius * Math.cos(angle);
          return x;
     }
 
     public double yCoordinate()
     {
         double y = radius * Math.sin(angle);
         return y;
     }
   
     public double angle()
     {
         return angle;
     }

     public double radius()
     {
         return radius;
     }

     public double distanceFrom(Point other)
     {
         double r1 = radius;
         double r2 = other.radius();
         double a1 = angle;
         double a2 = other.angle();
         double distance = Math.sqrt(Math.pow(r1, 2)+Math.pow(r2, 2) - 2*(r1)*(r2)*Math.cos(a2-a1));
         return distance; 
     }

     public Point rotate90()
     {
         Point rotangle = new PolarPoint(radius, (angle + (Math.PI/2)));
         return rotangle; 
     }

}
    
