import static org.junit.Assert.*;
import org.junit.*;
import java.lang.reflect.*;
import org.junit.runners.MethodSorters;
import org.junit.rules.*;
import org.junit.runner.Description;
import java.util.concurrent.TimeUnit;
import java.util.*;

public class Lab08AcceptanceTests
{   
   @Rule
   public TestRule watcher = new TestWatcher() {
      protected void starting(Description description) {
         System.out.print("Starting: " + description.getMethodName() + "...");
      }
   };
   
   @Rule
   public Stopwatch sw = new Stopwatch() {
      protected void finished(long nanos, Description description) {
         System.out.println(" (" + runtime(TimeUnit.MILLISECONDS) + " ms)");
      }
      protected void succeeded(long nanos, Description description) {
         System.out.print("Passed");
      }
      protected void failed(long nanos, Throwable e, Description description) {
         System.out.print("Failed");
      }
   };
   
   private static int countModifiers(Field[] fields, int modifier)
   {
      int count = 0;
      
      for (Field f : fields)
      {
         if (f.getModifiers() == modifier)
         {
            count++;
         }
      }
      
      return count;
   }
   
   private static int countModifiers(Method[] methods, int modifier)
   {
      int count = 0;
      
      for (Method m : methods)
      {
         if (m.getModifiers() == modifier)
         {
            count++;
         }
      }
      
      return count;
   }
   
   @Test (timeout = 5000)
   public void integerListArchitectureTest()
   {
      Class c = IntegerList.class;
      Field[] fields = c.getDeclaredFields();
      Constructor[] constructors = c.getDeclaredConstructors();
      
      assertEquals("IntegerList should have one declared field.", 
                   1, fields.length); 
      assertEquals("IntegerList's instance variable should be private.", 
                   Modifier.PRIVATE, fields[0].getModifiers());

      assertEquals("IntegerList should have two constructors.", 
                   2, constructors.length); 
            
      assertEquals("Parent of IntegerList should be Object.", 
                   "java.lang.Object", c.getSuperclass().getName());   
   }
   
   @Test (timeout = 5000)
   public void descendingArchitectureTest()
   {
      Class c = Descending.class;
      Field[] fields = c.getDeclaredFields();
      Method[] methods = c.getDeclaredMethods();
      Constructor[] constructors = c.getDeclaredConstructors();
      Class[] interfaces = c.getInterfaces();
      
      assertEquals("Descending should have no declared fields (instance variables).", 
                   0, fields.length); 
            
      assertEquals("Parent of Descending should be Object.", 
                   "java.lang.Object", c.getSuperclass().getName());   
            
      assertEquals("Descending should implement one interface.", 
                   1, interfaces.length); 
      assertEquals("Descending should implement Comparator.", 
                   Comparator.class, interfaces[0]);   
   }
   
   @Test (timeout = 5000)
   public void oddEvenAscendingArchitectureTest()
   {
      Class c = OddEvenAscending.class;
      Field[] fields = c.getDeclaredFields();
      Method[] methods = c.getDeclaredMethods();
      Constructor[] constructors = c.getDeclaredConstructors();
      Class[] interfaces = c.getInterfaces();
      
      assertEquals("OddEvenAscending should have no declared fields (instance variables).", 
                   0, fields.length); 
            
      assertEquals("Parent of OddEvenAscending should be Object.", 
                   "java.lang.Object", c.getSuperclass().getName());   
            
      assertEquals("OddEvenAscending should implement one interface.", 
                   1, interfaces.length); 
      assertEquals("OddEvenAscending should implement Comparator.", 
                   Comparator.class, interfaces[0]);   
   }
   
   @Test (timeout = 5000)
   public void oddEvenDescendingArchitectureTest()
   {
      Class c = OddEvenDescending.class;
      Field[] fields = c.getDeclaredFields();
      Method[] methods = c.getDeclaredMethods();
      Constructor[] constructors = c.getDeclaredConstructors();
      Class[] interfaces = c.getInterfaces();
      
      assertEquals("OddEvenDescending should have no declared fields (instance variables).", 
                   0, fields.length); 
            
      assertEquals("Parent of OddEvenDescending should be Object.", 
                   "java.lang.Object", c.getSuperclass().getName());   
            
      assertEquals("OddEvenDescending should implement one interface.", 
                   1, interfaces.length); 
      assertEquals("OddEvenDescending should implement Comparator.", 
                   Comparator.class, interfaces[0]);   
   }
   
   @Test (timeout = 5000)
   public void integerListConstructtorTest()
   {
      IntegerList nums = new IntegerList(10000, 100);
	   int num;

      for (int i=0; i<10000; i++)	
	   {
		   num = nums.get(i);
          if (num < 0 || num >= 100)
            fail();		
	   }		
   }	
   
   @Test (timeout = 5000)
   public void integerListConstructtorTest2()
   {
      IntegerList nums = new IntegerList(5, 100, 50);
      int[] expected = {17, 88, 93, 12, 51};

      for (int i=0; i<5; i++)
      {
         assertEquals(expected[i], (int)nums.get(i));
      }         
   }  
   
