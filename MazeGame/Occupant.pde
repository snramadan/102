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

public abstract class Occupant
{
  private Square square;

  public Occupant()
  {
  }

  public Occupant(Square start)
  {
    this.square = start;
  }

  public Square location()
  {
    return square;
  }

  public void moveTo(Square newLoc)
  {
    this.square = newLoc;
  }
}
