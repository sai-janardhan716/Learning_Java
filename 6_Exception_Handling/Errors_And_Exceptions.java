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

            Common types:-
            1) Checked Exceptions: 
                -> Checked exceptions are runtime errors that the Java compiler enforces you to handle, either by using a try-catch block or a throws declaration.
                -> Must be handled or declared (e.g., IOException, SQLException).
            2) Unchecked Exceptions: 
                -> unchecked exceptions, also known as runtime exceptions, are not checked by the compiler and can go unhandled, often resulting from programming bugs or logic errors.
                -> Subclasses of RuntimeException, occur at runtime (e.g., NullPointerException, ArithmeticException).
            
            EG:-
            class ExceptionExample{
                public static void main(String[] args) {
                    try {
                        int a = 10 / 0;   // ArithmeticException
                        System.out.println("Result: " + a);
                    } catch (ArithmeticException e) {
                        System.out.println("Cannot divide by zero!");
                    }
                }
            }
            -> we will learn these try and catch keywords in our next session
        */
    }    
}
