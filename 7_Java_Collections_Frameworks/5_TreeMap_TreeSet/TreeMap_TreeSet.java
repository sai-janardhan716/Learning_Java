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


        // TreeMap
        /*
            -> TreeMap is used to store key-value pairs in a sorted order based on keys.
            -> Keys are stored in ascending (natural) order by default.
            -> It does not allow duplicate keys.
            -> It does not allow null keys (throws NullPointerException), but allows null values.

            // Syntax
            TreeMap<KeyType, ValueType> mapName = new TreeMap<>();

            // Explanation:
            -> Keys are automatically sorted in ascending order.
            -> Duplicate keys are not allowed.
            -> Null keys are not supported, but null values are.

            // Common Methods:
            put(K key, V value)      -> Inserts a key-value pair.
            get(K key)               -> Returns the value for the given key.
            remove(K key)            -> Removes the mapping for the key.
            firstKey()               -> Returns the smallest key.
            lastKey()                -> Returns the largest key.
            keySet()                 -> Returns all keys.
            values()                 -> Returns all values.
        */

        // Example
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(3, "Banana");
        map.put(1, "Apple");
        map.put(2, "Mango");
        System.out.println("TreeMap: " + map);
    }
}