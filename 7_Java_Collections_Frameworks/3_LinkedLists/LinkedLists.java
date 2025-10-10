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
    }    
}
