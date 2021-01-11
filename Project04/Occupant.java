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

public abstract class Occupant implements DelimitedTextIO
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

  public String toText(char delimiter)
  {
      return getClass().getName() + delimiter + square.row() + delimiter + square.col();
  }
}
