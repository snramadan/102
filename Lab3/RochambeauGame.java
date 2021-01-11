/**
 * DES
 *
 * @author Saba Ramadan
 * @version Lab 03
 * @version CPE102-09
 * @version Spring 2016
 */

import java.util.Scanner;

public class RochambeauGame
{
   public static void main(String[] args)
   {
      int p2Throw, winner;
      Scanner scanner = new Scanner(System.in);

      System.out.print("What is your name? ");

      String name = scanner.nextLine();
 
      RochambeauPlayer p1 = new RochambeauPlayer("Computer");
      RochambeauPlayer p2 = new RochambeauPlayer(name);

      System.out.print("How many wins shall we play until? ");

      int winTotal = scanner.nextInt();

      while (p1.getWins()< winTotal && p2.getWins() < winTotal) 
      {
         System.out.println();
         System.out.println(p1);
         System.out.println(p2);
            
         System.out.print("Make throw (0 - Rock, 1 - Paper, 2 - Scissors): ");
         p2Throw = scanner.nextInt();
            
         winner = Rochambeau.getWinner(p1.makeThrow(), p2.makeThrow(p2Throw));
            
         System.out.println(p1.getName() + " throws " + p1.lastThrow());
         System.out.println(p2.getName() + " throws " + p2.lastThrow());
            
         if (winner == 1) 
         {
            System.out.println(p1.getName() + " wins the round.");
            p1.incrementWins();
         }
         else if (winner == -1) 
         {
            System.out.println(p2.getName() + " wins the round.");
            p2.incrementWins();
         }
         else 
            System.out.println("This round is a tie.");
      }
        
      if (p1.getWins() == winTotal)
         System.out.println("\n" + p1.getName() + " wins the match!");
      else
         System.out.println("\n" + p2.getName() + " wins the match!");
   }
}      
