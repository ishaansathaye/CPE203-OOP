import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;
import org.junit.Test;

public class TestCases
{
   @Test
   public void testFind1()
   {
      BinaryTree t = new BinaryTree(new int[] {34, 23, 76, 45, 12, 32, 26, 78, 47, 55});
      assertTrue(t.find(34));
      assertArrayEquals(t.getPath().toArray(), new Integer[] {12, 23, 34});
      assertTrue(t.find(23));
      assertArrayEquals(t.getPath().toArray(), new Integer[] {12, 23});
      assertTrue(t.find(76));
      assertArrayEquals(t.getPath().toArray(), new Integer[] {12, 23, 76});
      assertTrue(t.find(45));
      assertArrayEquals(t.getPath().toArray(), new Integer[] {12, 23, 76, 45});
      assertTrue(t.find(12));
      assertArrayEquals(t.getPath().toArray(), new Integer[] {12});
      assertTrue(t.find(32));
      assertArrayEquals(t.getPath().toArray(), new Integer[] {12, 78, 32});
      assertTrue(t.find(26));
      assertArrayEquals(t.getPath().toArray(), new Integer[] {12, 78, 32, 26});
      assertTrue(t.find(78));
      assertArrayEquals(t.getPath().toArray(), new Integer[] {12, 78});
      assertTrue(t.find(47));
      assertArrayEquals(t.getPath().toArray(), new Integer[] {12, 78, 47});
      assertTrue(t.find(55));
      assertArrayEquals(t.getPath().toArray(), new Integer[] {12, 78, 47, 55});
      assertFalse(t.find(0));
      assertArrayEquals(t.getPath().toArray(), new Integer[] {});
   }
   
   @Test
   public void testFind2()
   {
      BinaryTree t = new BinaryTree(new int[] {});
      assertFalse(t.find(34));
      assertArrayEquals(t.getPath().toArray(), new Integer[] {});
   }
   
   @Test
   public void testFind3()
   {
      BinaryTree t = new BinaryTree(new int[] {1});
      assertTrue(t.find(1));
      assertArrayEquals(t.getPath().toArray(), new Integer[] {1});
      assertFalse(t.find(34));
      assertArrayEquals(t.getPath().toArray(), new Integer[] {});
   }
}
