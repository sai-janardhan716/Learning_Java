// import java.util.Scanner;
public class Conceptloops {
    public static void main(String[] args) {
    /* 
        Loops in Java (for, while, do-while)
        ------------------------------------

        -> Loops in Java are used to execute a block of code repeatedly until a certain condition is met.
        -> They reduce redundancy by avoiding writing the same code multiple times.
        -> Each repetition is called an iteration.

        In short:
        -> Loops = Repetition with control.

        Types of Loops in Java
        ------------------------------

        a) for Loop
        ------------
        -> Best when we know the number of iterations in advance.

        Syntax:
        for(initialization; condition; update) {
            // code block
        }

        Example:
        for(int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }

        Explanation:
        - Initialization    → int i = 1 (starting value)
        - Condition         → i <= 5 (loop runs while condition is true)
        - Update            → i++ (increment after each iteration)
        
        For-Each Loop - An enhanced for loop
        ------------------------------------------
        -> The enhanced for loop (also called for-each loop) is a simpler way to iterate over arrays or collections.  
        -> It removes the need for using index values and makes the code more readable.  
        -> Best used when you want to traverse all elements without modifying the original collection.  

        Syntax:
        -------
        for (datatype variable : array) {
            use variable inside loop
        }

        In short:
        -> No need for initialization, condition, and increment manually.
        -> Directly accesses each element in sequence.

        Example
        -----------
        int[] numbers = {10, 20, 30, 40};

        for(int num : numbers) {
            System.out.println(num);
        }

        Output:
        10
        20
        30
        40

        Explanation:
        Each element of the array is assigned to `num` one by one.

        Limitations of Enhanced For Loop
        --------------------------------------
        -> Cannot modify elements directly (only read).
        -> No access to index of elements.
        -> Not useful when partial traversal or custom step iteration is required.


        b) while Loop
        --------------
        -> Used when we don’t know the exact number of iterations in advance.
        -> Loop continues as long as the condition is true.

        Syntax:
        while(condition) {
            // code block
        }

        Example:
        int i = 1;
        while(i <= 5) {
            System.out.println("Iteration: " + i);
            i++;
        }

        Explanation:
        - Condition checked before execution.
        - If false initially, loop body may not run at all.


        c) do-while Loop
        -----------------
        -> Similar to while loop, but condition is checked after the loop body.
        -> Ensures the loop runs at least once.

        Syntax:
        do {
            // code block
        } while(condition);

        Example:
        int i = 1;
        do {
            System.out.println("Iteration: " + i);
            i++;
        } while(i <= 5);

        Explanation:
        - Body executes first.
        - Then condition is checked for next iteration.


        Difference between for, while, and do-while
        --------------------------------------
        -> for      : Use when number of iterations is known.
        -> while    : Use when number of iterations is unknown, condition-based.
        -> do-while : Use when code must run at least once regardless of condition.

        Why Loops are Important?
        --------------------------------
        -> Reduce code duplication.
        -> Help automate repetitive tasks.
        -> Make programs more efficient and readable.

        In summary:
        -----------
        -> for loop         - fixed iterations.
        -> for each loop    - enhanced version of for loop
        -> while loop       - condition-based, may run 0 times.
        -> do-while         - condition-based, runs at least once.

    */
    }
}