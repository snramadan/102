/**
 *DES
 *
 * @author Saba Ramadan
 * @version Lab 03
 * @version CPE102-09
 * @version Spring 2016
 */

import static org.junit.Assert.*;
import org.junit.*;

public class RochambeauTests
{   
   @Test public void defaultRochambeauPlayerTest()
   {
      RochambeauPlayer rp = new RochambeauPlayer("Alex");

      assertEquals("Alex", rp.getName());
      assertEquals(0, rp.getWins());
      assertEquals("Alex has 0 wins.", rp.toString());
      assertEquals("No Throw", rp.lastThrow());
   }

   @Test public void seededRochambeauPlayerTest()
   {
      RochambeauPlayer rp = new RochambeauPlayer("Jackie", 0);

      assertEquals("Jackie", rp.getName());
      assertEquals(0, rp.getWins());
      assertEquals("Jackie has 0 wins.", rp.toString());
      assertEquals("No Throw", rp.lastThrow());
   }

   @Test public void makeThrowTest1()
   {
      RochambeauPlayer rp = new RochambeauPlayer("Alex");
      int curThrow;

      curThrow = rp.makeThrow();
      assertTrue(curThrow >= 0 && curThrow <= 2);
   }   
   
   @Test public void makeThrowTest2()
   {
      RochambeauPlayer rp = new RochambeauPlayer("Alex");
      int curThrow;

      curThrow = rp.makeThrow(Rochambeau.ROCK);
      assertEquals(Rochambeau.ROCK, curThrow);
   }  

   @Test public void makeThrowTest3()
   {
      RochambeauPlayer rp = new RochambeauPlayer("Alex", 72);
      int curThrow;

      curThrow = rp.makeThrow();
      assertEquals(Rochambeau.ROCK, curThrow);
   }  

   @Test public void incrementWinsTest()
   {
      RochambeauPlayer rp = new RochambeauPlayer("Alex");

      assertEquals(0, rp.getWins());
      rp.incrementWins();
      assertEquals(1, rp.getWins());
   }

   @Test public void lastThrowTest()
   {
      RochambeauPlayer rp = new RochambeauPlayer("Alex");
      int curThrow;

      curThrow = rp.makeThrow();
      
      if (curThrow == Rochambeau.ROCK)
         assertEquals("Rock", rp.lastThrow());
      else if (curThrow == Rochambeau.PAPER)
         assertEquals("Paper", rp.lastThrow());
      else 
         assertEquals("Scissors", rp.lastThrow());
   }  

   @Test public void rochambeauGetWinnerTest()
   {
      assertEquals(0, Rochambeau.getWinner(Rochambeau.SCISSORS, Rochambeau.SCISSORS));
   }
}
  