   @Test (timeout = 5000)
   public void integerListConstructtorTest3()
   {
      IntegerList nums = new IntegerList(10000, 10);
	   int num;

      for (int i=0; i<10000; i++)	
	   {
		   num = nums.get(i);
          if (num < 0 || num >= 10)
            fail();		
	   }		
   }
   
   @Test (timeout = 5000)
   public void integerListConstructtorTest4()
   {
      IntegerList nums = new IntegerList(5, 10, 1);
      int[] expected = {5, 8, 7, 3, 4};

      for (int i=0; i<5; i++)
      {
         assertEquals(expected[i], (int)nums.get(i));
      }         
   }  
   
   @Test (timeout = 5000)
   public void toStringTest()
   {
      IntegerList nums = new IntegerList(5, 100, 50);

      assertEquals("17\n88\n93\n12\n51\n", nums.toString());        
   }  
   
   @Test (timeout = 5000)
   public void toStringTest2()
   {
      IntegerList nums = new IntegerList(0, 100);

      assertEquals("", nums.toString());        
   } 
   
   @Test (timeout = 5000)
   public void naturalSortTest()
   {
      IntegerList nums = new IntegerList(5, 100, 50);
      int[] expected = {12, 17, 51, 88, 93};

      nums.sort();
      for (int i=0; i<5; i++)
      {
         assertEquals(expected[i], (int)nums.get(i));
      }     
   }
   
   @Test (timeout = 5000)
   public void naturalSortTest2()
   {
      IntegerList nums = new IntegerList(5, 10, 1);
      int[] expected = {3, 4, 5, 7, 8};

      nums.sort();
      for (int i=0; i<5; i++)
      {
         assertEquals(expected[i], (int)nums.get(i));
      }         
   } 
   
   @Test (timeout = 5000)
   public void isSortedNaturallyTest()
   {
      IntegerList nums = new IntegerList(5, 100, 50);

      assertFalse(nums.isSorted());
      nums.sort();  
      assertTrue(nums.isSorted());
   }
   
   @Test (timeout = 5000)
   public void descendingSortTest()
   {
      IntegerList nums = new IntegerList(5, 100, 50);
      int[] expected = {93, 88, 51, 17, 12};

      nums.sort(new Descending());
      for (int i=0; i<5; i++)
      {
         assertEquals(expected[i], (int)nums.get(i));
      }     
   }
   
   @Test (timeout = 5000)
   public void descendingSortTest2()
   {
      IntegerList nums = new IntegerList(5, 10, 1);
      int[] expected = {8, 7, 5, 4, 3};

      nums.sort(new Descending());
      for (int i=0; i<5; i++)
      {
         assertEquals(expected[i], (int)nums.get(i));
      }         
   } 
   
   @Test (timeout = 5000)
   public void isSortedDescendingTest()
   {
      IntegerList nums = new IntegerList(5, 100, 50);

      assertFalse(nums.isSorted(new Descending()));
      nums.sort(new Descending());  
      assertTrue(nums.isSorted(new Descending()));
   }
   
   @Test (timeout = 5000)
   public void oddEvenAscendingSortTest()
   {
      IntegerList nums = new IntegerList(5, 100, 50);
      int[] expected = {17, 51, 93, 12, 88};

      nums.sort(new OddEvenAscending());
      for (int i=0; i<5; i++)
      {
         assertEquals(expected[i], (int)nums.get(i));
      }     
   }
   
   @Test (timeout = 5000)
   public void oddEvenAscendingSortTest2()
   {
      IntegerList nums = new IntegerList(5, 10, 1);
      int[] expected = {3, 5, 7, 4, 8};

      nums.sort(new OddEvenAscending());
      for (int i=0; i<5; i++)
      {
         assertEquals(expected[i], (int)nums.get(i));
      }         
   } 
   
   @Test (timeout = 5000)
   public void isSortedOddEvenAscendingTest()
   {
      IntegerList nums = new IntegerList(5, 100, 50);

      assertFalse(nums.isSorted(new OddEvenAscending()));
      nums.sort(new OddEvenAscending());  
      assertTrue(nums.isSorted(new OddEvenAscending()));
   }

   @Test (timeout = 5000)
   public void OddEvenDescendingSortTest()
   {
      IntegerList nums = new IntegerList(5, 100, 50);
      int[] expected = {93, 51, 17, 88, 12};

      nums.sort(new OddEvenDescending());
      for (int i=0; i<5; i++)
      {
         assertEquals(expected[i], (int)nums.get(i));
      }     
   }
   
   @Test (timeout = 5000)
   public void OddEvenDescendingSortTest2()
   {
      IntegerList nums = new IntegerList(5, 10, 1);
      int[] expected = {7, 5, 3, 8, 4};

      nums.sort(new OddEvenDescending());
      for (int i=0; i<5; i++)
      {
         assertEquals(expected[i], (int)nums.get(i));
      }         
   } 
   
   @Test (timeout = 5000)
   public void isSortedOddEvenDescendingTest()
   {
      IntegerList nums = new IntegerList(5, 100, 50);

      assertFalse(nums.isSorted(new OddEvenDescending()));
      nums.sort(new OddEvenDescending());  
      assertTrue(nums.isSorted(new OddEvenDescending()));
   }
}
