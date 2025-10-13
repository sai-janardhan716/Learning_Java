import java.util.*;
public class HashMapHashSet {
    public static void main(String[] args) {
        //HashMap
        /* 
            -> A HashMap in Java is a part of the java.util package.
            -> It is used to store data in key-value pairs, where each key is unique and maps to a specific value.
            -> It uses a hash table to store and retrieve values efficiently (almost constant time — O(1)).
        */

        //HashSet
        /* 
            -> A HashSet is a collection that contains unique elements only.
            -> It does not allow duplicates, and it doesn’t maintain insertion order.
            -> Internally, a HashSet uses a HashMap to store elements.
        */

        // Syntax
        // HashMap<KeyType, ValueType> map = new HashMap<>();
        // HashSet<Type> set = new HashSet<>();

        // Key Points
        /*
            | Feature         | HashMap                              | HashSet                              |
            | --------------- | ------------------------------------ | ------------------------------------ |
            | Stores          | Key-Value pairs                      | Only values                          |
            | Duplicates      | Keys not allowed (Values can repeat) | No duplicate elements                |
            | Null            | One null key allowed                 | One null element allowed             |
            | Order           | No guarantee of order                | No guarantee of order                |
            | Implementation  | Uses Hash Table                      | Internally uses HashMap              |
            | Time Complexity | O(1) average for insert/get/remove   | O(1) average for add/remove/contains |
        */
    }    
}
