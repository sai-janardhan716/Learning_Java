package Learning_Java.BASICS;

//import java.util.Scanner;
public class InputOutput {
    public static void main(String[] args){
    /* 

    Input/Output in Java (Scanner, System.out)

    1) What is Input and Output in Java?
    -------------------------------------
    -> Input  : Getting data from the user (keyboard, file, etc)
    -> Output : Displaying data to the user (console, file, etc)

    In Java:
    -> Input is usually done using the Scanner class.
    -> Output is done using System.out (print, println, printf, format).

    2) Output in Java (System.out)
    ------------------------------------------

    Java provides "System.out" object to print text on the console.

    1. System.out.print()
       -> Prints text on the same line (cursor stays on the same line).
    
    2. System.out.println()
       -> Prints text and moves the cursor to the next line.

    3. System.out.printf() OR System.out.format()
       -> Allows formatted printing using format specifiers.
       -> Example: %d (integer), %f (float), %s (string), %c (char).

    Example:
    --------
    int age = 20;
    String name = "Sai";
    double price = 250.75;

    System.out.print("Hello ");              // Output: Hello (cursor stays here)
    System.out.println("World!");            // Output: World! (cursor moves next line)
    System.out.printf("Age: %d\n", age);     // Output: Age: 20
    System.out.format("Price: %.2f", price); // Output: Price: 250.75

    3) Input in Java (Scanner Class)
    -----------------------------------------------------------

    To take input from the user, we use the Scanner class.
    Scanner is present in java.util package.

    -> Steps:
       1. Import Scanner: import java.util.Scanner;
       2. Create Scanner object: Scanner sc = new Scanner(System.in);
       3. Use methods to read data.

    Common Scanner methods:
    ------------------------
    nextInt()    -> Reads an integer
    nextFloat()  -> Reads a float
    nextDouble() -> Reads a double
    next()       -> Reads a single word (stops at space)
    nextLine()   -> Reads an entire line (including spaces)
    nextBoolean()-> Reads a boolean (true/false)
    nextLong()   -> Reads a long value

    Example:
    --------
    import java.util.Scanner;
    public class InputOutputDemo {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter your name: ");
            String name = sc.nextLine();

            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            System.out.print("Enter price: ");
            double price = sc.nextDouble();

            System.out.println("Hello " + name + "!");
            System.out.println("Your age is " + age);
            System.out.printf("Price entered: %.2f\n", price);
        }
    }

    4) Important Notes:
    ----------------------------------------------------
    -> Always close Scanner using sc.close() after use to avoid resource leak.
    -> next() vs nextLine():
       - next() reads a single word only (stops at space).
       - nextLine() reads the full line including spaces.

    Example:
    --------
    Input: "Sai Janardhan"
    sc.next()    -> "Sai"
    sc.nextLine()-> "Sai Janardhan"

    In Summary:
    ---------------------------
    -> System.out handles OUTPUT (print, println, printf)
    -> Scanner handles INPUT (nextInt, nextLine, etc)

    */

    /* 
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(); //for reading integer values
        byte num2 = sc.nextByte(); //for reading byte values
        long num3 = sc.nextLong(); //for reading long values
        short num4 = sc.nextShort(); //for reading short values
        float num5 = sc.nextFloat(); //for reading flot values
        double num6 = sc.nextDouble(); //for reading double values
        boolean num7 = sc.nextBoolean(); //for reading boolean values
        String name = sc.next(); //for reading string or char values
        String name2 = sc.nextLine(); //for reading string values
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);
        System.out.println(name);
        System.out.println(name2);
    */
    }
}