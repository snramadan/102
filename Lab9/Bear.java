/*
 * DES
 *
 * @author Saba Ramadan
 * @version Lab 09
 * @version CPE102-09
 * @version Spring 2016
 */

public class Bear implements TotemPole
{
    private TotemPole rest;
  
    public Bear(TotemPole rest)
    {
        this.rest = rest;
    }
   
    public int power()
    {
        return 5 + rest.power(); 
    }

    public int height()
    {
        return 1 + rest.height();
    }

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
