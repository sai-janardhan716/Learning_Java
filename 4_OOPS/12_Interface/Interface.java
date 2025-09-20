public class Interface {
    public static void main(String[] args) {
        //Interfaces
        /*
            -> An Interface is defined as an abstract type used to specify the behaviour of a class. 
            -> An interface in Java is a blueprint of a behaviour.
            -> A Java interface contains static constants and abstract methods.
            -> The interface in Java is a mechanism to achieve abstraction.
            -> By default, variables in an interface are public, static and final.
            -> It is used to achieve abstraction and multiple inheritance in Java.
            -> It supports loose coupling (classes depend on behavior, not implementation).
            -> In other words, interfaces primarily define methods that other classes must implement.
            -> An interface in Java defines a set of behaviours that a class can implement, usually representing a CAN-DO relationship, but not always in every scenario.
            EG:-
            interface testInterface {
                final int a = 10;
                void display();
            }
            // Class implementing interface
            class TestClass implements testInterface {
                // Implementing the capabilities of Interface
                public void display(){ 
                    System.out.println("Janardhan"); 
                }
            }
            class Interface{
            //Driver Code Starts
                public static void main(String[] args){
                    TestClass t = new TestClass();
                    t.display();
                    System.out.println(t.a);
                }
            }
        */
    }    
}
