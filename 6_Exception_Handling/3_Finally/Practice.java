public class Practice {
    public static void main(String[] args) {
        //Problems
        /*
            1) FileClosing
            • Try to read a file that does not exist.
            • Catch FileNotFoundException.
            • In finally block print "Closing file resources".

            2) DivisionWithReturn
            • Create a method that divides two integers.
            • Use try block to return result.
            • Catch ArithmeticException if divisor is 0.
            • finally block prints "Division attempt finished".

            3) MultipleCatchFinally
            • Take an integer from user.
            • Perform array access and division in try.
            • Catch ArrayIndexOutOfBoundsException and ArithmeticException.
            • finally block prints "Execution completed".

            4) DBConnectionCleanup
            • Simulate DB connection by printing "Connected to DB".
            • Force an exception (divide by zero).
            • Catch the exception.
            • finally block prints "DB Connection Closed".

            5) NestedTryFinally
            • Use nested try blocks.
            • Inner try throws and catches an exception.
            • Inner finally prints "Inner finally executed".
            • Outer finally prints "Outer finally executed".

            6) SystemExitEffect
            • Print "Start" in try block.
            • Call System.exit(0) inside try.
            • finally block prints "This will not print if System.exit is called".
        */

        //Solutions
        /*
            1)
            try{
                BufferedReader br=new BufferedReader(new FileReader("nofile.txt"));
                System.out.println(br.readLine());
                br.close();
            }catch(FileNotFoundException e){
                System.out.println("Error:File not found.");
            }catch (IOException e){
                System.out.println("Error reading file.");
            }finally{
                System.out.println("Closing file resources");
            }

            2)
            int a=10, b=0;
            try{
                int res = a/b;
                System.out.println("Result:"+res);
                return;   // even with return, finally runs
            }catch(ArithmeticException e){
                System.out.println("Error: Cannot divide by zero.");
            } finally{
                System.out.println("Division attempt finished");
            }

            3)
            int[] arr={1,2,3};
            try{
                System.out.println(arr[5]/0);
            }catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Invalid index");
            }catch (ArithmeticException e) {
                System.out.println("Error:Division by zero");
            }finally{
                System.out.println("Execution completed");
            }

            4)
            try{
                System.out.println("Connected to DB");
                int x=5/0;
            } catch (ArithmeticException e){
                System.out.println("Error:" + e.getMessage());
            }finally{
                System.out.println("DB Connection Closed");
            }

            5)
            try{
                try{
                    int x = 5/0;
                }catch(ArithmeticException e){
                    System.out.println("Inner catch:Division by zero");
                }finally{
                    System.out.println("Inner finally executed");
                }
            }finally{
                System.out.println("Outer finally executed");
            }
        */
    }    
}
