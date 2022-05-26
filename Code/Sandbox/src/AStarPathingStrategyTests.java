/**
 * JUnit tests for Sorts assignment.
 *
 * @author Paul Hatalsky
 * @version 11/17/2017 Developed for CPE 203 A* testing
 */
import static org.junit.Assert.*;
import org.junit.*;
import java.lang.reflect.*;
import java.util.*;
import org.junit.runners.MethodSorters;
import org.junit.rules.*;
import org.junit.runner.Description;
import java.util.concurrent.TimeUnit;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AStarPathingStrategyTests
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
   private static PathingStrategy strategy = new AStarPathingStrategy();

   private static final int TILE_SIZE = 32;

   private static GridValues[][] grid;
   private static final int ROWS = 9;
   private static final int COLS = 9;

   private static enum GridValues { BACKGROUND, OBSTACLE, GOAL};

   private static Point wPos;
   private static Point goalPos;

   private static Field pointX;
   private static Field pointY;

   @BeforeClass
   public static void before()
   {
      grid = new GridValues[ROWS][COLS];

      try {
         /* Nice security you've got there, Oracle. */
         pointX = Point.class.getDeclaredField("x");
         pointX.setAccessible(true);
         pointY = Point.class.getDeclaredField("y");
         pointY.setAccessible(true);
      }
      catch (NoSuchFieldException e) {
         /* All bets are off if they didn't name their fields "x" and "y". But
          * we were already assuming that anyways. */
      }
   }

   private static int getX(Point p) {
      try {
         return (int)pointX.get(p);
      }
      catch (IllegalAccessException e) {
         return -1;
      }
   }

   private static int getY(Point p) {
      try {
         return (int)pointY.get(p);
      }
      catch (IllegalAccessException e) {
         return -1;
      }
   }

   private static void initialize_grid()
   {
      for (int row = 0; row < grid.length; row++)
      {
         for (int col = 0; col < grid[row].length; col++)
         {
            grid[row][col] = GridValues.BACKGROUND;
         }
      }
      grid[1][3] = GridValues.OBSTACLE;
      for (int row = 1; row < 6; row++)
      {
         grid[row][4] = GridValues.OBSTACLE;
      }
      grid[5][2] = GridValues.OBSTACLE;
      grid[5][3] = GridValues.OBSTACLE;
   }

   private static boolean withinBounds(Point p, GridValues[][] grid)
   {
      return getY(p) >= 0 && getY(p) < grid.length &&
         getX(p) >= 0 && getX(p) < grid[0].length;
   }

   private static boolean neighbors(Point p1, Point p2)
   {
      return getX(p1)+1 == getX(p2) && getY(p1) == getY(p2) ||
             getX(p1)-1 == getX(p2) && getY(p1) == getY(p2) ||
             getX(p1) == getX(p2) && getY(p1)+1 == getY(p2) ||
             getX(p1) == getX(p2) && getY(p1)-1 == getY(p2);
   }

   @Test(timeout = 500)
   public void test01_computePath01()
   {
      initialize_grid();
      List<Point> path =
         strategy.computePath(new Point(0, 0),
                              new Point(0, 2),
                              p ->  withinBounds(p, grid) && grid[getY(p)][getX(p)] != GridValues.OBSTACLE,
                              (p1, p2) -> neighbors(p1,p2),
                              PathingStrategy.CARDINAL_NEIGHBORS);

      Point[] expected = new Point[] {new Point(0, 1)};
      assertArrayEquals(expected, path.toArray());
   }

}