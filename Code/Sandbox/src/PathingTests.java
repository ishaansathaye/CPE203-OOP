import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class PathingTests {

    @Test
    public void testSingleStep_NoObstacle() {

        boolean[][] grid = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        Point start = new Point(0, 0);
        Point goal  = new Point(2, 2);

        PathingStrategy ps = new SingleStepPathingStrategy();
        List<Point> path = ps.computePath(start, goal, p -> PathingTests.withinBounds(p, grid) && grid[p.y][p.x], Point::adjacent, PathingStrategy.CARDINAL_NEIGHBORS);
        assertEquals(List.of(new Point(0, 1)), path);

    }

    // @Test
    // public void testDFS_NoObstacle() {

    //     boolean[][] grid = {
    //         {true, true, true},
    //         {true, true, true},
    //         {true, true, true}
    //     };
    //     Point start = new Point(0, 0);
    //     Point goal  = new Point(2, 2);

    //     PathingStrategy ps = new SingleStepPathingStrategy(); //change to DFS pathing strategy
    //     List<Point> path = ps.computePath(start, goal, p -> PathingTests.withinBounds(p, grid) && grid[p.y][p.x], Point::adjacent, PathingStrategy.CARDINAL_NEIGHBORS);
    //     assertEquals(List.of(new Point(0, 1)), path); // ad more points since DFS

    // }

    public static boolean withinBounds(Point p, boolean[][] grid) {
        return p.y >= 0 && p.y < grid.length &&
                p.x >= 0 && p.x < grid[0].length;
    }
    
}
