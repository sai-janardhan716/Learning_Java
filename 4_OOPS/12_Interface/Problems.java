public class Problems {
    public static void main(String[] args) {
        // Problems
        /*
            1) Payment Gateway
            • Create an interface Payment with methods pay(double amount) and refund(double amount).
            • Implement two classes:
                -> CreditCardPayment
                -> UpiPayment
            • Each class should print appropriate messages for pay and refund.

            2) Vehicle Abilities
            • Create two interfaces:
                -> Drivable (method drive())
                -> Flyable  (method fly())
            • Implement a class FlyingCar that implements both interfaces.
            • Demonstrate driving and flying actions.

            3) Shape Calculations
            • Define an interface Shape with:
                -> double area()
                -> double perimeter()
            • Implement classes Circle and Rectangle to calculate area and perimeter.

            4) Music Player
            • Define an interface Playable with methods play() and stop().
            • Implement two classes:
                -> Mp3Player
                -> Radio
            • Each class prints its own play and stop messages.

            5) Sports Scoring
            • Create an interface Scorable with method getScore().
            • Implement classes:
                -> Cricket (return runs)
                -> Football (return goals)
            • In main, create objects of both and display their scores.
        */
        // Solutions
        /*
        1) Payment Gateway
            interface Payment{
                void pay(double amount);
                void refund(double amount);
            }
            class CreditCardPayment implements Payment{
                public void pay(double amount){
                    System.out.println("Paid " + amount + " using Credit Card.");
                }
                public void refund(double amount){
                    System.out.println("Refunded " +amount+ " to Credit Card.");
                }
            }
            class UpiPayment implements Payment{
                public void pay(double amount){
                    System.out.println("Paid " +amount + " using UPI.");
                }
                public void refund(double amount){
                    System.out.println("Refunded " + amount + " to UPI account.");
                }
            }

            2) interface Drivable{
                void drive();
            }
            interface Flyable{
                void fly();
            }
            class FlyingCar implements Drivable, Flyable{
                public void drive() {
                    System.out.println("FlyingCar is driving on road.");
                }
                public void fly(){
                    System.out.println("FlyingCar is flying in sky.");
                }
            }

            3) interface Shape{
                double area();
                double perimeter();
            }
            class Circle implements Shape{
                double radius;
                Circle(double radius){this.radius = radius;}
                public double area(){return Math.PI * radius * radius;}
                public double perimeter(){return 2 * Math.PI * radius;}
            }
            class Rectangle implements Shape{
                double length, width;
                Rectangle(double length, double width){
                    this.length = length;
                    this.width = width;
                }
                public double area(){return length * width;}
                public double perimeter(){return 2 * (length + width);}
            }
        */
    }
}
