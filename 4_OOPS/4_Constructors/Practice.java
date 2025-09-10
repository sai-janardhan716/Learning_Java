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
                title = "Know yourself";
                author= "Sai Janardhan";
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
        */
    }
}
