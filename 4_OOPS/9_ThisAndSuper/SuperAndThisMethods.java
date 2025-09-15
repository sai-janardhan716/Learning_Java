// Both this and super are reference keywords and methods are there
// In default Every constructor has supermethod (super())
// This "super()" method used to call and execute the superclass
// Now there is a method called this() which refers to the constructor in that class only


//Methods
class A extends Object{
    public A(){
        // super();  --> We dont have to mention it becuase by default it was there
        System.out.println("In the constuctor A");
    }

    public A(int n){
        this();
        System.out.println("In the parameterised constructor of A");
    }
}

class B extends A{
    public B(){
        super(2);
        System.out.println("In the constructor B");
    }

    public B(int n){
        this();
        System.out.println("In the parameterised constructor B");
    }
}
public class SuperAndThisMethods {
    public static void main(String[] args){
        B obj = new B(2);

        /*After the object creation of B the constructor of 'B' has been executed.
          In the 'B. constructor the super() method was there, so it executes the constructor of the superclass which is class "A"
          But in the constructor 'A' super() method was there, Basically every class in java inherits from "Object" class which is default.
          In that "object" class there is a default constructor.
          so First the constructor in "Object" class has been executed and the constructor in Class "A" and then Constroctur in class "B"
        */

    }
}
//Keywords

// Both this and super are reference keywords used to refer to objects, but they serve different purposes.

/*
    ------------------
    The this Keyword
    ------------------
    -> Refers to the current object of the class.
    -> Common Uses:
        1) To refer to the current class instance variable.
        2) To call another constructor of the same class (constructor chaining).
        3) To pass the current object as an argument in a method or constructor.
        4) To return the current class instance from a method.
*/

// Example 1: Referring to current class variables
class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;  // this differentiates between instance variables and parameters
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }
}

// public class MainThis {
//     public static void main(String[] args) {
//         Student s = new Student("Sai", 20);
//         s.display();
//     }
// }

/*
    The super Keyword
    ------------------
    -> Refers to the immediate parent (superclass) object.
    -> Common Uses:
        1) To access parent class variables if they are hidden by child class variables.
        2) To call parent class methods when overridden in child class.
        3) To call parent class constructor from a child class constructor.
*/

// Example 2: Accessing parent class members
class Animal {
    String type = "Generic Animal";
    void sound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    String type = "Dog";

    void displayType() {
        System.out.println("Child type: " + type);
        System.out.println("Parent type: " + super.type); // using super to access parent variable
    }

    @Override
    void sound() {
        super.sound(); // calls parent class method
        System.out.println("Dog barks");
    }
}

// public class MainSuper {
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.displayType();
//         d.sound();
//     }
// }

/*
    Key Differences
    ------------------------
    -> this :
         - Refers to the current class instance.
         - Used for accessing current class variables, methods, and constructors.
    -> super :
         - Refers to the immediate parent class instance.
         - Used for accessing parent class variables, methods, and constructors.
*/

/*
    Summary
    -------
    1) Use this when you need to reference the current object.
    2) Use super when you need to reference members of the parent class.
*/