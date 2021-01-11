/**
 * DES
 *
 * @author Saba Ramadan
 * @version Project 01
 * @version CPE102-09
 * @version Spring 2016
 */

public class CartesianPoint implements Point
{
    private double xCoord;
    private double yCoord;
 
    public CartesianPoint(double xCoord, double yCoord)
    {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    public double xCoordinate()
    {
        return xCoord;
    }
   
    public double yCoordinate()
    {
        return yCoord;
    }

    public double angle()
    {
        double angle = Math.atan2(yCoord, xCoord); 
        return angle;
    }
    
    public double radius()
    {
        double radius = Math.sqrt((Math.pow(xCoord, 2)) + (Math.pow(yCoord, 2)));
        return radius;
    }
 
    public double distanceFrom(Point other)
    {
        double distance = Math.sqrt(Math.pow((xCoord - other.xCoordinate()), 2) + Math.pow((yCoord - other.yCoordinate()), 2)); 
        return distance;
    }

    public Point rotate90()
    {  
        Point rotpoint = new CartesianPoint(-yCoord, xCoord);
        return  rotpoint;       
    }

}
