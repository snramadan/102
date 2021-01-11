/**
 * A simple integer counter.
 *
 * @author Saba Ramadan
 * @version Lab02
 * @version CPE102-05
 * @version Spring 2016
 */

public class Counter
{
    private int count;
    private int modcount;
    private int befreset;
    private int bflag = -1;

    public Counter()
    {
        count = 0;
        modcount = 10;
    }

    public Counter(int x)
    {
        this.modcount = x;
    }

    public int currentCount() { return count; }

    public void incrementCount()
    {
        count = count + 1;
        if (count == modcount)
        {
            count = 0;
        }
    }

    public void reset()
    {
        if (bflag < 0)
        {
            befreset = count;
            count = 0;
            bflag = count;
        }
        else
        {
            unReset();
        }
    }

    public void unReset()
    {
         if (bflag < 0)
         {
             count = count;
         }
         else
         {
             count = befreset;
         }
    }
}
