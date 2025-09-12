public class Polymorphism {
    public static void main(String[] args) {
    // Polymorphism
    /*
        -> Polymorphism means “many forms”.
        -> It allows one interface (or reference) to represent different underlying forms (objects or behaviors).
        -> In Java, it enables the same method name to perform different tasks depending on the object or context.
    */

    /*Types Of Polymorphism

    1) Compile-Time Polymorphism (Static Binding / Early Binding)
       -> Achieved by Method Overloading (and operator overloading internally).
       -> The method to be executed is decided at compile time.   
       class Calculator {
            int add(int a, int b){
                return a + b;
            }
            double add(double a, double b){
                return a + b;
            }
        }
        public class Main{
            public static void main(String[] args){
                Calculator c = new Calculator();
                System.out.println(c.add(5, 10));      // calls int version
                System.out.println(c.add(3.5, 2.5));   // calls double version
            }
        }
        -->> In the abvove example the add method plays 2 roles one for addition of int values and another for addition of float values

    2) Runtime Polymorphism (Dynamic Binding / Late Binding)
        -> Achieved by Method Overriding.
        -> The method call is resolved at runtime based on the actual object referenced.
        -> Acheived through inheritance
        class Animal{
            void sound(){
                System.out.println("Some animal sound");
            }
        }
        class Dog extends Animal{
            void sound(){
                System.out.println("Dog barks");
            }
        }
        public class Main{
            public static void main(String[] args){
                Animal a = new Dog();   // reference of parent, object of child
                a.sound();              // Dog barks  (runtime decision)
            }
        }

    */

    }
}
