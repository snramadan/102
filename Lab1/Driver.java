/**
 * Main File
 *
 * @author Saba Ramadan
 * @version Lab 01
 * @version CPE102-09
 * @version Spring 2016
 */

public class Driver
{
    public static void main(String[] args)
    {
        Counter ct = new Counter();

        System.out.println("Initial count: " + ct.currentCount());

        ct.incrementCount();

        System.out.println("Incremented once: " + ct.currentCount());

        ct.unReset();
       
        System.out.println("Unreset: " + ct.currentCount());
   
        ct.incrementCount();

        System.out.println("Incremented twice: " + ct.currentCount());

        ct.reset();
   
        System.out.println("Reset: " + ct.currentCount());

        ct.unReset();
 
        System.out.println("Unreset: " + ct.currentCount());

        ct.incrementCount();
        ct.incrementCount();
        ct.incrementCount();
        ct.incrementCount();
        ct.incrementCount();
        ct.incrementCount();
        ct.incrementCount();
        ct.incrementCount();

        System.out.println("Mod correction: " + ct.currentCount());
    }
}

