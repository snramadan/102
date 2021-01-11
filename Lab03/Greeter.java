/**
 * DES
 * 
 * @author Saba Ramadan
 * @version Lab 03 
 * @version CPE102-05
 * @version Fall 2016
 */

public class Greeter
{
    private String name = null;

    //Default Constructor 
    public Greeter()
    {
    }

    //Contructor that takes in a string argument
    public Greeter(String name)
    {
         this.name  = name;
    }

    //Method that prints out differnt things according to name
    public String greet()
    {
         if (name == null)
         {
             return "Heyyyyyyyy Buddddyyyyyy";
         }
         else
         {
             return "Hello " + name;
         }
    }

}
