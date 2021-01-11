/*
 * DES
 *
 * @author Saba Ramadan
 * @version Project 04
 * @version CPE102-05
 * @version Fall 2016
 */

import java.util.Scanner;

public interface DelimitedTextIO
{
    //string statement including delimiter
    public String toText(char delimiter);

    //takes input and sets values
    public void toObject(Scanner input);
}
