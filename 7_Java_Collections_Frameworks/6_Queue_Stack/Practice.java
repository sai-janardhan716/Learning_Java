import java.util.*;
public class Practice {
    public static void main(String[] args) {
        // Problems
        /*
        1) StackPushPop
               • Create a Stack of integers.
               • Push few elements.
               • Pop the top element and display the stack before and after.

            2) ReverseString
               • Read a string from user.
               • Push each character to stack.
               • Pop and form reversed string.

            3) BalancedParentheses
               • Check whether given parentheses are balanced or not using Stack.
               • Example: ({[]}) -> Balanced, ({[}) -> Not Balanced.

            4) QueueOperations
               • Create a Queue.
               • Add few elements.
               • Remove one element and show queue before and after.

            5) ReverseQueue
               • Create a Queue of integers.
               • Use a Stack to reverse all elements in the queue.
        */

        // Solutions
        // 1)
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack before pop: " + stack);
        System.out.println("Top element: " + stack.peek());
        System.out.println("Removed element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
    }    
}
