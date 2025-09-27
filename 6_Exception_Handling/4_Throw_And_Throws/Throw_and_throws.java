public class Throw_and_throws {
    public static void main(String[] args) {
        //Throw
        /*
            -> Used to explicitly throw a single exception (object of Exception class or its subclasses).
            -> Used inside a method or block of code.
            -> We throw an instance of an exception.
            -> After throw statement, no code is executed in that block.

            Syntax:-
            throw new ExceptionType("error message");

            EG:-
            class DemoThrow{
                void checkAge(int age){
                    if (age<18){
                        throw new ArithmeticException("Not eligible to vote");
                    }else{
                        System.out.println("Eligible to vote");
                    }
                }
            }
            DemoThrow d = new DemoThrow();
            d.checkAge(15);
            -> Here we explicitly throw an ArithmeticException when age is less than 18.
            -> No code after throw in the same block will execute.
        */

        //Throws
        /*
            -> Used in the method declaration to specify that the method may throw one or more checked exceptions.
            -> It tells the caller of the method that it must handle or declare these exceptions.
            -> Mainly used for checked exceptions like IOException, SQLException, etc.

            Syntax:-
            returnType methodName(parameters) throws ExceptionType1, ExceptionType2 { ... }
        */
    }
}
