/**
 * DES
 *  
 * @author Saba Ramadan
 * @version Lab 04
 * @version CPE102-05
 * @version Fall 2016
 */

public class Rochambeau
{
    public static final int ROCK = 0;
    public static final int PAPER = 1;
    public static final int SCISSORS = 2;

    //Figures out the winner depending on what the input throw is and what the program throws
    public static int getWinner(int throw1, int throw2)
    {
        if (throw1 == ROCK)
        {
            if (throw2 == PAPER)
            {
                return -1;
            }
            else if (throw2 == SCISSORS)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }

        else if (throw1 == PAPER)
        {
            if (throw2 == ROCK)
            {
                return 1;
            }
            else if (throw2 == SCISSORS)
            {
                return -1;
            }
            else
            {
                return 0;
            }
        }

        else if (throw1 == SCISSORS)
        {
            if (throw2 == PAPER)
            {
                return 1;
            }
            else if (throw2 == ROCK)
            {
                return -1;
            }
            else
            {
                return 0;
            }
        }

        else
        {
            return 0;
        }
    }
}

