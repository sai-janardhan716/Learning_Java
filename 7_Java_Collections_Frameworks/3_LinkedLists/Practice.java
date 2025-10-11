import java.util.LinkedList;

public class Practice {
    public static void main(String[] args){
        //Problems
        /*
            1) Insert Elements
            -------------------
            • Create a LinkedList of Strings named cities.
            • Add 5 city names to the list.
            • Insert a new city at the beginning and another at the end.
            • Print the LinkedList after all insertions.

            2) Delete Elements
            -------------------
            • Create a LinkedList of integers with 5 elements.
            • Remove the first element, last element, and one element at a specific index.
            • Print the LinkedList after each deletion to observe the change.

            3) Update Elements
            -------------------
            • Create a LinkedList of student names.
            • Update the second and last student names using the set() method.
            • Print the LinkedList before and after updating.
        */

        //Solutions
        //1)
        LinkedList<String> cities = new LinkedList<>();
        cities.add("Mumbai");
        cities.add("Hyderabad");
        cities.add("Chennai");
        cities.add("Kolkata");
        cities.add("Bangalore");
        System.out.println("Original List: " + cities);
        cities.addFirst("Tenali");
        cities.addLast("Delhi");
        System.out.println("After Insertion: " + cities);

        //2
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println("Original List: " + numbers);
        numbers.removeFirst();
        System.out.println("After removing first: " + numbers);
        numbers.removeLast();
        System.out.println("After removing last: " + numbers);
        numbers.remove(1);
        System.out.println("After removing index 1: " + numbers);
    }
}
