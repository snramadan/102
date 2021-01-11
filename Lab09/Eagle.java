/*
 * Eagle
 * 
 * @author Saba Ramadan
 * @version Lab 09
 * @version CPE102-05
 * @version Fall 2016
 */

public class Eagle implements TotemPole
{
    //empty constructor 
    public Eagle()
    {
    }

    //the total power of the pole
    public int power()
    {
        return 2;
    }

    //the number of heads in the pole
    public int height()
    {
        return 1;
    }

    //is this pole worthy of a chief
    public boolean chiefPole(int bearCount)
    {
        return false;
    }
}
