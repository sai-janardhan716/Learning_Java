public class Practice {
    public static void main(String[] args) {
        //Problems
        /*
            1) AgeValidation
            • Create a method validateAge(int age) that throws an IllegalArgumentException 
              if age < 18 with message "Age must be 18 or above".
            • Call this method from main and handle the exception.

            2) DivisionCheck
            • Create a method divide(int a, int b) that throws an ArithmeticException 
              using throw if b == 0.
            • Catch the exception in main and print a custom message.

            3) FileOpener
            • Create a method openFile(String fileName) that declares throws IOException.
            • Inside it, attempt to open and read the first line of the file using BufferedReader.
            • Handle the IOException in the caller.

            4) CustomException
            • Define a custom exception class InsufficientFundsException.
            • Create a method withdraw(double amount) that throws this exception 
              if amount > balance.
            • Handle the exception in main.

            5) NumberParser
            • Create a method parseNumber(String str) that throws NumberFormatException 
              if str is not a valid integer (use Integer.parseInt).
            • Call this method from main and handle the exception.

            6) MultipleThrows
            • Create a method processFile(String fileName) that declares throws IOException, FileNotFoundException.
            • Attempt to open and read the file.
            • In main, call this method and use multiple catch blocks to handle both exceptions.
        */

        //Solutions
        /*
            1) 
            void validateAge(int age){
                if(age<18){
                    throw new IllegalArgumentException("Age must be 18 or above");
                }
                System.out.println("Age is valid");
            }
            try{
                validateAge(16);
            }catch (IllegalArgumentException e){
                System.out.println("Error: " + e.getMessage());
            }
        */
    }
}
