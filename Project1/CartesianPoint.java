/**
 * DES
 *
 * @author Saba Ramadan
 * @version Project 01
 * @version CPE102-05
 * @version Fall 2016
 */

public class CartesianPoint implements Point
{
    private double xCoord;
    private double yCoord;

    //sets x and y coordinates
    public CartesianPoint(double xCoord, double yCoord)
    {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    //Returns x coordinate at this Point  
    public double xCoordinate()
    {
        return xCoord;
    }

    //Returns y coordinate at this Point
    public double yCoordinate()
    {
        return yCoord;
    }

    //Computes angle at this Point
    public double angle()
    {
        double angle = Math.atan2(yCoord, xCoord);
        return angle;
    }

    //Computes radius at this Point
    public double radius()
    {
        double radius = Math.sqrt((Math.pow(xCoord, 2)) + (Math.pow(yCoord, 2)));
        return radius;
    }

    //Computes distance from this Point to another point
    public double distanceFrom(Point other)
    {
        double distance = Math.sqrt(Math.pow((xCoord - other.xCoordinate()), 2) + Math.pow((yCoord - other.yCoordinate()), 2));
        return distance;
    }

    //Computes the equivalent Cartesian Point for this Point rotated 90 degrees by switching the x and y coordinate and making y negative
    public Point rotate90()
    {
        Point rotpoint = new CartesianPoint(-yCoord, xCoord);
        return  rotpoint;
    }

}
