import java.util.*;
public class StackQueue {
    public static void main(String[] args) {
        /*
            -> Both Queue and Stack are linear data structures in Java.
            -> They are used to store and process elements in different orders.
        */

        // Stack - Last In First Out (LIFO)
        /*
            -> In programming, Stack follows the same rule:
                  The element that is added last will be removed first.
            -> Imagine a stack of plates in your kitchen.
                 - You put a plate on top -> that’s push().
                 - You remove the top plate -> that’s pop().
                 - You can only take or see the top plate, not the middle ones.
            -> Example of Real Life:
                1) Undo feature in text editors,
                2) Browser back button,
                3) Function call stack in Java.

            // Methods
            - push(element): Adds an element to the top of stack.
            - pop(): Removes the top element.
            - peek(): Returns top element (without removing it).
            - empty(): Checks if stack is empty or not.
            - search(element): Finds position of an element from top (1-based).
        */

        // Example
        Stack<Integer> newStack = new Stack<>();
        newStack.push(10); // Add element
        newStack.push(20);
        newStack.push(30);
        System.out.println("Stack: " + newStack);
        System.out.println("Top element: " + newStack.peek()); // See top element
        System.out.println("Removed element: " + newStack.pop()); // Remove top element
        System.out.println("Stack after pop: " + newStack);
    }
}
