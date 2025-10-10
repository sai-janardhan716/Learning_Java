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

            EG2:-
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(10);
            numbers.add(20);
            numbers.add(30);
            numbers.add(40);
            // Using for loop
            System.out.println("Using for loop:");
            for (int i = 0; i < numbers.size(); i++) {
                System.out.println(numbers.get(i));
            }
            // Using for-each loop
            System.out.println("Using for-each loop:");
            for (int n : numbers) {
                System.out.println(n);
            }
            // Using Iterator
            System.out.println("Using Iterator:");
            Iterator<Integer> it = numbers.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }

            EG3:-
            ArrayList<Integer> intList = new ArrayList<>();
            ArrayList<String> strList = new ArrayList<>();
            ArrayList<Double> dblList = new ArrayList<>();
            -> Generics ensure type safety (you can’t mix data types).
            -> Example:
                strList.add("Java");
                strList.add("Python");
                strList.add(100);   error (Compile-time error because we are trying to add an integer in string type arraylist)
        */

        //Notes
        /*
            -> ArrayList allows duplicate elements.
            -> ArrayList maintains insertion order.
            -> It is slower than arrays for primitive operations, but flexible.
            -> It is a part of java.util package.
            - Use ArrayList when:
                -> You don’t know the size in advance.
                -> You need frequent insertions/removals.
                -> You want dynamic resizing with index-based access.
        */
    }
}
