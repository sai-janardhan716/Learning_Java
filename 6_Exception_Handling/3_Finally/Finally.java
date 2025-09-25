public class Finally {
    public static void main(String[] args) {
        //Finally
        /*
            -> The finally block is used with try-catch to execute code 
                that must run regardless of whether an exception occurs or not.
            -> Syntax:
                    try {
                        // code that may throw an exception
                    } catch (ExceptionType e) {
                        // handle exception
                    } finally {
                        // cleanup code that always executes
                    }

            Key Points:
            -> The finally block executes:
                - If no exception occurs.
                - If an exception occurs and is caught.
                - Even if a return statement is used inside try or catch.
            -> It will not execute only when:
                - The JVM shuts down unexpectedly (e.g., System.exit()).
                - The program is terminated abruptly.

            EG:
            try{
                System.out.println("Inside try block");
            }catch(Exception e) {
                System.out.println("Inside catch block");
            }finally{
                System.out.println("Finally block always executes");
            }

            Use Cases:
            -> Close files or release resources after use.
            -> Ensure database connections are properly closed.
            -> Perform cleanup tasks that must happen no matter what.
        */
    }
}