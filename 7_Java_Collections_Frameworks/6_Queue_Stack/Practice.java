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

        // 2)
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        Stack<Character> st = new Stack<>();
        for(char ch :str.toCharArray()){
            st.push(ch);
        }
        StringBuilder rev=new StringBuilder();
        while(!st.isEmpty()){
            rev.append(st.pop());
        }
        System.out.println("Original String: "+ str);
        System.out.println("Reversed String: " + rev);

        // 3)
        System.out.print("Enter parentheses string: ");
        String input = sc.nextLine();
        Stack<Character> s = new Stack<>();
        boolean balanced = true;
        for(char c : input.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                s.push(c);
            }else if (c == ')' || c == '}' || c == ']'){
                if(s.isEmpty()){
                    balanced = false;
                    break;
                }
                char top = s.pop();
                if((c == ')' && top != '(')||
                    (c == '}' && top != '{')||
                    (c == ']' && top != '[')){
                    balanced = false;
                    break;
                }
            }
        }
        if(balanced && s.isEmpty())
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");

        // 4)
        Queue<String> queue = new LinkedList<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");
        System.out.println("Queue before remove: " + queue);
        System.out.println("Removed element: " + queue.remove());
        System.out.println("Queue after remove: " + queue);

        // 5)
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= 5; i++) q.add(i);
        System.out.println("Original Queue: " + q);
        Stack<Integer> helper = new Stack<>();
        while(!q.isEmpty()){
            helper.push(q.remove());
        }
        while(!helper.isEmpty()){
            q.add(helper.pop());
        }
        System.out.println("Reversed Queue: " + q);
        sc.close();
    }    
}
