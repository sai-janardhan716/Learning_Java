public class DataTypesAndLiterals{
    public static void main(String[] args){
        /* 

        Variables: Variables are just lika a storage containers used to store the data.

        1) What are Data Types in Java?
        --------------------------------
        Data types in Java define the type of data that a variable can hold.
        They specify:
        -> What kind of values can be stored (numbers, characters, text, etc.).
        -> How much memory is required.
        -> What operations can be performed on the data.
    
        In short:
        -> Data types help Java understand the nature of the data.
        -> They make Java strongly typed and memory-efficient.

        2) Categories of Data Types
        ----------------------------
        Java data types are divided into two main categories:

        a) Primitive Data Types
        -> byte   : 8-bit integer, range -128 to 127
        -> short  : 16-bit integer, range -32,768 to 32,767
        -> int    : 32-bit integer, range -2^31 to 2^31-1
        -> long   : 64-bit integer, range -2^63 to 2^63-1
        -> float  : 32-bit floating-point (decimal)
        -> double : 64-bit floating-point (higher precision decimal)
        -> char   : 16-bit single character (Unicode)
        -> boolean: true/false values

        b) Non-Primitive (Reference) Data Types
        -> String  : Sequence of characters (EG: "Hello Java")
        -> Arrays  : Collection of similar data types
        -> Classes : User-defined objects with data & behavior
        -> Interfaces : Contracts for classes to implement

        3) Why are Data Types Important?
        ---------------------------------
        -> They prevent invalid operations on variables.
        -> Help allocate the right amount of memory.
        -> Improve program reliability and maintainability.

        Example:
        int age = 21;         // integer
        double price = 99.99; // decimal
        char grade = 'A';     // character
        boolean isJavaFun = true; // true/false

        In summary:
        Data types define the nature of the variable, 
        making Java strongly typed and secure.
        System.out.println("Hello World");
        byte age = 80;
        short num1 = 11111; 
        int num2 = 999999999;
        long num3 = 99999999999999999l;

        float num4 = 12.12f;  //we have to add f or F because in java the default decimal type is Double so we have to convert explicitly double to float 
            for that we have to add f
        double num5 = 12.12; 

        char letter = 'a'; // place the character in single quotes

        boolean tf = true;

        // Literals

        //Integer Literals
        int lit1 = 0b111; //It prints the value of boolean number. For this we have to add 0b at the start. It converts boolean to decimal
        int lit11 = 0x7E; //It prints the value of hexa decimal.it converts the hexa decimal to decimal.We have to add 0x at the start
        int lit12 = 1_00_000; //It is used incase of long digits to avoid confusion in counting of digits. Java Avoids these underscores in this case
        //Printing methods in Java
        int a = 10;
        float b = 20.33f;
        System.out.print((float)a);   // first it prints the statement and next statement will also prints in this line only
        System.out.println(b); // first it prints the statement and and next statement prints in new line
        System.out.printf("The value of a is %d",a); // helpful for using format specifiers
        System.out.format("The value of b is %f",b); // same as printf statement

        //Conversion and casting
        //Low to high -> Byte-Short-char-Int-Long-float-double (Implicit Conversion)
        //high to low > Double-float-long-int-char-short-byte (Explicit conversion)
        //Conversion - when the types converted automatically implicitly then it means  Conversion like Assigning small data type value to large data type
            byte sd = 127;
            int ld = 256;
            ld = sd; //It is possible because we are assigning the byte sd value(127) to large ld 
            //Casting - when the types converted explicitly then it means casting like assigning large data type values to small datat types
            // sd = ld - It throws error because we are trying to assign integer value to byte value 
            // To overcome this 
            sd = (byte)ld; // -->In this we are converting the integer value to byte value


            */
    }
}