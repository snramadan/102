/**
 * Point Implementation
 *
 * @author Saba Ramadan
 * @version Project 01
 * @version CPE102-05
 * @version Fall 2016
 */

public interface Point
{
    // Query for x coordinate
    double xCoordinate();

    //Query for y coordinate
    double yCoordinate();

    //Query for the radius of the point as a Polar coordinate
    double radius();
    
    // Query for the angle of this point as if it were a Polar Coordinte type point
    double angle();

    //Compute teh distance between this point and another point
    double distanceFrom(Point other);

    //Query for Cartesian Point = to this point rotated 90 degrees
    Point rotate90();
}
