public class Errors_And_Exceptions {
    public static void main(String[] args) {
        //Errors
        /*
            -> Errors in programming are issues or defects that cause abnormal behavior in a program.
            -> These errors can occur during compilation or execution and must be resolved to ensure smooth program functionality.
            -> When an error is found, the compiler generates an error message to help the programmer fix it.
            -> Indicate issues with the environment/JVM, not with the application logic.
            -> Common Types of Errors:
                * OutOfMemoryError – JVM runs out of memory.
                * StackOverflowError – Too much recursion, stack memory exhausted.
                * VirtualMachineError – Internal JVM failure.
            
            EG:-
            class ErrorExample {
                public static void main(String[] args) {
                    recursiveCall();   // leads to StackOverflowError ( You will learn more about stack in DSA chapter)
                }
                static void recursiveCall() {
                    recursiveCall();
                }
            }
            Notes:
            -> We generally do NOT catch or handle Errors using try-catch because they indicate something
               fundamentally wrong with the runtime environment.
        */

        //Exceptions
        /*
            -> Problems that occur during the execution of a program and can be handled.
            -> Caused by issues in code logic or external factors like invalid user input, missing files, etc.
            -> Java provides try-catch-finally and throws/throw to handle them.
        */
    }    
}
