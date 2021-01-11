/**
 * Point implementation 
 *
 * @author Saba Ramadan
 * @version Project 01
 * @version CPE102-09
 * @version Spring 2016
 */

public interface Point
{
    double xCoordinate();
    double yCoordinate();
    double radius();
    double angle();
    double distanceFrom(Point other);
    Point rotate90();
}
