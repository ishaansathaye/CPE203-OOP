import java.util.List;
import java.util.LinkedList;
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

    // Manhattan distance better than euclidean distance for this circumstance
    private static int manhattanDistance(Point p1, Point p2) {
        return Math.abs(p1.x - p2.x) + Math.abs(p1.y - p2.y);
    }

    public List<Point> computePath(Point start, Point end, Predicate<Point> canPassThrough, BiPredicate<Point, Point> withinReach, Function<Point, Stream<Point>> potentialNeighbors){
        // Path
        List<Point> path = new LinkedList<Point>();
        
        // Open List
        // Priority Queue of nodes that are sorted by f value
        Queue<Node> openList = new PriorityQueue<Node>(Comparator.comparingInt(Node::getF));
        // HashMap of nodes for quick lookup for g value
        HashMap <Point, Node> openListMap = new HashMap<Point, Node>();

        // Closed List
        HashMap <Point, Node> closedList = new HashMap<Point, Node>();

        // Current node - start node
        Node currentNode = new Node(start, null, 0, 0, 0);

        // Adding start node to the open list
        openList.add(currentNode);
        openListMap.put(start, currentNode);

        while (!openList.isEmpty()) {
            // Retrieve the node with the lowest f value and mark it as the current node
            currentNode = openList.remove();
            openListMap.remove(currentNode.position);

            // Checking if current node is adjacent to the end node
            if (withinReach.test(currentNode.position, end)) {
                // Build path by traversing backwards from current node
                while (currentNode.prevNode != null) {
                    path.add(0, currentNode.position);
                    currentNode = currentNode.prevNode;
                }
                return path;
            }

            // Get the neighbors of the current node using apply from Function - template from SingleStepPathingStrategy
            List<Point> neighbors = potentialNeighbors.apply(currentNode.position).filter(canPassThrough).filter(pt -> !closedList.containsKey(pt)).collect(Collectors.toList());

            // Analyze each neighbor
            for (Point neighborPt : neighbors) {
                
                // Calculate the g, h, and f values -> used heuristic (Manhattan distance)
                Node neighborNode = new Node(neighborPt, currentNode, currentNode.g + 1, manhattanDistance(neighborPt, end), currentNode.g + 1 + manhattanDistance(neighborPt, end));
                
                // If the node is already on the open list
                if (openListMap.containsKey(neighborPt)) {
                    // If calculated g value is better than prev g value -> replace old with new
                    Node openListNode = openListMap.get(neighborPt);
                    if (openListNode.g > neighborNode.g) {
                        openList.remove(openListNode);
                        openListMap.remove(neighborPt);
                        openList.add(neighborNode);
                        openListMap.put(neighborPt, neighborNode);
                    }
                } else {
                    // Not on the open list, so add it
                    openList.add(neighborNode);
                    openListMap.put(neighborPt, neighborNode);
                }
            }
            
            // Moving current node to the closed List
            closedList.put(currentNode.position, currentNode);

        }

        // Here if there is no path found
        return path;
    }
}
