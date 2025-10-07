// import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        //Problems
        /*
            1) IntegerSum
            • Read two integers from the user as primitive types.
            • Convert them into Integer wrapper objects using autoboxing.
            • Add the two wrapper objects and display the sum.

            2) CompareValues
            • Create two Integer objects: one using autoboxing and another using new Integer().
            • Compare them using both equals() and compareTo().
            • Print the results and explain the difference.

            3) DoubleConversion
            • Read a double value from the user.
            • Convert it into a Double wrapper object.
            • Unbox it back into a primitive double and print both values.

            4) CharacterCheck
            • Read a character input from the user.
            • Convert it into a Character wrapper object.
            • Use Character class methods to check:
                -> if it is a letter
                -> if it is a digit
                -> if it is uppercase or lowercase.

            5) ParseAndValueOf
            • Take a string input containing a number, e.g., "123".
            • Convert it into an int using Integer.parseInt().
            • Also, convert it into an Integer object using Integer.valueOf().
            • Print both and explain the difference.
        */
        //Solutions
        /*  1)
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter first integer: ");
            int a=sc.nextInt();
            System.out.print("Enter second integer: ");
            int b =sc.nextInt();
            Integer num1=a;
            Integer num2 = b;
            Integer sum = num1+num2;
            System.out.println("Sum = "+sum);

            2)
            Integer n1=100;
            Integer n2=new Integer(100);
            System.out.println("equals() result: "+n1.equals(n2));
            System.out.println("compareTo() result: "+n1.compareTo(n2));
            System.out.println("== result: " +(n1==n2));

            3)
            System.out.print("Enter a double value: ");
            double d =sc.nextDouble();
            Double wrapperD=d;
            double unboxedD =wrapperD;
            System.out.println("Wrapper Double: "+wrapperD);
            System.out.println("Primitive double after unboxing: "+unboxedD);

            4)
            System.out.print("Enter a character: ");
            char ch=sc.next().charAt(0);
            Character c =ch;
            System.out.println("Is letter? "+Character.isLetter(c));
            System.out.println("Is digit? " + Character.isDigit(c));
            System.out.println("Is uppercase? "+ Character.isUpperCase(c));
            System.out.println("Is lowercase? "+Character.isLowerCase(c));

            5)
            System.out.print("Enter a numeric string: ");
            String str =sc.nextLine();
            int parsedInt=Integer.parseInt(str);
            Integer valueOfInt = Integer.valueOf(str);
            System.out.println("Parsed int: "+parsedInt);
            System.out.println("ValueOf Integer: "+valueOfInt);
        */
    }
}
