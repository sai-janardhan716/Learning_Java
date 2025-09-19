public class Problems {
    public static void main(String[] args) {
        // Problems
        /*
            1) Employee & Address
            • Outer class: Employee (fields: name, id)
            • Member (non-static) inner class: Address (fields: city, state, pincode)
            • Method in Employee to display both employee and address details.
            • In main(): create an Employee object, then create its Address object and print all details.

            2) University & Department
            • Outer class: University
            • Static nested class: Department (fields: deptName, hodName)
            • Static method inside Department to display department info.
            • In main(): create a Department object without creating a University object.

            3) Car with Engine
            • Outer class: Car
            • Private inner class: Engine
            • Engine has a method start() that prints "Engine started".
            • Car has a public method startCar() that creates Engine and calls start().
            • In main(): create a Car object and call startCar() (Engine cannot be accessed directly).

            4) Button with Anonymous Inner Class
            • Interface: OnClickListener with method onClick().
            • Class Button with method setOnClickListener(OnClickListener listener) that calls listener.onClick().
            • In main(): create a Button object and pass an anonymous inner class that prints "Button clicked".

            5) Book & Chapter
            • Outer class: Book (field: title)
            • Inner class: Chapter (field: chapterName)
            • Book has a method addChapter(String name) that creates a Chapter and displays both book title and chapter name.
            • In main(): create a Book and add multiple chapters using the inner class.
        */
        //Solutions
        /*
            1) class Employee {
                String name;
                int id;
                Employee(String name, int id) {
                    this.name = name;
                    this.id = id;
                }
                class Address {
                    String city, state;
                    int pincode;
                    Address(String city, String state, int pincode) {
                        this.city = city;
                        this.state = state;
                        this.pincode = pincode;
                    }
                    void display() {
                        System.out.println("Employee: " + name + " (" + id + ")");
                        System.out.println("Address: " + city + ", " + state + " - " + pincode);
                    }
                }
            }
            Employee e = new Employee("Ganesh", 101);
            Employee.Address addr = e.new Address("Tenali", "AP", 522309);
            addr.display();

            2) class University {
                static class Department {
                    String deptName, hodName;
                    Department(String deptName, String hodName) {
                        this.deptName = deptName;
                        this.hodName = hodName;
                    }
                    static void info(Department d) {
                        System.out.println("Dept: " + d.deptName + ", HOD: " + d.hodName);
                    }
                }
            }
            University.Department d = new University.Department("CSE", "Dr. Janardhan");
            University.Department.info(d);

            3) class Car {
                private class Engine {
                    void start() {
                        System.out.println("Engine started");
                    }
                }
                void startCar() {
                    Engine e = new Engine();
                    e.start();
                }
            }
            Car car = new Car();
            car.startCar();

            4) interface OnClickListener {
                void onClick();
            }
            class Button {
                void setOnClickListener(OnClickListener listener) {
                    listener.onClick();
                }
            }
            Button btn = new Button();
            btn.setOnClickListener(new OnClickListener() {
            public void onClick() {
                System.out.println("Button clicked man");
            }
            });

            5) class Book {
                String title;
                Book(String title) {
                    this.title = title;
                }
                class Chapter {
                    String chapterName;
                    Chapter(String chapterName) {
                        this.chapterName = chapterName;
                    }
                    void show() {
                        System.out.println("Book: " + title + " - Chapter: " + chapterName);
                    }
                }
                void addChapter(String name) {
                    Chapter c = new Chapter(name);
                    c.show();
                }
            }
            Book b = new Book("Java Basics");
            b.addChapter("Introduction");
            b.addChapter("OOP Concepts");
        */
    }
}
