import java.util.*;

public class Tester8b
{
   public static void main(String[] args)
   {
      IntegerList nums = new IntegerList(10, 100, 1);
      int index;

      // should display each int on its own line with no extra spaces after the int
      System.out.println("The unsorted nums:\n" + nums);

      nums.mySLOsort(new Descending());
      System.out.println("The nums sorted descending:\n" + nums);

      nums.mySLOsort();
      System.out.println("The nums sorted naturally:\n" + nums);

      // calls it to make sure it doesn't crash, you should probably test more!
      index = nums.binarySearch(78);
      System.out.println("The index of 78:\n" + index);
      // add code here to test more stuff...
   }
}
