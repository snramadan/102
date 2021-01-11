/**
 * DES
 *
 * @author Saba Ramadan
 * @version Project 02
 * @version CPE102-09
 * @version Spring 2016
 */

import java.awt.*;
import java.util.ArrayList;

public class WorkSpace 
{
    private ArrayList<Shape> shape = new ArrayList<Shape>();

    public WorkSpace()
    {
    }

    public void add(Shape shape)
    {
        this.shape.add(shape);
    }   

    public Shape remove(int index)
    {
         return this.shape.remove(index);
    }

    public Shape get(int index)
    {
        return this.shape.get(index);
    }

    public int size()
    {
        return this.shape.size();
    }
 
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
