/**
 * A minimal JUnit test class to test the Lab 09 Part B TotemPole classes.
 *
 * This class doesn't actually test anything other than that I can
 * call the methods and it will compile/run without crashing.
 *
 * @author Julie Workman
 * @version 5/26/2016 (Written to JUnit-4.12)
 */

import static org.junit.Assert.*;
import org.junit.*;
import java.lang.reflect.*;
import org.junit.runners.MethodSorters;
import org.junit.rules.*;
import org.junit.runner.Description;
import java.util.concurrent.TimeUnit;
import java.util.*;

public class PartBTests
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
   // ---------------------------- Functionality Tests --------------------------------
   public static TotemPole t1 = new Bear(new Snake(new Eagle()));
   
   @Test (timeout = 5000)
   public void heightTest()
   {
      t1.height();
   }	
   
   @Test (timeout = 5000)
   public void powerTest()
   {
      t1.power();
   }
   
   @Test (timeout = 5000)
   public void chiefPoleTest()
   {
      t1.chiefPole(0);
   }	

   // ---------------------------- Testing Answer -------------------------------------
   
   public static TotemPole body = new Bear(new Snake(new Bear(new Eagle())));

   @Test 
   public void pTest()
   {
       assertEquals(15, body.power());      
   }
  
   @Test
   public void hTest()
   {
       assertEquals(4, body.height());
   }

   @Test
   public void cpTest()
   {
       assertEquals(false, body.chiefPole(0));
   }

   public static TotemPole body2 = new Bear(new Snake(new Bear(new Bear(new Bear(new Bear(new Snake(new Eagle())))))));

   @Test
   public void p2Test()
   {
       assertEquals(33, body2.power());
   }

   @Test
   public void h2Test()
   {
       assertEquals(8, body2.height());
   }

   @Test
   public void cp2Test()
   {
       assertEquals(true, body2.chiefPole(0));
   }
}
