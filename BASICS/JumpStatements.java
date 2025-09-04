package Learning_Java.BASICS;

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

    }
}
