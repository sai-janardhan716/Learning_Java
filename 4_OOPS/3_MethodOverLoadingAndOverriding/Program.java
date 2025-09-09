public class Program {
    public static void main(String[] args) {
    /*
        Method Overloading
       --------------------
        Method Overloading in Java occurs when two or more methods in the same class have the same name but different parameter lists (different number of arguments, or different data types of arguments).
        It is a compile-time polymorphism concept.

        Key Points:
        -> Same method name.
        -> Different parameter list (number or type).
        -> Return type can be same or different (but only return type change is NOT allowed).
        -> Resolved at compile time.

        Example:
        class Calculator {
            // Method with two int parameters
            int add(int a, int b) {
                return a + b;
            }

            // Overloaded method with three int parameters
            int add(int a, int b, int c) {
                return a + b + c;
            }

            // Overloaded method with double parameters
            double add(double a, double b) {
                return a + b;
            }
        }

        public class Main {
            public static void main(String[] args) {
                Calculator calc = new Calculator();
                System.out.println("Sum of 2 ints: " + calc.add(10, 20));
                System.out.println("Sum of 3 ints: " + calc.add(10, 20, 30));
                System.out.println("Sum of 2 doubles: " + calc.add(5.5, 4.5));
            }
        }    
    */

    /*
        Method Overriding
        ------------------
        Method Overriding in Java occurs when a subclass provides its own implementation of a method that is already defined in its parent class.
        It is a runtime polymorphism concept.

        Key Points:
        -> Same method name.
        -> Same parameter list (number & type).
        -> Must have inheritance (parent-child relationship).
        -> Return type must be same or covariant (child type).
        -> Cannot override final, static, or private methods.
        -> Resolved at runtime.

        Example:
        class Animal {
            void sound() {
                System.out.println("Animals make sound");
            }
        }

        class Dog extends Animal {
            // Overriding the parent class method
            @Override
            void sound() {
                System.out.println("Dog barks");
            }
        }

        class Cat extends Animal {
            @Override
            void sound() {
                System.out.println("Cat meows");
            }
        }

        public class Main {
            public static void main(String[] args) {
                Animal a1 = new Dog();  // Runtime Polymorphism
                Animal a2 = new Cat();

                a1.sound();  // Dog barks
                a2.sound();  // Cat meows
            }
        }
     */
    }
}
