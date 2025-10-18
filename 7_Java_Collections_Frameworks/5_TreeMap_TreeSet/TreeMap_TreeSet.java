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