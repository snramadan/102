/**
 * Occupant Class
 *   
 * @author Saba Ramadan
 * @version Project 3
 * @version CPE102-05
 * @version Fall 2016
 */

import java.util.*;
import java.*;

public abstract class Occupant 
{
  //instance variable
  private Square square;

  //default constructor
  public Occupant()
  {
  }

  //constructor that accepts square argument
  public Occupant(Square start)
  {
    this.square = start;
  }

  //query for location
  public Square location()
  {
    return square;
  }

  //change location 
  public void moveTo(Square newLoc)
  {
    this.square = newLoc;
  }
}

