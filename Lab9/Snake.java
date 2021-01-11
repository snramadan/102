/*
 * DES
 *
 * @author Saba Ramadan
 * @version Lab 09
 * @version CPE102-09
 * @version Spring 2016
 */

public class Snake implements TotemPole
{
    private TotemPole rest;

    public Snake(TotemPole rest)
    {
        this.rest = rest;
    }

    public int power()
    {
        return 3 + rest.power();
    }

    public int height()
    {
        return 1 + rest.height();
    }

    public boolean chiefPole(int bearCount)
    {
        bearCount = 0;
        return rest.chiefPole(bearCount);
    }
}
