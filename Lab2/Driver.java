/**
 * Des`
 *
 * @author Saba Ramadan
 * @version Lab 02
 * @version CPE102-09
 * @version Spring 2016
 */

import java.util.*;

public class Driver
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String greeting;
        String name;
        Greeter greeter;

        System.out.print("What is your name? ");
   
        name = scanner.nextLine();

        greeter = new Greeter(name);

        greeting = greeter.greet();

        System.out.println(greeting);

        System.out.println("Greet someone you can't remember ... ");
        greeter = new Greeter();
        greeting = greeter.greet();
        System.out.println(greeting);
    }
} 
