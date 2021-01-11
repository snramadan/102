/*
 * Totem Pole
 *
 * @author Saba Ramadan
 * @version Lab 09
 * @version CPE102-05
 * @version Fall 2016
 */

public interface TotemPole
{
    // the total power of the pole
    public int power();
  
    //the number of heads in the pole
    public int height();

    //is this pole worthy of a chief
    public boolean chiefPole(int bearCount); 
}
