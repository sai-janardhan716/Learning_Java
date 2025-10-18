import java.util.*;
public class TreeMap_TreeSet{
    public static void main(String[] args) {
        /*
            -> Both are part of the java.util package.
            -> They are similar to HashSet and HashMap but maintain the elements in sorted order.
            -> Internally, both use a self-balancing Red-Black Tree data structure.
        */

        // TreeSet
        /* 
            -> TreeSet is used to store unique elements in a sorted (ascending) order.
            -> It does not allow duplicate values.
            -> Elements must be Comparable (e.g., Integer, String).
            -> It does not allow null elements.

            // Syntax
            TreeSet<Type> setName = new TreeSet<>();

            // Explanation:
            -> The elements are automatically sorted in ascending order.
            -> Duplicate elements are ignored.
            -> If you try to add null, it throws NullPointerException.

            // Common Methods:
            add(E e)          -> Adds an element to the set.
            remove(E e)       -> Removes the specified element.
            first()           -> Returns the smallest element.
            last()            -> Returns the largest element.
            contains(E e)     -> Checks if element exists.
            clear()           -> Removes all elements from the set.
        */

        // Example
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(10);   // duplicate ignored
        System.out.println("TreeSet: " + numbers);
    }
}