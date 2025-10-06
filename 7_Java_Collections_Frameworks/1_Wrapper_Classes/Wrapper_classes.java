public class Wrapper_classes {
    public static void main(String[] args) {
        /*
            -> Wrapper classes are object representations of primitive data types in Java.
            -> They allow primitives (like int, char, double) to be used as objects, enabling them to work with Collections, Generics, and Object-oriented features.
            Purpose:
            -> To convert primitive data types into objects and vice versa.
            -> Useful for working with data structures (like ArrayList, HashMap) that store objects only.
        */
        /*
            Primitive Types & Their Wrapper Classes
            +----------------+---------------+
            | Primitive Type | Wrapper Class |
            +----------------+---------------+
            | byte           | Byte          |
            | short          | Short         |
            | int            | Integer       |
            | long           | Long          |
            | float          | Float         |
            | double         | Double        |
            | char           | Character     |
            | boolean        | Boolean       |
            +----------------+---------------+
            -> Remember java is case sensitive, for primitives we will write all small letters
            for wrapper classes first letter is capital remaining all are small letters.
            ->  int a = 10; (Primitive data types syntax)
                Integer b = 30; (wrapper syntax)
        */
        /*
            ->  we can able to convert the primitives to wrappers and wrappers to primitives by these two inbuilt methods
            1) Autoboxing
                -> The process of automatically converting a primitive data type into its corresponding wrapper class object.
                -> Done automatically by the Java compiler.
            EG:-
            int a = 10;
            Integer b = a;  // Autoboxing: primitive -> object
            System.out.println("Primitive: " +a);
            System.out.println("Wrapper Object: "+b);

            Explanation:
            -> The compiler automatically converts int a into Integer.valueOf(a) behind the scenes.
            -> No need for manual conversion.
            -> Integer is a class which contains calueOf method that stores the primitive value in wrapper object.
        */

        /*
            2) Unboxing
                -> The process of automatically converting a wrapper class object back into its primitive data type.
                -> Also handled automatically by the compiler.
            EG:-
            Integer obj = 50;     // Autoboxing
            int num = obj;        // Unboxing: object -> primitive
            System.out.println("Wrapper Object:"+ obj);
            System.out.println("Primitive: "+num);
            
            Explanation:
            -> The compiler converts obj into obj.intValue() automatically during assignment.
        */

        /*
            3) Manual Conversion (There is a method of conversion Before Java 5(before auto and unboxing))
                -> Before autoboxing/unboxing (Java 1.4 and below), conversions had to be done manually using methods like:
                1. Integer.valueOf() (for converting primitive int to Wrapper object Integer)
                2. intValue() (for converting Wrapper object Integer to primitive int )
            EG:-
            int a = 20;
            Integer obj = Integer.valueOf(a);   // manual boxing
            int num = obj.intValue();           // manual unboxing
        */
    }
}
