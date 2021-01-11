/*
 * DES
 *
 * @author Saba Ramadan
 * @version Lab 07 
 * @version CPE102-09
 * @version Spring 2016
 */

import static org.junit.Assert.*;
import org.junit.*;
import java.lang.reflect.*;
import org.junit.runners.MethodSorters;
import org.junit.rules.*;
import org.junit.runner.Description;
import java.util.concurrent.TimeUnit;

public class Lab07Tests
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
   /* CircleException architecture test 
 *       - no instance variables, one constructor, no other methods */
   @Test (timeout = 5000)
   public void circleExceptionArchitectureTest()
   {
      Class c = CircleException.class;
      Field[] fields = c.getDeclaredFields();
      Method[] methods = c.getDeclaredMethods();
      
      assertEquals("CircleException should have no declared fields.", 
                   0, fields.length); 
      assertEquals("CircleException should have no declared methods.", 
                   0, methods.length);              
      assertEquals("Parent of CircleException should be RuntimeException.", 
                   "java.lang.RuntimeException", c.getSuperclass().getName());   
   }
   
   /* ZeroRadiusException architecture test 
 *       - no instance variables, one constructor, no other methods */
   @Test (timeout = 5000)
   public void zeroRadiusExceptionArchitectureTest()
   {
      Class c = ZeroRadiusException.class;
      Field[] fields = c.getDeclaredFields();
      Method[] methods = c.getDeclaredMethods();
      
      assertEquals("CircleException should have no declared fields.", 
                   0, fields.length); 
      assertEquals("CircleException should have no declared methods.", 
                   0, methods.length);              
      assertEquals("Parent of ZeroRadiusException should be CircleException.", 
                   "CircleException", c.getSuperclass().getName());   
   }
   
   /* NegativeRadiusException architecture test 
 *       - one instance variable, one constructor, one public method */
   @Test (timeout = 5000)
   public void negativeRadiusExceptionArchitectureTest()
   {
      Class c = NegativeRadiusException.class;
      Field[] fields = c.getDeclaredFields();
      Method[] methods = c.getDeclaredMethods();
      int cnt;
      
      assertEquals("NegativeRadiusException should have one declared field.", 
                   1, fields.length); 
      assertEquals("NegativeRadiusException's instance variable should be private.", 
                   Modifier.PRIVATE, fields[0].getModifiers()); 
      assertEquals("NegativeRadiusException should have one declared method.", 
                   1, methods.length);  
      assertEquals("NegativeRadiusException's method should be public.", 
                   Modifier.PUBLIC, methods[0].getModifiers());             
      assertEquals("Parent of NegativeRadiusException should be CircleException.", 
                   "CircleException", c.getSuperclass().getName());   
   }
  
   /* NegativeRadiusException constructor test */
   @Test (timeout = 5000)
   public void circleConsturctorTest()
   {
      Circle c = new Circle(45);
   }
   
   /* CircleException constructor test */
   @Test (timeout = 5000)
   public void circleExceptionConsturctorTest()
   {
      CircleException c = new CircleException("Bad thing happened!");
   }

   /* ZeroRadiusException constructor test */
   @Test (timeout = 5000)
   public void zeroRadiusExceptionConsturctorTest()
   {
      ZeroRadiusException z = new ZeroRadiusException();
   }

   /* NegativeRadiusException constructor test */
   @Test (timeout = 5000)
   public void negativeRadiusExceptionConsturctorTest()
   {
      NegativeRadiusException n = new NegativeRadiusException(-3);
   }

   /* NegativeRadiusException radius() method test */
   @Test (timeout = 5000)
   public void negativeRadiusExceptionRadiusTest()
   {
      NegativeRadiusException n = new NegativeRadiusException(-3);
      
      n.radius();
   }
}
