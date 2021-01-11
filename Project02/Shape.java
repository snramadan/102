/**
 * Shape Interface
 *
 * @author Saba Ramadan
 * @version Project 02
 * @version CPE102-09
 * @version Spring 2016
 */

import java.awt.*;
import java.*;

public interface Shape
{
    /** 
     * Calculates area of the object 
     * @return the area of the object 
     */   
    public double getArea();

    /** 
     * @return color of object
     */
    public Color getColor();
  
    /** 
     * @param color of object 
     * Sets the Color of the object
     */
    public void setColor(Color color); 
    
    /**
     * @return true if the object is filled state of the object
     */
    public boolean getFilled();

    /** 
     * @param Sets the filled state of the object  
     */
    public void setFilled(boolean filled);

    /**
     *  @param A pount that moves the shape by the x and y amounts specified in the Point
     */
    public void move(Point point); 
}
