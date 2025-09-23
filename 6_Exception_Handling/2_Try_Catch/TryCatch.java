public class TryCatch {
    public static void main(String[] args) {
        /*
            -> Try catch blocks are used to handle exceptions (runtime errors) so the program doesn’t crash.
            -> The code that might throw an exception is placed inside the try block.
            -> The catch block is used to handle the exception.

            Syntax:
            try {
                // code that may throw an exception
            } catch (ExceptionType e) {
                // code to handle the exception
            }
            
            -> If an exception occurs in the try block, the control is immediately transferred to the matching catch block.
            -> If no exception occurs, the catch block is skipped.

            Key Points:
            -> You can have multiple catch blocks to handle different exception types.
            -> A single try can be followed by multiple catch blocks.
            -> The most specific exception should be caught first.

            Example:
            public class Main {
                public static void main(String[] args) {
                    try {
                        int a = 10, b = 0;
                        int result = a / b;    // This will throw ArithmeticException which indicates we cant divide a number by 0
                        System.out.println("Result: " + result);
                    } catch (ArithmeticException e) {
                        System.out.println("Cannot divide by zero: " + e.getMessage());
                    }
                    System.out.println("Program continues...");
                }
            }
            Output:
            Cannot divide by zero: / by zero
            Program continues...

            -> In this we uses Exception handling (try-catch) to continue the execution even when a small exception occurs.

            Notes:
            -> If the exception is not caught, the program terminates abnormally.
            -> The catch block can access the Exception object to get details about the error.
        */
    }    
}
