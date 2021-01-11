/**
 * DES
 *
 * @author Saba Ramadan
 * @version Lab 02 
 * @version CPE102-09
 * @version Spring 2016
 */

public class Greeter
{
    private String name = null; 

    public Greeter(String name)
    {
         this.name  = name;
    }   

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

    public Greeter() 
    {
    } 
}

    
