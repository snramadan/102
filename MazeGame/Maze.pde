import java.util.*;
/**
 * Class that contains all the logic to model a Maze with Treasures, Monsters, and an Explorer.
 * 
 * @author Saba Ramadan
 * @version Project 03(a)
 * @version CPE102-05
 * @version Fall 2016
 */

public class Maze
{
  // named constants
  public static final int ACTIVE = 0;
  public static final int EXPLORER_WIN = 1;
  public static final int MONSTER_WIN = 2;

  // instance variables
  private Square[][] squares;
  private ArrayList<RandomOccupant> randOccupants;
  private Explorer explorer;
  private int rows;
  private int cols;

  /**
   * Constructor for objects of class Maze
   */
  public Maze(Square[][] squares, int rows, int cols)
  {
    this.squares = squares;
    this.rows = rows;
    this.cols = cols;
    randOccupants = new ArrayList<RandomOccupant>();
  }

  // QUERIES
  public Square getSquare(int row, int col) { 
    return squares[row][col];
  }
  public int rows() {
    return rows;
  }
  public int cols() {
    return cols;
  }
  public String explorerName() {
    return explorer.name();
  }
  public Explorer getExplorer() {
    return explorer;
  }

  public RandomOccupant getRandomOccupant(int index) {
    return randOccupants.get(index);
  }

  public int getNumRandOccupants() {
    return randOccupants.size();
  }

  // COMMANDS
  public void addRandomOccupant(RandomOccupant ro) {
    randOccupants.add(ro);
  }

  public void setExplorer(Explorer e) {
    explorer = e;
  }

  public void explorerMove(int key)
  {
    explorer.move(key);
  }

  public void randMove()
  {
    // CHANGE - instruct each object in the RandomOccupant to move
    for (RandomOccupant occupant : randOccupants)
    {
      occupant.move();
    }
  }


  /**
   * Returns the status of the game.
   *
   * If all treasures have been found, return EXPLORER_WIN.
   * If not, check each maze occupant, if it is a Monster and
   *    it is in the same location as the Explorer, return
   *    MONSTER_WIN.  Note that you can use == to check locations, do you know why?
   * Otherwise, return ACTIVE.
   */
  public int gameStatus()
  {
    int status = ACTIVE;
    if (foundAllTreasures() == true)
    {
      status = EXPLORER_WIN;
    } else
    {
      for (Occupant occupant : randOccupants)
      {
        if ((occupant instanceof Monster) && (occupant.location() == explorer.location()))
        { 
          status = MONSTER_WIN;
        }
      }
    }       
    return status;
  }

  private boolean foundAllTreasures()
  {
    boolean foundAll = true;
    for (Occupant occupant : randOccupants)
    {
      if ((occupant instanceof Treasure)  && (((Treasure)occupant).found() == false))
      {  
        foundAll = false;
      }
    }         
    return foundAll;
  }

  public void lookAround(Square s)
  {
    int row = s.row();
    int col = s.col();

    // Clear what was previously in view
    resetInView();

    // Set the current square so that we are viewing it (obviously)
    s.setInView(true);

    s = getSquare(row, col);
    if (col + 1 < cols  && !s.wall(1))
    {   
      s = getSquare(row, col+1);
      s.setInView(true);
      if (row - 1 >= 0 && !s.wall(0))
      {
        s = getSquare(row-1, col+1);
        s.setInView(true);
      }
      if (row + 1 < rows  && !s.wall(2))
      {
        s = getSquare(row+1, col+1);
        s.setInView(true);
      }
    }

    s = getSquare(row, col);
    if (col - 1 >= 0 && !s.wall(3))
    {
      s = getSquare(row, col-1);
      s.setInView(true);
      if (row + 1 < rows  && !s.wall(2))
      {
        s = getSquare(row+1, col-1);
        s.setInView(true);
      }
      if (row - 1 >= 0  && !s.wall(0))
      {
        s = getSquare(row-1, col-1);
        s.setInView(true);
      }
    }

    s = getSquare(row, col);
    if (row - 1 >= 0 && !s.wall(0))
    {
      s = getSquare(row-1, col);
      s.setInView(true);
      if (col + 1 < cols  && !s.wall(1))
      {
        s = getSquare(row-1, col+1);
        s.setInView(true);
      }
      if (col - 1 >= 0 && !s.wall(3))
      {
        s = getSquare(row-1, col-1);
        s.setInView(true);
      }
    }

    s = getSquare(row, col);
    if (row + 1 < rows && !s.wall(2))
    {
      s = getSquare(row+1, col);
      s.setInView(true);
      if (col + 1 < cols && !s.wall(1))
      {
        s = getSquare(row+1, col+1);
        s.setInView(true);
      }
      if (col - 1 >= 0 && !s.wall(3))
      {
        s = getSquare(row+1, col-1);
        s.setInView(true);
      }
    }
  }

  private void resetInView()
  {
    for (int i = 0; i<rows; i++) {
      for (int j = 0; j<cols; j++) {
        squares[i][j].setInView(false);
      }
    }
  }
}
