import java.util.*;

public class Tester
{
   public static void main(String[] args)
   {
      IntegerList nums = new IntegerList(10, 100);

      // should display each int on its own line with no extra spaces after the int
      System.out.println("The unsorted nums:\n" + nums);

      // should all be false 
      System.out.println("The list is sorted naturally? " + nums.isSorted());
      System.out.println("The list is sorted descending? " + nums.isSorted(new Descending()));
      System.out.println("The list is sorted oddEvenAscending? " + nums.isSorted(new OddEvenAscending()));
      System.out.println("The list is sorted oddEvenDescending? " + nums.isSorted(new OddEvenDescending()));

      // sort them "naturally"
      nums.sort();
      System.out.println("\nSorted Naturally:\n" + nums);

      // should say true for "naturally"
      System.out.println("The list is sorted naturally? " + nums.isSorted());
      System.out.println("The list is sorted descending? " + nums.isSorted(new Descending()));
      System.out.println("The list is sorted oddEvenAscending? " + nums.isSorted(new OddEvenAscending()));
      System.out.println("The list is sorted oddEvenDescending? " + nums.isSorted(new OddEvenDescending()));

      // code to test the seeded constructor and get method
      nums = new IntegerList(3, 100, 1);

      // nums should be... 85, 88, 47
      System.out.println("The unsorted nums:\n" + nums);

      // make sure get() is implemented and works
      System.out.println("The number in index 1 is: " + nums.get(1));

      // add code here to test more stuff...
   }
}
