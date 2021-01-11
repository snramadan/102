/*
 * Bear
 *
 * @author Saba Ramadan
 * @version Lab 09
 * @version CPE102-05
 * @version Fall 2016
 */

public class Bear implements TotemPole
{
    //instance variable
    private TotemPole rest;
  
    //constructor that sets totem pole 
    public Bear(TotemPole rest)
    {
        this.rest = rest;
    }
   
    //the total power of the pole
    public int power()
    {
        return 5 + rest.power(); 
    }

    // the number of heads in the pole
    public int height()
    {
        return 1 + rest.height();
    }

    //is this pole worthy of a chief
    public boolean chiefPole(int bearCount)
    {
        if (bearCount == 2)
        {
            return true;
        }
        else 
        {
            return rest.chiefPole(bearCount + 1);
        }
    }
}
