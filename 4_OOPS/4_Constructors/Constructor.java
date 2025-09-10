// Constructor :- A constructor in Java is a special method that is used to initialize objects. 
// The constructor is called when an object of a class is created. 
// It can be used to set initial values for object attributes.
// The constructor name should be the class name and it cannot have return type.
/*
    1) Default Constructor
       - A constructor with no parameters.
       - If no constructor is defined, Java provides one automatically.
    2) Parameterized Constructor
       - A constructor that accepts arguments to initialize fields.
    3) Constructor Overloading
       - Defining multiple constructors in the same class with different parameter lists.
*/
class Student{
    int marks;
    String name;

    public void setName(String name){
        this.name = name;
    }

    public int setMarks(int marks){
        return marks;
    }
    //Creating the constructor for Student class
    public Student()  // -> Default or non parameterised constructor
    {
        //Here we are initialising the value of marks
        marks = 65; // The default value of marks sets to 65
    }

    // public Student(int marks,String name){  // -> Parameterised constructor-
    //     this.marks = marks;
    //     this.name = name;
    // }
}

public class Constructor {
    public static void main(String[] args){
        Student std1 = new Student();
        std1.setName("Ganesh");
        System.out.println(std1.name + " : " + std1.marks);
         // we didn't set the value of marks for this object so the default value of marks should be printed
        Student std2 = new Student();
        std2.setName("Gani");
        std2.setMarks(60);
        System.out.println(std2.name + " : " + std2.marks);
        // Student std3 = new Student(90,"Ramesh");
        // System.out.println(std3.name + " : " + std3.marks);

    }
}

/*
    Key Points:
       -> Constructors run automatically when the object is created.
       -> They are mainly used for initializing object values.
       -> Can be overloaded but not overridden.
*/