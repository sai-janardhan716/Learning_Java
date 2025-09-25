public class Practice {
    public static void main(String[] args) {
        //Problems
        /*
            1) DivideByZero
            • Read two integers from the user.
            • Try to divide the first number by the second.
            • Catch ArithmeticException and display a custom message.

            2) ArrayIndex
            • Create an array of size 5.
            • Ask the user for an index and print the element.
            • Catch ArrayIndexOutOfBoundsException if the index is invalid.

            3) NumberFormat
            • Read a string from the user.
            • Convert it to an integer using Integer.parseInt().
            • Catch NumberFormatException if the input is not a valid number.

            4) NullPointer
            • Declare a String variable and set it to null.
            • Try to call length() on it.
            • Catch NullPointerException and display an error message.

            5) FileRead
            • Try to open and read a text file named "data.txt".
            • If the file doesn’t exist, catch FileNotFoundException.

            6) MultipleCatch
            • Read two integers from the user and store them in an array of size 2.
            • Try to divide the first by the second.
            • Use multiple catch blocks to handle both ArithmeticException and ArrayIndexOutOfBoundsException.            
        */

        //Solutions
        /*
            1)
            try{
                System.out.print("Enter numerator:");
                int a = sc.nextInt();
                System.out.print("Enter denominator:");
                int b = sc.nextInt();
                int res = a / b;
                System.out.println("Result:" +res);
            }
            catch (ArithmeticException e){
                System.out.println("Error:Cannot divide by zero.");
            }

            2)
            Scanner sc = new Scanner(System.in);
            int[] arr = {10,20,30,40,50};
            try{
                System.out.print("Enter index:");
                int idx = sc.nextInt();
                System.out.println("Element:" +arr[idx]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Error:Invalid index.");
            }

            3)
            Scanner sc =new Scanner(System.in);
            try{
                System.out.print("Enter a number:");
                String s = sc.nextLine();
                int num = Integer.parseInt(s);
                System.out.println("Integer:" + num);
            } 
            catch(NumberFormatException e){
                System.out.println("Error:Not a valid integer");
            }

            4)
            try{
                String str=null;
                System.out.println(str.length());
            }catch (NullPointerException e){
                System.out.println("Error:String is null.");
            }

            5)
            try{
                BufferedReader br = new BufferedReader(new FileReader("data.txt"));
                System.out.println(br.readLine());
                br.close();
            }catch (FileNotFoundException e) {
                System.out.println("Error: File not found.");
            }catch (IOException e){
                System.out.println("Error reading file");
            }

            6)
            int[] arr = new int[2];
            try{
                System.out.print("Enter first number:");
                arr[0]=sc.nextInt();
                System.out.print("Enter second number:");
                arr[1] =sc.nextInt();
                System.out.println("Division: " + arr[0]/arr[1]);
            } catch(ArithmeticException e){
                System.out.println("Error:Division by zero");
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Error:Array index issue.");
            }
        */
    }
}
