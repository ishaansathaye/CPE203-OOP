import java.util.List;
import java.util.Map;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.HashMap;

class AStarPathingStrategy implements PathingStrategy {
    
    private class Node {

        private Point position;
        private Node prevNode;
        private int g;
        private int h;
        private int f;

        public Node(Point position, Node prevNode, int g, int h, int f) {
            this.position = position;
            this.prevNode = prevNode;
            this.g = g;
            this.h = h;
            this.f = f;
        }

        public int getF() {
            return f;
        }
    }

    public List<Point> computePath(Point start, Point end, Predicate<Point> canPassThrough, BiPredicate<Point, Point> withinReach, Function<Point, Stream<Point>> potentialNeighbors){
        // Path
        List<Point> path = new LinkedList<Point>();
        
        // Open List
        // Priority Queue of nodes that are sorted by f value
        Queue openList = new PriorityQueue<Node>(Comparator.comparingInt(Node::getF));
        // HashMap of nodes for quick lookup for g value
        Map <Point, Node> openListMap = new HashMap<Point, Node>();

        // Closed List
        Map <Point, Node> closedList = new HashMap<Point, Node>();

        // Current node
        Node currentNode = new Node(start, null, 0, 0, 0);

        return path;
    }
}
