/*
 * DES
 *
 * @author Saba Ramadan
 * @version Lab 07
 * @version CPE102-09
 * @version Spring 2016
 */

public class NegativeRadiusException extends CircleException
{
    private double radius;

    public NegativeRadiusException(double radius)
    {  
        super("negative radius");
        this.radius = radius;
    }

    public double radius()
    {
        return radius;
    }
}
