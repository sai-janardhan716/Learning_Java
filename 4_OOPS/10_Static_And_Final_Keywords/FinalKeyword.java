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
    }
}
