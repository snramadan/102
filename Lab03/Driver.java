/**
 * Des
 *
 * @author Saba Ramadan
 * @version Lab 03
 * @version CPE102-05
 * @version Fall 2016
 */

import java.util.*;

public class Driver
{
    public static void main(String[] args)
    {
        //Declare and construct a Scanner object
        Scanner scanner = new Scanner(System.in);
        String greeting;
        String name;
        Greeter greeter;
 
        //Prompt for a name 
        System.out.print("What is your name? ");

        //Read the name using the scanner
        name = scanner.nextLine();

        //Construct a Greeter object 
        greeter = new Greeter(name);

        //Get the greetong and save it to a String
        greeting = greeter.greet();
    
        //Display the greeting to the command-line
        System.out.println(greeting);
        
        System.out.println("Greet someone you can't remember ... ");
        greeter = new Greeter();
        greeting = greeter.greet();
        System.out.println(greeting);
    }
}
