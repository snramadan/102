/*
 * DES
 * 
 * @author Saba Ramadan
 * @version Project 03(a)
 * @version CPE102-05
 * @version Fall 2016
 */

import java.util.*;
import java.*;

public class Treasure extends RandomOccupant
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

}
