/**
 * DES
 *  
 * @author Saba Ramadan
 * @version Lab 04
 * @version CPE102-05
 * @version Fall 2016
 */

import java.util.Random;

public class RochambeauPlayer
{
    private String name;
    private int seed;
    private int wins;
    private int throwType = -1;
    private Random rand = new Random();

    //Sets name variable to name that is inputed
    public RochambeauPlayer(String name)
    {
        this.name = name;
    }

    //sets name and seed from input
    public RochambeauPlayer(String name, int seed)
    {
        this.name = name;
        this.seed = seed;
        rand.setSeed(seed);
    }

    //inquery for name
    public String getName()
    {
        return name;
    }

    //inquery for number of wins
    public int getWins()
    {
        return wins;
    }

    //adds a win to the number of wins
    public void incrementWins()
    {
        wins = wins + 1;
    }

    //inquery for the last throw made in string form
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

    //make a throw through the random generator
    public int makeThrow()
    {
        this.throwType = rand.nextInt(3);
        return this.throwType;
    }

    //makes throw through direct input
    public int makeThrow(int throwType)
    {
        this.throwType = throwType;
        return this.throwType;
    }

    //inquery fro number of wins in string form 
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
   
