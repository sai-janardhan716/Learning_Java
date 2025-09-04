package Learning_Java.BASICS;
// import java.util.Scanner;
public class Conceptloops {
    public static void main(String[] args) {
    /* 
        Loops in Java (for, while, do-while)
        ------------------------------------

        1) What are Loops?
        ------------------
        -> Loops in Java are used to execute a block of code repeatedly until a certain condition is met.
        -> They reduce redundancy by avoiding writing the same code multiple times.
        -> Each repetition is called an iteration.

        In short:
        -> Loops = Repetition with control.

        2) Types of Loops in Java
        --------------------------------------

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


        3) Difference between for, while, and do-while
        --------------------------------------
        -> for      : Use when number of iterations is known.
        -> while    : Use when number of iterations is unknown, condition-based.
        -> do-while : Use when code must run at least once regardless of condition.

        4) Why Loops are Important?
        --------------------------------------
        -> Reduce code duplication.
        -> Help automate repetitive tasks.
        -> Make programs more efficient and readable.


        In summary:
        -----------
        -> for loop   → fixed iterations.
        -> while loop → condition-based, may run 0 times.
        -> do-while   → condition-based, runs at least once.

    */
    
    // Practice Problems
    /*
        1) STAR Pattern

            *****
            ****
            ***
            **
            *
        2) Sum of even numbers
        3) multiplication table
        4) multiplication table in reverse order
        5) factorial of a given number
        6) repeat 5 using while loop
        7) repeat 5 using for loop
        8) sum of numbers occured in multiplication table of 2
        9) Star Pattern

            *
            **
            ***
            ****
            *****
        10) Star Pattern

            * * * * *
             * * * *
              * * *
               * *
                *
                

     */

    //problem 1 - STAR Pattern
        // for(int i=4;i>=0;i--){
        //     for (int j= 0;j<=i;j++){
        //         System.out.print('*');
        //     }
        //     System.out.println();
        // }

        //problem 2 - sum of even numbers
        // int n = 10;
        // int i=0;
        // int result = 0;
        // while(i<=n){
        //     result+=2*i;
        //     i++;
        // }
        // System.out.println(result);

        //problem 3 - multiplication table
        // int n = 10;
        // for(int i = 1;i<=n;i++){
        //     System.out.println(n + " * " + i + " = "+n*i);
        // }

        //problem4-multiplication table in reverse order
        // int n = 10;
        // for (int i=n;i>0;i--){
        //     System.out.println(n + " * " + i + " = "+n*i);
        // }

        //problem 5 - factorial of a given number
        // int n = 4;
        // int result=1;
        // for(int i=n;i>0;i--){
        //     result*=i;
        // }
        // System.out.println(result);

        //problem 6 - repeat 5 using while loop
        // while(true){
        //     System.out.println(5);
        // }

        //problem 7 - repeat 5 using for loop
        // for(int i =10;i!=0;i++){
        //     System.out.println(5);
        // }

        //problem 8 - sum of numbers occured in multiplication table of 2
        // int n =2;
        // int result = 0;
        // for(int i=1;i<=10;i++){
        //     result+=n*i;
        // }
        // System.out.println(result);

        //Problem 9 - Star Pattern
        // for(int i = 0;i<5;i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Problem 10 - Star Pattern
        // for (int i = 0; i  <  5; i++) {
        //     for (int j = 0; j  <  i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = i; j  <  5; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
    }
}