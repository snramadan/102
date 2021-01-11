/*
 * DES
 *
 * @author Saba Ramadan
 * @version Lab 07
 * @version CPE102-09
 * @version Spring 2016
 */

public class CircleTest
{
    public static void main(String[] args)
    {
        try
        {
            Circle c1 = new Circle(-20);
            System.out.println(c1);
        }
        catch (ZeroRadiusException e) 
        {
            System.out.println(e.getMessage());
        }
        catch (NegativeRadiusException e)
        {
            System.out.println(e.getMessage() + ": " + e.radius());
        }
    }
}

