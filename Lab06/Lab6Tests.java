/**
 * Tests
 *
 * @author Saba Ramadan
 * @version Lab06
 * @version CPE102-05
 * @version Fall 2016
 */

import static org.junit.Assert.*;
import org.junit.*;
import java.lang.reflect.*;
import org.junit.runners.MethodSorters;
import org.junit.rules.*;
import org.junit.runner.Description;
import java.util.concurrent.TimeUnit;

public class Lab6Tests
{

   @Test
   public void animalToStringTest()
   {
      Animal cat = new Animal(4);

      assertEquals("I am an Animal object with 4 legs", cat.toString());
   }

   @Test
   public void personToStringTest()
   {
      Person kyle = new Person("Kyle", 2);

      assertEquals("I am an Animal object with 2 legs and a Person object whose name is Kyle", kyle.toString());
   }

   @Test
   public void studentToStringTest()
   {
      Student Nicole = new Student(4.0, "Nicole", 2);

      assertEquals("I am an Animal object with 2 legs and a Person object whose name is Nicole and a Student object with a 4.0 gpa", Nicole.toString());
   }

   @Test
   public void animalEqualsTest()
   {
      Animal cat2 = new Animal(4);

      assertFalse(cat2.equals(null));
   }

   @Test
   public void personEqualsTest()
   {
      Person Saba = new Person("Saba", 2);

      assertFalse(Saba.equals(null));
   }

   @Test 
   public void studentEqualsTest()
   {
      Student Sabs = new Student(4.0, "Sabs", 2);

      assertFalse(Sabs.equals(null));
   }
}
    
