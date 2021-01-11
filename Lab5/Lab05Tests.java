/**
 * A starter JUnit test class to test the Lab 05 - Animal, Person and Student classes.
 *
 * @author Saba Ramadan
 * @version Lab 05
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

public class Lab05Tests
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
   
   // ---------------------------- Architecture Tests --------------------------------
   
   /* Animal architecture test - one private instance variable, one constructor, two public methods */
   @Test (timeout = 5000)
   public void animalArchitectureTest()
   {
      Class c = Animal.class;
      Field[] fields = c.getDeclaredFields();
      int cnt;
      
      assertEquals("Animal should have one declared field.", 1,
       fields.length);
         
      cnt = countModifiers(fields, Modifier.PRIVATE); 
      assertEquals("Animal's instance variable should be private.", 1, cnt);
      
      cnt = countModifiers(c.getDeclaredMethods(), Modifier.PUBLIC);   
      assertEquals("Animal should have two declared public methods.", 2, cnt);        
            
      assertEquals("Parent of Animal should be object.", "java.lang.Object", c.getSuperclass().getName());   
   }
   
   /* Person architecture test - one private instance variable, one constructor, two public methods */
   @Test (timeout = 5000)
   public void personArchitectureTest()
   {
      Class c = Person.class;
      Field[] fields = c.getDeclaredFields();
      int cnt;
      
      assertEquals("Person should have one declared field.", 1,
       fields.length);
         
      cnt = countModifiers(fields, Modifier.PRIVATE); 
      assertEquals("Person's instance variable should be private.", 1, cnt);
      
      cnt = countModifiers(c.getDeclaredMethods(), Modifier.PUBLIC);   
      assertEquals("Person should have two declared public methods.", 2, cnt);        
            
      assertEquals("Parent of Person should be Animal.", "Animal", c.getSuperclass().getName());   
   }   
   
   /* Student architecture test - one private instance variable, one constructor, two public methods */
   @Test (timeout = 5000)
   public void studentArchitectureTest()
   {
      Class c = Student.class;
      Field[] fields = c.getDeclaredFields();
      int cnt;
      
      assertEquals("Student should have one declared field.", 1,
       fields.length);
         
      cnt = countModifiers(fields, Modifier.PRIVATE); 
      assertEquals("Student's instance variable should be private.", 1, cnt);
      
      cnt = countModifiers(c.getDeclaredMethods(), Modifier.PUBLIC);   
      assertEquals("Student should have two declared public methods.", 2, cnt);        
            
      assertEquals("Parent of Student should be Person.", "Person", c.getSuperclass().getName());   
   }
  
   // ---------------------------- Functionality Tests --------------------------------
   
   /* Animal toString test */
   @Test (timeout = 5000)
   public void animalToStringTest()
   {
      Animal spidey = new Animal(8);
      
      assertEquals("I am an Animal object with 8 legs", spidey.toString());
   }
   
   /* Animal equals test 1 - null */
   @Test (timeout = 5000)
   public void animalEqualsTest1()
   {
      Animal spidey = new Animal(8);
      
      assertFalse(spidey.equals(null));
   }
   
   /* Person equals test 1 - null */
   @Test (timeout = 5000)
   public void personEqualsTest1()
   {
      Person julie = new Person("Julie", 2);
      
      assertFalse(julie.equals(null));
   }
   
   /* Student equals test 1 - null */
   @Test (timeout = 5000)
   public void studentEqualsTest1()
   {
      Student gilad = new Student(4.0, "Gilad", 2);
      
      assertFalse(gilad.equals(null));
   }
}
