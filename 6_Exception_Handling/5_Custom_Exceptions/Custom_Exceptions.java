public class Custom_Exceptions {
   public static void main(String[] args) {
        /*
            -> Java provides many built-in exceptions like ArithmeticException, NullPointerException, etc.
            -> But sometimes we need our own exceptions to represent application-specific problems
               (for example: "InsufficientFunds", "InvalidAge", "LowBattery", etc.).
            -> These are called Custom Exceptions (or User-Defined Exceptions) means created by ours for our application purposes.
            -> A custom exception is simply a class that extends Exception (checked) or RuntimeException (unchecked).
            -> We can add:
               -> Constructors to pass error messages.
               -> Additional fields/methods if needed.
            -> Checked vs Unchecked:
               -> If you extend Exception (but not RuntimeException), it's checked 
                  -> Must be declared using throws and handled with try-catch.
               -> If you extend RuntimeException, it's unchecked
                  -> No need to declare or handle explicitly.
        */
        /*
            Syntax:-
            // Checked Exception
            class MyException extends Exception {
                MyException(String message){
                    super(message);
                }
            }
            // Unchecked Exception
            class MyRuntimeException extends RuntimeExceptio{
                MyRuntimeException(String message) {
                    super(message);
                }
            }

            Steps to Create & Use a Custom Exception:-
            1) Define the custom exception class by extending Exception or RuntimeException.
            2) Throw it where appropriate using the throw keyword.
            3) Handle it with try-catch or declare it with throws.
        */
        /*
            Example 1: Checked Custom Exception:- 
            // User-defined exception for insufficient funds
            class InsufficientFundsException extends Exception{
                InsufficientFundsException(String msg){
                    super(msg);
                }
            }
            class BankAccount{
                private double balance = 10000000000;
                void withdraw(double amount) throws InsufficientFundsException{
                    if (amount>balance) {
                        throw new InsufficientFundsException("Balance only "+balance +",cannot withdraw " + amount);
                    }
                    balance-=amount;
                    System.out.println("Withdraw successful, remaining balance: " + balance);
                }
            }
            BankAccount acc = new BankAccount();
            try{
                acc.withdraw(1500);
            }catch(InsufficientFundsException e){
                System.out.println("Error: "+e.getMessage());
            }

            -> Explanation:
               - InsufficientFundsException extends Exception, so it's a checked exception.
               - withdraw() declares throws InsufficientFundsException.
               - Caller must handle it in a try-catch.
        */

        /*
            Example 2: Unchecked Custom Exception:-
            class InvalidAgeException extends RuntimeException{
                InvalidAgeException(String msg){
                    super(msg);
                }
            }
            class VoterRegistration{
                void register(int age){
                    if (age<18) {
                        throw new InvalidAgeException("Age must be 18 or above");
                    }
                    System.out.println("Registration successful");
                }
            }
            VoterRegistration v =new VoterRegistration();
            v.register(16);   // no throws required, but will crash at runtime if not caught
        */
   } 
}
