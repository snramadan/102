/**
 * DES
 *
 * @author Saba Ramadan
 * @version Lab 03
 * @version CPE102-09
 * @version Spring 2016
 */

import java.util.Random;

public class RochambeauPlayer
{
    private String name;
    private int seed;
    private int wins;
    private int throwType = -1;
    private Random rand = new Random();
 
    public RochambeauPlayer(String name)
    {
        this.name = name;
    }

    public RochambeauPlayer(String name, int seed)
    {
        this.name = name;
        this.seed = seed;
        rand.setSeed(seed);
    }

    public String getName()
    {
        return name;
    }   

    public int getWins()
    {
        return wins;
    }  

    public void incrementWins()
    {
        wins = wins + 1;
    }
        
    public String lastThrow()
    {
       if (throwType == 0)
       {
           return "Rock";
       }
       else if (throwType == 1)
       {
           return "Paper";
       }
       else if (throwType == 2)
       {
           return "Scissors";
       }
       else
       {
           return "No Throw";
       }
    }
 
    public int makeThrow()
    {        
        this.throwType = rand.nextInt(3);
        return this.throwType;
    }

    public int makeThrow(int throwType)
    {
        this.throwType = throwType;
        return this.throwType;
    }

    public String toString()
    {
        if (wins == 1)
        { 
            return name + " has " + "1 win.";
        }
        else
        {
            return name + " has " + wins + " wins.";
        }
    }
}
