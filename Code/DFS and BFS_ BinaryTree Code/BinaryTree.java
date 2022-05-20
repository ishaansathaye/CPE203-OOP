import java.util.LinkedList;
public class BinaryTree
{
   private Node root;
   private LinkedList<Integer> path;
   
   public BinaryTree(int[] values)
   {
      root = buildTree(values, 0, values.length - 1);
      path = new LinkedList<>();
   }
   
   public LinkedList<Integer> getPath() { return path; }
   
   private Node buildTree(int[] values, int low, int high)
   {
      if (low <= high)
      {
         int mid = (low + high)/2;
         return new Node(values[mid], 
                         buildTree(values, low, mid-1), 
                         buildTree(values, mid+1, high));
      }
      return null;
   }
   
   public boolean findDFS(int searchVal)
   {
      path.clear();
      return find(searchVal, root);
   }
   
   private boolean findDFS(int searchVal, Node node)
   {
      boolean found;
      
      if (node == null)
         found = false;
      else if (node.value == searchVal)
         found = true;
      else
         found = findDFS(searchVal, node.left) || findDFS(searchVal, node.right);

      if (found)
         path.add(0, node.value);

      return found;     
   }
   
   public boolean findBFS(int searchVal)
   {
      ArrayList<Node> nodeQueue = new ArrayList<Node>(); // array list being used as queue
      //Queue<Node> nodeQueue = new ArrayDeque<>();//queue is interface - deque is double sided queue ... queue with array backing it
      //Stack<Node> nodeQueue = new Stack<>();

      
      if (this.root == null)
            return false;
      
      nodeQueue.add(this.root);

      while (!nodeQueue.isEmpty())
      {
         Node current = nodeQueue.remove(0); // dequeue (remove and return 1st element)
         // Node current = nodeQueue.remove();
         //Node current = nodeQueue.pop();
         System.out.println("Current node: " + current);
      
         if (current.value == searchValue)
            return true;

         if (current.left != null)
            nodeQueue.add(current.left); // for stack, push

         if (current.right != null)
            nodeQueue.add(current.right); // for stack, push
      }

      return false;


   }


   // Inner class.  Private data can be accessed by outer class
   private class Node  
   {
      private int value;
      private Node left, right;
      
      public Node(int value, Node left, Node right)
      {
         this.value = value;
         this.left = left;
         this.right = right;
      }
   }
}