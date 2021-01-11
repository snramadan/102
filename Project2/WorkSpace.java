/**
 * DES
 *   
 * @author Saba Ramadan
 * @version Project 02
 * @version CPE102-05
 * @version Fall 2016
 */

import java.awt.*;
import java.util.ArrayList;

public class WorkSpace
{
    private ArrayList<Shape> shape = new ArrayList<Shape>();

    //default constructor
    public WorkSpace()
    {
    }
 
    //Adds objects which implement the Shape interface to the end of the WorkSpace's ArrayList instance variable.
    public void add(Shape shape)
    {
        this.shape.add(shape);
    }

    //Removes the Shape at the specified index and returns a reference to it or null if the index is out-of-bounds.
    public Shape remove(int index)
    {
         return this.shape.remove(index);
    }

    //Return the ith Shape object from WorkSpace.
    public Shape get(int index)
    {
        return this.shape.get(index);
    }

    //Returns the number of Shapes contained by the WorkSpace.
    public int size()
    {
        return this.shape.size();
    }

    //Returns an ArrayList of all of the Circle objects contained in the WorkSpace.
    public ArrayList<Circle> getCircles()
    {
        ArrayList<Circle> circle = new ArrayList<Circle>();

        for (int curshape = 0; curshape < shape.size(); curshape++)
        {
            if (shape.get(curshape) instanceof Circle)
            {
                circle.add((Circle)shape.get(curshape));
            }
        }
        return circle;
    }
   
    //Returns an ArrayList of all of the Rectangle objects contained in the WorkSpace
    public ArrayList<Rectangle> getRectangles()
    {
        ArrayList<Rectangle> rect = new ArrayList<Rectangle>();

        for (Shape curshape: shape)
        {
            if (curshape instanceof Rectangle)
            {
                rect.add((Rectangle)curshape);
            }
        }
        return rect;
    }

    //Returns an ArrayList of all of the Triangle objects contained in the WorkSpace.
    public ArrayList<Triangle> getTriangles()
    {
        ArrayList<Triangle> triangle = new ArrayList<Triangle>();

        for (Shape curshape: shape)
        {
            if (curshape instanceof Triangle)
            {
                triangle.add((Triangle)curshape);
            }
        }
        return triangle;
    }

    //Returns an ArrayList of all of the ConvexPolygon objects contained in the WorkSpace.
    public ArrayList<ConvexPolygon> getConvexPolygons()
    {
        ArrayList<ConvexPolygon> conpol = new ArrayList<ConvexPolygon>();

        for (int curshape = 0; curshape < shape.size(); curshape++)
        {
            if (shape.get(curshape) instanceof ConvexPolygon)
            {
                conpol.add((ConvexPolygon)shape.get(curshape));
            }
        }
        return conpol;
    }

    //Returns an ArrayList of all Shape objects in the WorkSpace that match the specified Color
    public ArrayList<Shape> getShapesByColor(Color color)
    {
        ArrayList<Shape> newshape = new ArrayList<Shape>();

        for (Shape curshape: shape)
        {
            if (curshape.getColor() == color)
            {
                newshape.add(curshape);
            }
        }
        return newshape;
    }

    //Returns the sum of the area of all Shape objects in the WorkSpace.
    public double getAreaOfAllShapes()
    {
        double area = 0;
        Shape intshape;

        for (int curshape = 0; curshape < shape.size(); curshape++)
        {
            intshape = shape.get(curshape);
            area  = area + intshape.getArea();
        }

        return area;
    }
}
    
