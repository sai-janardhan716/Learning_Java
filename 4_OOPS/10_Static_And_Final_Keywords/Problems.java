public class Problems {
    public static void main(String[] args) {
    //Practice Problems
    /*
        1) Create a class Counter with a static variable count.
        -> Increment count in the constructor and display it.
        2) Make a static utility method add(int a, int b) that returns their sum.
        3) Create a class with a static block to initialize a static variable and print a message.
        4) Declare a final variable MAX_SPEED = 120 inside a class Vehicle and try to change it (observe error).
        5) Create a final method display() in a class Parent and attempt to override it in a subclass.
    */

    //Solutions
    /*
        1) class Counter {
            static int count = 0;
            Counter() {
                count++;
                System.out.println("Count: " + count);
            }
        }
        //in main methods
        // new Counter();
        // new Counter();

        2) class Calculator {
            static int add(int a, int b) {
                return a + b;
            }
        }
        // In main Method
        // System.out.println(Calculator.add(5, 7));

        3) class Demo {
            int value;
            static {
               value = 42;
               System.out.println("Static block executed. Value = " + value);
            }
        }
        // In main Method
        // Demo d = new Demo(); // Static block runs once when class is loaded.

        4) class Vehicle{
            final int MAX_SPEED = 120;
            void changeSpeed(){
                //MAX_SPEED = 150; //Compilation Error: cannot assign a value to final variable
            }
        }
    */
    }
}
