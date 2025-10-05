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
        */
    }
}
