public class ArrayLists {
    public static void main(String[] args) {
        //ArrayList
        /*
            -> ArrayList is a part of the Java Collections Framework.
            -> It is a resizable array implementation of the List interface.
            -> Unlike arrays, ArrayList can grow or shrink dynamically.
            -> It allows duplicate elements and maintains insertion order.
            -> It can store elements of any data type (by using generics only).

            Syntax:
            import java.util.ArrayList; to use the arraylist we need to import ArrayList Package in util in java
            ArrayList<Type> list = new ArrayList<>();

            Example:
            ArrayList<Integer> numbers = new ArrayList<>();
            ArrayList<String> names = new ArrayList<>();
            ArrayList<Double> marks = new ArrayList<>();
        */

        /*
            Important Methods in ArrayList
            1) add(element)               -> Adds an element at the end.
            2) add(index, element)        -> Inserts an element at the specified position.
            3) get(index)                 -> Returns the element at the specified index.
            4) set(index, element)        -> Replaces the element at the specified index.
            5) remove(index)              -> Removes the element at the specified index.
            6) size()                     -> Returns the number of elements in the list.
            7) contains(element)          -> Checks if the element exists in the list.
            8) isEmpty()                  -> Checks if the list is empty.
            9) clear()                    -> Removes all elements.
        */

        //Examples
        /*
            EG1:-
            ArrayList<String> fruits = new ArrayList<>();
            fruits.add("Apple");
            fruits.add("Banana");
            fruits.add("Cherry");
            System.out.println("Fruits: " + fruits);
            fruits.add(1, "Mango");                             // Insert at index 1
            System.out.println("After insertion: " + fruits);
            System.out.println("Element at index 2: " + fruits.get(2));
            fruits.set(2, "Orange");                            // Update element
            System.out.println("After update: " + fruits);
            fruits.remove(0);                                   // Remove first element
            System.out.println("After removal: " + fruits);
            System.out.println("List size: " + fruits.size());  // Returns length of arraylist
        */
    }
}
