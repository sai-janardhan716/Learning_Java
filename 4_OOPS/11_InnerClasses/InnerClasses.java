public class InnerClasses {
    public static void main(String[] args) {
        /*
            -> An inner class is a class defined inside another class.
            -> It is used to logically group classes that are only used in one place, and to access the private members of the outer class.
            -> Types of Inner Classes:
                1) Non-static (Regular) Inner Class
                2) Static Nested Class
                3) Local Inner Class (inside a method)
                4) Anonymous Inner Class
        */
        //Types
        /* 
            1)Non-static (Regular) Inner Class
            -> Defined inside another class without the static keyword.
            -> Has access to all members (including private) of the outer class.
            -> Requires an instance of the outer class to create an object.
            Example:-
            class Outer {
                private String message = "Hello janardhan, i am from Outer";
                class Inner {
                    void display() {
                        System.out.println("Message: " + message);
                    }
                }
            }
            public class Main {
                public static void main(String[] args) {
                    Outer outer = new Outer();
                    Outer.Inner inner = outer.new Inner(); // create via outer object
                    inner.display();
                }
            }
            -> The Inner class can directly access Outer’s private field message.
        */
    }
}
