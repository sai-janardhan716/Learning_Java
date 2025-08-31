package Learning_Java.BASICS;
public class Operators {
    public static void main(String[] args){
/*
    1) What are Operators in Java?
    -------------------------------
    Operators are special symbols in Java that perform operations on variables and values.  
    They are used to manipulate data and perform tasks such as arithmetic, comparison, logical checks, etc.

    In short:
    -> Operators take inputs (operands) and produce an output (result).
    -> Example: 5 + 3 → '+' is the operator, 5 & 3 are operands, result = 8.

    2) Types of Operators in Java
    ------------------------------

    a) Arithmetic Operators:
    -> +  : Addition
    -> -  : Subtraction
    -> *  : Multiplication
    -> /  : Division (returns quotient)
    -> %  : Modulus (returns remainder)

    Example:
    int a = 10, b = 3;
    System.out.println(a + b); // 13
    System.out.println(a - b); // 7
    System.out.println(a * b); // 30
    System.out.println(a / b); // 3
    System.out.println(a % b); // 1

    b) Relational (Comparison) Operators:
    -> == : Equal to
    -> != : Not equal to
    -> >  : Greater than
    -> <  : Less than
    -> >= : Greater than or equal to
    -> <= : Less than or equal to

    Example:
    int x = 5, y = 10;
    System.out.println(x == y); // false
    System.out.println(x < y);  // true

    c) Logical Operators:
    -> && : Logical AND (true if both are true)
    -> || : Logical OR (true if at least one is true)
    -> !  : Logical NOT (reverses the condition)

    Example:
    boolean p = true, q = false;
    System.out.println(p && q); // false
    System.out.println(p || q); // true
    System.out.println(!p);     // false

    d) Assignment Operators:
    -> =   : Assign
    -> +=  : Add and assign
    -> -=  : Subtract and assign
    -> *=  : Multiply and assign
    -> /=  : Divide and assign
    -> %=  : Modulus and assign

    Example:
    int num = 10;
    num += 5;  // num = 15
    num *= 2;  // num = 30

    e) Unary Operators:
    -> ++ : Increment (adds 1)
    -> -- : Decrement (subtracts 1)
    -> +  : Unary plus (positive value)
    -> -  : Unary minus (negative value)
    -> !  : Logical NOT

    Example:
    int n = 5;
    System.out.println(++n); // 6 (pre-increment)
    System.out.println(n++); // 6 (post-increment, then n=7)

    f) Ternary Operator (?:):
    -> Works as a shorthand for if-else
    Syntax: condition ? value_if_true : value_if_false;

    Example:
    int age = 20;
    String result = (age >= 18) ? "Adult" : "Minor";
    System.out.println(result); // Adult

    g) Bitwise Operators:
    -> &  : Bitwise AND
    -> |  : Bitwise OR
    -> ^  : Bitwise XOR
    -> ~  : Bitwise NOT
    -> << : Left shift
    -> >> : Right shift

    Example:
    int m = 5, n2 = 3;
    System.out.println(m & n2);  // 1  (0101 & 0011 = 0001)
    System.out.println(m | n2);  // 7  (0101 | 0011 = 0111)
    System.out.println(m ^ n2);  // 6  (0101 ^ 0011 = 0110)
    System.out.println(~m);      // -6 (inverts bits)

    h) Instanceof Operator:  (More info about this operator can be understandable when OOPS arrives)
    -> Used to test whether an object is an instance of a specific class or subclass. 

    Example:
    String str = "Hello";
    System.out.println(str instanceof String); // true

    3) Why are Operators Important?
    --------------------------------
    -> They allow us to perform mathematical calculations.
    -> Help make logical decisions (true/false).
    -> Useful in conditions, loops, assignments, and data manipulation.
    -> Essential for building programs efficiently.
 */

    // (When using assignment operators to multiple variables at a time like a = b = c then compiler makes this to b = c and a = b associativity comes form roght to left)
    // Comparision Operators(<,>,==,!=,>=,<=)(For this we get boolean values as result)
        int num1 = 10;
        int num2 = 10;
        boolean result = num1 == num2;
        System.out.println(result); //It gives true as the output

    // Ternary Operators (?,:)(if the given condition is true the code after ? will executes. If it false then the code after : executes)
    //Syntax :- variable = (condition) ? expression1 : expression2  
        int ternaryresult = 0;
        ternaryresult = (7>5) ? 5 : 10;
        System.out.println(4.8 % 4.8);
        System.out.println(9+4*5-8/4);

    /* precedence (order is (++,-- associativity is right to left) (*,/,%),(+,-)) (Note : the * and / has equal precedance , + and - has also equal precedence)
       9+4*5-8/4
       9+20-8/4
       9+20-2
       29-2
       27
     */

    System.out.println(6/3+4+2*8);
    /*Associativity (if precedence equal then it solves from left to right)
        6/3+4+2*8
        2+4+2*8
        2+4+16
        22
     */
    
    //for this precedence and associativity visit https://www.javatpoint.com/java-operator-precedence
    
    //What if we perform addition for a string and number?
    System.out.println('a'+10);     //it gives the result 107 because the character a has ASCII value and it is 97 so 97+10=107
    System.out.println("a" + 10);   //it gives a10 because here a is not a character is is string

    //More Info about Unary operators (++,--)
    int c = 10;
    int d = 10;
    System.out.println(c++);    // first fetches c value(10) then increments(11) - Post Increment
    System.out.println(c);      //the incremented value printed (11)
    System.out.println(++d);    //It prints incremented value directly (11) - Pre Increment
    System.out.println(--d);
    System.out.println(ternaryresult);

/*
    In summary:
    -> Operators are symbols that tell the compiler to perform specific operations.
    -> They are the backbone of calculations, logic, and decision-making in Java.
*/

    }
}