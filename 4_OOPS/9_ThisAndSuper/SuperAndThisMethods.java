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