public class JumpStatements {
    public static void main(String[] args) {
    /*
            Jump Statements in Java (break, continue)
            -----------------------------------------

            1) Jump Statements
            ----------------------------
            -> Jump statements are used to change the normal flow of control inside loops or switch statements.
            -> They allow us to skip iterations or exit loops immediately.

            In short:
            -> break - stop the loop/switch.
            -> continue - skip current iteration.

            2) Types
            -----------

            a) break Statement
            ------------------
            -> Used to exit (terminate) from a loop or switch statement immediately. (Already used in switch statements)
            -> Control moves to the first statement after the loop/switch.

            Syntax:
            Loop{
                break;
            }

            Example with loop:
            for(int i = 1; i <= 5; i++) {
                if(i == 3) {
                    break;  // loop stops when i = 3
                }
                System.out.println(i);
            }

            Output:
            1
            2

            b) continue Statement
            ---------------------
            -> Used to skip the current iteration and move to the next iteration of the loop.
            -> The loop does not terminate, only the current cycle is skipped.

            Syntax:
            loop{
                continue;
            }

            Example:
            for(int i = 1; i <= 5; i++) {
                if(i == 3) {
                    continue;  // skip printing when i = 3
                }
                System.out.println(i);
            }

            Output:
            1
            2
            4
            5

            3) Difference between break and continue
            -------------------------------------------------
            -> break    : Terminates the loop/switch completely.
            -> continue : Skips current iteration and continues with the next.
        
    */

    /*
            Practice Problems
            -------------------

            1) Print numbers from 1 to 10 but stop when number = 5 (use break)
            2) Print numbers from 1 to 10 but skip multiples of 3 (use continue)
            3) Find the first number greater than 50 that is divisible by 7 (use break)
            4) Print only even numbers between 1 and 20 using continue
            5) Nested Loop with break (stop inner loop when j == 2)




            1) Print numbers from 1 to 10 but stop when number = 5 (use break)
            for(int i = 1; i <= 10; i++) {
                if(i == 5) {
                    break;
                }
                System.out.println(i);
            }
            // Output: 1 2 3 4


            2) Print numbers from 1 to 10 but skip multiples of 3 (use continue)

            for(int i = 1; i <= 10; i++) {
                if(i % 3 == 0) {
                    continue;
                }
                System.out.println(i);
            }
            // Output: 1 2 4 5 7 8 10


            3) Find the first number greater than 50 that is divisible by 7 (use break)

            int num = 51;
            while(true) {
                if(num % 7 == 0) {
                    System.out.println("First divisible by 7 after 50: " + num);
                    break;
                }
                num++;
            }


            4) Print only even numbers between 1 and 20 using continue

            for(int i = 1; i <= 20; i++) {
                if(i % 2 != 0) {
                    continue;
                }
                System.out.print(i + " ");
            }
            // Output: 2 4 6 8 10 12 14 16 18 20


            5) Nested Loop with break (stop inner loop when j == 2)

            for(int i = 1; i <= 3; i++) {
                for(int j = 1; j <= 3; j++) {
                    if(j == 2) {
                        break;  // exits inner loop
                    }
                    System.out.println("i=" + i + " j=" + j);
                }
            }
        */

    }
}
