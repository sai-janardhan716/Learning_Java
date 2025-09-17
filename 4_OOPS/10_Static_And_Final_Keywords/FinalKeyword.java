public class FinalKeyword {
    public static void main(String[] args) {
        /*
            -> The final keyword in Java is used to create constants, prevent method overriding, and stop inheritance of a class. 
            -> It can be applied to variables, methods, and classes.
        */

        /*
            a) Final Variables:-
           ------------------------
            -> A variable declared as final becomes a constant.
            -> Its value can be assigned only once, either at the time of declaration or inside a constructor (for instance variables).
            -> Once assigned, it cannot be changed.

            Example:-
            class Constants {
                final int SPEED_LIMIT = 90;   // constant variable
                final int capacity;
                Constants(int c) {
                    capacity = c; // allowed to assign once inside constructor
                }
            }
            public class Main{
                public static void main(String[] args){
                    Constants c = new Constants(50);
                    System.out.println("Speed Limit = " + c.SPEED_LIMIT);
                    System.out.println("Capacity = " + c.capacity);
                    // c.SPEED_LIMIT = 100;   //Error: cannot assign a value to final variable
                }
            }
            -> Here SPEED_LIMIT and capacity can never be changed after being set.
        */
        /*
            b) Final Methods:-
            -------------------
            -> A final method cannot be overridden by subclasses.
            -> Useful when you want to keep the original implementation unchanged.
            Example:-
            class Vehicle{
                final void run(){
                    System.out.println("Vehicle is running");
                }
            }
            class Car extends Vehicle{
                // void run() { } //Error: cannot override final method
            }
            public class Main {
                public static void main(String[] args){
                    Car c = new Car();
                    c.run(); // uses Vehicle's run() method
                }
            }
            -> The run() method in Vehicle is final, so Car cannot override it.
        */

        /*
            c) Final Classes:-
            -------------------
            -> A class declared as final cannot be inherited.
            -> Used when you want to prevent extension of the class.

            Example:-
            final class Shape{
                void draw(){
                    System.out.println("Drawing shape");
                }
            }
            // class Circle extends Shape { } // ❌ Error: cannot inherit from final class

            public class Main{
                public static void main(String[] args) {
                    Shape s = new Shape();
                    s.draw();
                }
            }
            -> Here Shape is a final class, so no other class can extend it.
        */
    }
}
