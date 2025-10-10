public class LinkedLists {
    public static void main(String[] args) {
        //LinkedList
        /*
            -> LinkedList is part of the java.util package.
            -> It is a doubly linked list implementation of the List and Deque interfaces.
            -> Unlike ArrayList (which uses a dynamic array), LinkedList stores elements as nodes.
            -> Each node contains:
                   - Data
                   - Address of previous node
                   - Address of next node
            -> It is useful when frequent insertions and deletions are required.

            Syntax:-
            LinkedList<Type> listName = new LinkedList<>();

            Example:-
            LinkedList<String> fruits = new LinkedList<>();
            fruits.add("Apple");
            fruits.add("Banana");
            fruits.add("Pomegrenate");
            System.out.println(fruits);

            Key Points:-
            -> Allows duplicates.
            -> Maintains insertion order.
            -> Can store null elements.
            -> Implements List, Queue, and Deque interfaces.
            -> Slower in random access than ArrayList because traversal is sequential.
            -> Faster in insertion and deletion compared to ArrayList.
        */

        //Methods
        /*
            add(E e)                → Adds element at the end.
            addFirst(E e)           → Adds element at the beginning.
            addLast(E e)            → Adds element at the end (same as add()).
            remove()                → Removes the first element.
            remove(int index)       → Removes element at given index.
            removeFirst()           → Removes first element.
            removeLast()            → Removes last element.
            get(int index)          → Returns element at index.
            getFirst()              → Returns first element.
            getLast()               → Returns last element.
            set(int index, E e)     → Replaces element at index.
            contains(Object o)      → Checks if element exists.
            size()                  → Returns number of elements.
            clear()                 → Removes all elements.
        */
    }    
}
