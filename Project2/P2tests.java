import static org.junit.Assert.*;
import org.junit.*;
import java.lang.reflect.*;
import org.junit.runners.MethodSorters;
import org.junit.rules.*;
import org.junit.runner.Description;
import java.util.concurrent.TimeUnit;
import java.awt.*;
import java.util.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class P2tests
{
   @Rule
   public TestRule watcher = new TestWatcher() {
      protected void starting(Description description) {
         System.out.print("Starting: " + description.getMethodName() + "...");
      }
   };

   @Rule
   public Stopwatch sw = new Stopwatch() {
      protected void finished(long nanos, Description description) {
         System.out.println(" (" + runtime(TimeUnit.MILLISECONDS) + " ms)");
      }
      protected void succeeded(long nanos, Description description) {
         System.out.print("Passed");
      }
      protected void failed(long nanos, Throwable e, Description description) {
         System.out.print("Failed");
      }
   };

   @Test (timeout = 5000)
   public void circleConstructorTest()
   {
      Circle c = new Circle(3.2, new Point(0,0), Color.BLACK, false);

      assertEquals(3.2, c.getRadius(), .000001);
      assertEquals(new Point(0,0), c.getPosition());
      assertEquals(Color.BLACK, c.getColor());
      assertFalse(c.getFilled());
   }

   @Test (timeout = 5000)
   public void circleSetTest()
   {
      Circle c = new Circle(3.2, new Point(0,0), Color.BLACK, false);
      c.setRadius(5.0);
      c.setColor(Color.BLUE);
      c.setFilled(true);
   }

   @Test (timeout = 5000)
   public void circleMoveTest()
   {
      Circle c = new Circle(3.2, new Point(0,0), Color.BLACK, false);

      c.move(new Point(0,0));
      assertEquals(new Point(0,0), c.getPosition());
   }

   @Test (timeout = 5000)
   public void circleAreaTest()
   {
      Circle c = new Circle(1.0, new Point(0,0), Color.BLACK, false);

      assertEquals(Math.PI, c.getArea(), .000001);
   }

   @Test (timeout = 5000)
   public void circleEqualsTest()
   {
      Circle c = new Circle(1.0, new Point(0,0), Color.BLACK, false);

      assertFalse(c.equals(null));
   }

   @Test (timeout = 5000)
   public void rectangleConstructorTest()
   {
      Rectangle r = new Rectangle(1.0, 2.0, new Point(0,0), Color.BLACK, false);

      assertEquals(1.0, r.getWidth(), .000001);
      assertEquals(2.0, r.getHeight(), .000001);
      assertEquals(new Point(0,0), r.getPosition());
      assertEquals(Color.BLACK, r.getColor());
      assertFalse(r.getFilled());
   }

   @Test (timeout = 5000)
   public void rectangleSetTest()
   {
      Rectangle r = new Rectangle(1.0, 2.0, new Point(0,0), Color.BLACK, false);
      r.setWidth(5.0);
      r.setHeight(3.1);
      r.setColor(Color.BLUE);
      r.setFilled(true);
   }

   @Test (timeout = 5000)
   public void rectangleMoveTest()
   {
      Rectangle r = new Rectangle(1.0, 2.0, new Point(0,0), Color.BLACK, false);

      r.move(new Point(0,0));
      assertEquals(new Point(0,0), r.getPosition());
   }

   @Test (timeout = 5000)
   public void rectangleAreaTest()
   {
      Rectangle r = new Rectangle(1.0, 1.0, new Point(0,0), Color.BLACK, false);

      assertEquals(1.0, r.getArea(), .000001);
   }

   @Test (timeout = 5000)
   public void rectangleEqualsTest()
   {
      Rectangle r = new Rectangle(1.0, 1.0, new Point(0,0), Color.BLACK, false);

      assertFalse(r.equals(null));
   }

   @Test (timeout = 5000)
   public void triangleConstructorTest()
   {
      Triangle t = new Triangle(new Point(0,0), new Point(1,1), new Point(2,2), Color.BLACK, false);

      assertEquals(new Point(0,0), t.getVertexA());
      assertEquals(new Point(1,1), t.getVertexB());
      assertEquals(new Point(2,2), t.getVertexC());
      assertEquals(Color.BLACK, t.getColor());
      assertFalse(t.getFilled());
   }

   @Test (timeout = 5000)
   public void triangleSetTest()
   {
      Triangle t = new Triangle(new Point(0,0), new Point(1,1), new Point(2,2), Color.BLACK, false);
      t.setVertexA(new Point(0,0));
      t.setVertexA(new Point(1,1));
      t.setVertexA(new Point(2,2));
      t.setColor(Color.BLUE);
      t.setFilled(true);
   }

   @Test (timeout = 5000)
   public void triangleMoveTest()
   {
      Triangle t = new Triangle(new Point(0,0), new Point(1,1), new Point(2,2), Color.BLACK, false);

      t.move(new Point(0,0));
      assertEquals(new Point(0,0), t.getVertexA());
   }

   @Test (timeout = 5000)
   public void triangleAreaTest()
   {
      Triangle t = new Triangle(new Point(0,0), new Point(1,1), new Point(0,1), Color.BLACK, false);

      assertEquals(.5, t.getArea(), .000001);
   }

   @Test (timeout = 5000)
   public void triangleEqualsTest()
   {
      Triangle t = new Triangle(new Point(0,0), new Point(1,1), new Point(0,1), Color.BLACK, false);

      assertFalse(t.equals(null));
   }

   @Test (timeout = 5000)
   public void convexPolygonConstructorTest()
   {
      Point[] points = new Point[5];
      points[0] = new Point(0,0);
      points[1] = new Point(0,-4);
      points[2] = new Point(1,-3);
      points[3] = new Point(2,0);
      points[4] = new Point(1,2);
      ConvexPolygon cp = new ConvexPolygon(points, Color.BLACK, false);

      assertEquals(new Point(0,0), cp.getVertex(0));
      assertEquals(Color.BLACK, cp.getColor());
      assertFalse(cp.getFilled());
   }

   @Test (timeout = 5000)
   public void convexPolygonSetTest()
   {
      Point[] points = new Point[5];
      points[0] = new Point(0,0);
      points[1] = new Point(0,-4);
      points[2] = new Point(1,-3);
      points[3] = new Point(2,0);
      points[4] = new Point(1,2);
      ConvexPolygon cp = new ConvexPolygon(points, Color.BLACK, false);
      cp.setVertex(0, new Point(0,0));
      cp.setColor(Color.BLUE);
      cp.setFilled(true);
   }

   @Test (timeout = 5000)
   public void convexMoveTest()
   {
      Point[] points = new Point[5];
      points[0] = new Point(0,0);
      points[1] = new Point(0,-4);
      points[2] = new Point(1,-3);
      points[3] = new Point(2,0);
      points[4] = new Point(1,2);
      ConvexPolygon cp = new ConvexPolygon(points, Color.BLACK, false);

      cp.move(new Point(0,0));
      assertEquals(new Point(0,0), cp.getVertex(0));
   }

   @Test (timeout = 5000)
   public void convexAreaTest()
   {
      Point[] points = new Point[4];
      points[0] = new Point(0,0);
      points[1] = new Point(1,0);
      points[2] = new Point(1,1);
      points[3] = new Point(0,1);
      ConvexPolygon cp = new ConvexPolygon(points, Color.BLACK, false);

      assertEquals(1.0, cp.getArea(), .000001);
   }

   @Test (timeout = 5000)
   public void convexEqualsTest()
   {
      Point[] points = new Point[4];
      points[0] = new Point(0,0);
      points[1] = new Point(1,0);
      points[2] = new Point(1,1);
      points[3] = new Point(0,1);
      ConvexPolygon cp = new ConvexPolygon(points, Color.BLACK, false);

      assertFalse(cp.equals(null));
   }

   @Test (timeout = 5000)
   public void workSpaceConstructorTest()
   {
      WorkSpace ws = new WorkSpace();

      assertEquals(0, ws.size());
   }

   @Test (timeout = 5000)
   public void workSpaceAddGetRemoveTest()
   {
      WorkSpace ws = new WorkSpace();
      Shape s;
      ws.add(new Circle(1.0, new Point(0,0), Color.BLACK, false));
      assertEquals(1, ws.size());

      s = ws.get(0);
      assertEquals(1, ws.size());
      assertTrue(s instanceof Circle);

      s = ws.remove(0);
      assertEquals(0, ws.size());
      assertTrue(s instanceof Circle);
   }

   @Test (timeout = 5000)
   public void workGetAllTest()
   {
      WorkSpace ws = new WorkSpace();
      ArrayList<Circle> circles;
      ArrayList<Rectangle> rectangles;
      ArrayList<Triangle> triangles;
      ArrayList<ConvexPolygon> convexPolygons;
      ArrayList<Shape> shapes;

      ws.add(new Circle(1.0, new Point(0,0), Color.BLACK, false));

      circles = ws.getCircles();
      assertEquals(1, circles.size());
      rectangles = ws.getRectangles();
      assertEquals(0, rectangles.size());
      triangles = ws.getTriangles();
      assertEquals(0, triangles.size());
      convexPolygons = ws.getConvexPolygons();
      assertEquals(0, convexPolygons.size());
      shapes = ws.getShapesByColor(Color.RED);
      assertEquals(0, shapes.size());

      assertEquals(Math.PI, ws.getAreaOfAllShapes(), .000001);
   }
}

