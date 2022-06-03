import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class GenericMethodDemo {

    // Transfer all data from an array to a Collection
    public static void fromArrayToCollection(Object[] a, Collection<Object> c) {
        for (Object o : a) {
            c.add(o); // compile-time error
        }
    }

    public static <T> void fromArrayToCollectionGeneric(T[] a, Collection<T> c) {
       for (T o : a)  {
           c.add(o);
       }
    }

    public static void main(String[] args) {
        fromArrayToCollectionGeneric(new Integer[] {1, 2, 3}, new ArrayList<Integer>());
    }
}
