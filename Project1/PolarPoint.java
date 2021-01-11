/**
 * DES
 *
 * @author Saba Ramadan
 * @version Project 01
 * @version CPE102-05
 * @version Fall 2016
 */

public class PolarPoint implements Point
{
     private double angle;
     private double radius;

     //Sets radius and angle from inquery 
     public PolarPoint(double radius, double angle)
     {
         this.radius = radius;
         this.angle = angle;
     }

     //Query for x coordinate by using the angle and radius to give the double x value 
     public double xCoordinate()
     {
          double x = radius * Math.cos(angle);
          return x;
     }

     //Query for y coordinate by using the angle and radius to give the double y value 
     public double yCoordinate()
     {
         double y = radius * Math.sin(angle);
         return y;
     }
   
     //Returning the angle value
     public double angle()
     {
         return angle;
     }

     //Returning the radius value 
     public double radius()
     {
         return radius;
     }

     //calculating the distance from this Polar Point to another Polar Point using the pythagorean theorem 
     public double distanceFrom(Point other)
     {
         double r1 = radius;
         double r2 = other.radius();
         double a1 = angle;
         double a2 = other.angle();
         double distance = Math.sqrt(Math.pow(r1, 2)+Math.pow(r2, 2) - 2*(r1)*(r2)*Math.cos(a2-a1));
         return distance;
     }

     //Rotate the angle and radius by 90 degrees
     public Point rotate90()
     {
         Point rotangle = new PolarPoint(radius, (angle + (Math.PI/2)));
         return rotangle;
     }

}

