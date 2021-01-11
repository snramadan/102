/*
 * Snake
 *
 * @author Saba Ramadan
 * @version Lab 09
 * @version CPE102-05
 * @version Fall 2016
 */

public class Snake implements TotemPole
{
    //instance variable
    private TotemPole rest;

    //constructor that takes in the totem pole 
    public Snake(TotemPole rest)
    {
        this.rest = rest;
    }

    //the total power of the pole
    public int power()
    {
        return 3 + rest.power();
    }

    // the number of heads in the pole
    public int height()
    {
        return 1 + rest.height();
    }

    //is this pole worthy of a chief
    public boolean chiefPole(int bearCount)
    {
        bearCount = 0;
        return rest.chiefPole(bearCount);
    }
}
