/*
 * DES
 *
 * @author Saba Ramadan
 * @version Project 04
 * @version CPE102-05
 * @version Fall 2016
 */

public class MazeReadException extends Exception
{
    //instance variables
    private String line;
    private int lineNumber;

    //constructor that calls super as well as sets linenumber
    public MazeReadException(String message, String line, int lineNumber)
    {
        super(message);
        this.line = line;
        this.lineNumber = lineNumber;
    }

    //queries
    public String getLine()
    {
        return line;
    }

    public int getLineNum()
    {
        return lineNumber;
    }
}
