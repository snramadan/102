/**
 * Main File
 *
 * @author Saba Ramadan
 * @version Lab 02
 * @version CPE102-05
 * @version Spring 2016
 */



public class Driver
{
    public static void main(String[] args)
    {
        Counter ct = new Counter();

        System.out.println("Initial count: " + ct.currentCount());

        ct.incrementCount();

        System.out.println("Incremented count: " + ct.currentCount());

        ct.unReset();

        System.out.println("Unreset: " + ct.currentCount());

        ct.incrementCount();

        System.out.println("Incremented count: " + ct.currentCount());

        ct.reset();

        System.out.println("Reset: " + ct.currentCount());

        ct.incrementCount();

        System.out.println("Incremented count: " + ct.currentCount());

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

        System.out.println("Count: " + ct.currentCount());

        Counter ct2 = new Counter(3);

        System.out.println("Initial count: " + ct2.currentCount());

        ct2.incrementCount();

        System.out.println("Incremented count: " + ct2.currentCount());

        ct2.incrementCount();

        System.out.println("Incremented count: " + ct2.currentCount());

        ct2.incrementCount();

        System.out.println("Incremented count: " + ct2.currentCount());       
        
        ct2.incrementCount();

        System.out.println("Incremented count: " + ct2.currentCount());
   }

}
