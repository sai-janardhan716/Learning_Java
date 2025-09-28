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

            2)
            static int divide(int a, int b){
                if(b==0){
                    throw new ArithmeticException("Cannot divide by zero");
                }
                return a/b;
            }
            try{
                System.out.println(divide(10,0));
            } catch (ArithmeticException e){
                System.out.println("Error:" + e.getMessage());
            }

            3)
            static void openFile(String fileName) throws IOException{
                BufferedReader br = new BufferedReader(new FileReader(fileName));
                System.out.println("First line: " + br.readLine());
                br.close();
            }
            try{
                openFile("data.txt");
            }catch (IOException e){
                System.out.println("Error opening file:" + e.getMessage());
            }

            4)
            class InsufficientFundsException extends Exception {
                InsufficientFundsException(String msg) {
                    super(msg);
                }
            }
            class BankAccount{
                double balance =500.0;
                void withdraw(double amount) throws InsufficientFundsException{
                    if (amount >balance){
                        throw new InsufficientFundsException("Insufficient balance");
                    }
                    balance-=amount;
                    System.out.println("Withdraw successful. Remaining:"+balance);
                }
            }
            BankAccount acc=new BankAccount();
            try{
                acc.withdraw(700);
            }catch(InsufficientFundsException e){
                System.out.println("Error:" + e.getMessage());
            }

            5)
            static int parseNumber(String str){
                return Integer.parseInt(str); // will throw NumberFormatException if invalid
            }
            try{
                int num = parseNumber("abc");
                System.out.println("Number: "+num);
            }catch(NumberFormatException e){
                System.out.println("Error:Invalid number format");
            }

            6)
            static void processFile(String fileName) throws IOException, FileNotFoundException{
                BufferedReader br=new BufferedReader(new FileReader(fileName));
                System.out.println(br.readLine());
                br.close();
            }
            try{
                processFile("example.txt");
            } catch (FileNotFoundException e){
                System.out.println("Error: File not found");
            } catch (IOException e){
                System.out.println("Error reading file:" + e.getMessage());
            }
        */
    }
}
