/*
 * DES
 * 
 * @author Saba Ramadan
 * @version Project 03(a)
 * @version CPE102-09
 * @version Spring 2016
 */

import java.util.*;
import java.*;

public class Treasure extends RandomOccupant implements DelimitedTextIO
{
  private boolean found;

  public Treasure(Maze maze)
  {
    super(maze);
    this.found = false;
    location().setTreasure(this);
  }

  public Treasure(Maze maze, long seed)
  {
    super(maze, seed);
    this.found = false;
    location().setTreasure(this);
  }

  public Treasure(Maze maze, Square location)
  {
    super(maze, location);
    this.found = false;
    location().setTreasure(this);
  }

  public boolean found()
  {
    return found;
  }

  public void setFound()
  {
    this.found = true;
  }

  public void move()
  {
  }

  public void moveTo(Square newLoc)
  {
      Square s = super.location();
      if (s.treasure() != null)
      {
          s.setTreasure(null);         
      }
      super.moveTo(newLoc);
      newLoc.setTreasure(this);
  }

  public String toText(char delimiter)
  {
      return super.toText(delimiter) + delimiter + found;
  }

  public void toObject(Scanner input)
  {
      super.toObject(input);
      this.found = input.nextBoolean();
  }

}
