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

        // Methods
        // FOR HASHMAP
        /*
            | Method                   | Description                 |
            | ------------------------ | --------------------------- |
            |  put(K key, V value)     | Adds a key-value pair       |
            |  get(K key)              | Returns value of given key  |
            |  remove(K key)           | Removes key and value       |
            |  containsKey(K key)      | Checks if key exists        |
            |  containsValue(V value)  | Checks if value exists      |
            |  keySet()                | Returns all keys            |
            |  values()                | Returns all values          |
            |  entrySet()              | Returns all key-value pairs |
        */

        // FOR HASHSET
        /*
            | Method          | Description                |
            | --------------- | -------------------------- |
            |  add(E e)       | Adds element               |
            |  remove(E e)    | Removes element            |
            |  contains(E e)  | Checks if element exists   |
            |  isEmpty()      | Checks if set is empty     |
            |  size()         | Returns number of elements |
            |  clear()        | Removes all elements       |
        */
    }    
}
