public class Practice {
    public static void main(String[] args) {
        //Problmes

        /*
            1) Create a class "Book" with fields title & author.
            - Write a default constructor that sets both to "Unknown".
            - Write a parameterized constructor to set actual values.

            2) Create a class "Rectangle" with fields length & width.
            - Write a parameterized constructor.
            - Add a method to calculate the area.

            3) Create a class "Employee" with fields name, salary.
            - Write multiple constructors (default, parameterized with name only, parameterized with name & salary).
            - Use constructor overloading.

            4) Create a class "Laptop" with brand & price.
            - Initialize using constructor and display details.

            5) Create a class "Movie" with fields title, rating, and year.
            - Write overloaded constructors to allow:
                - No values (default values)
                - Title only
                - Title and year
                - Title, year, and rating 
        */

        //Solutions
        /*
        1) class Book {
            String title;
            String author;

            Book() {
                title = "Unknown";
                author= "Unknown";
            }

            Book(String t, String a) {
                title =t;
                author = a;
            }

            void display() {
                System.out.println("Book: " + title + " by " +author);
            }
        }
        
        2) class Rectangle {
            int len, wid;
            Rectangle(int l, int w) {
                len=l;
                wid= w;
            }
            int area() {
                return length*width;
            }
        }

        3) class Employee {
            String name;
            double salary;
            Employee() {
                name = "Not Assigned";
                salary = 0.0;
            }
            Employee(String n) {
                name = n;
                salary = 30000;
            }
            Employee(String n, double s) {
                name = n;
                salary = s;
            }
            void display() {
                System.out.println("Employee: " + name + ", Salary: " + salary);
            }
        }

        4) class Laptop {
            String brand;
            double price;
            Laptop(String b, double p) {
                brand = b;
                price = p;
            }
            void display() {
                System.out.println("Laptop: " + brand + ", Price: " + price);
            }
        }

        5) class Movie {
            String title;
            int year;
            double rating;

            Movie() {
                title = "Unknown";
                year = 0;
                rating = 0.0;
            }
            Movie(String t) {
                title = t;
                year = 0;
                rating = 0.0;
            }
            Movie(String t, int y) {
                title = t;
                year = y;
                rating = 0.0;
            }
            Movie(String t, int y, double r) {
                title = t;
                year = y;
                rating = r;
            }
            void display() {
                System.out.println("Movie: " + title + ", Year: " + year + ", Rating: " + rating);
            }
        }
        //for Problem 1
        Book b1 = new Book();
        Book b2 = new Book("Know Yourself", "Sai Janardhan");
        b1.display();
        b2.display();

        //for Problem 2
        Rectangle r1 = new Rectangle(8, 10);
        System.out.println("Area of Rectangle: " + r1.area());

        // Problem 3
        Employee e1 = new Employee();
        Employee e2 = new Employee("Sai");
        Employee e3 = new Employee("Janardhan", 800000);
        e1.display();
        e2.display();
        e3.display();

        // Problem 4
        Laptop l1 = new Laptop("Victus", 60000);
        l1.display();

        // Problem 5
        Movie m1 = new Movie();
        Movie m2 = new Movie("F1");
        Movie m3 = new Movie("Ford V Ferrari", 2014);
        Movie m4 = new Movie("Loki", 2008, 9.0);
        m1.display();
        m2.display();
        m3.display();
        m4.display();
        */
    }
}
