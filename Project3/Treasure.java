/**
 * Treasure Class
 *  
 * @author Saba Ramadan
 * @version Project 3
 * @version CPE102-05
 * @version Fall 2016
 */

import java.util.*;
import java.*;

public class Treasure extends RandomOccupant
{
  //instance variable
  private boolean found;

  //constructor to randomly locate itself in the Maze.
  public Treasure(Maze maze)
  {
    super(maze);
    this.found = false;
    location().setTreasure(this);
  }

  //constructor to randomly locate itself in the Maze using a seed
  public Treasure(Maze maze, long seed)
  {
    super(maze, seed);
    this.found = false;
    location().setTreasure(this);
  }

  //constructor to generate a Treasure in a specified location in the Maze
  public Treasure(Maze maze, Square location)
  {
    super(maze, location);
    this.found = false;
    location().setTreasure(this);
  }

  //query method for the found value
  public boolean found()
  {
    return found;
  }

  //sets the found value to true
  public void setFound()
  {
    this.found = true;
  }

  //override the move method of Rand Occ
  public void move()
  {
  }
}

