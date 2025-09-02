package Learning_Java.BASICS;
import java.util.Scanner;
public class ifelseswitch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
/* 
    Conditional Statements (if, else if, switch)
    --------------------------------------------

    1) What are Conditional Statements?
    -----------------------------------
    Conditional statements in Java are used to make decisions in the program 
    based on conditions (true/false). 
    They help to control the flow of execution.

    -> They allow us to execute certain code only if a condition is satisfied.
    -> Conditions are usually boolean expressions (true or false).

    2) Types of Conditional Statements in Java
    -----------------------------------------------

    a) if Statement
    ---------------
    -> Executes a block of code if the condition is true.
    Syntax:
    if (condition) {
        // code to be executed
    }

    Example:
    int age = 20;
    if (age >= 18) {
        System.out.println("You are an adult");
    }


    b) if-else Statement
    --------------------
    -> Provides two paths:
    - if condition is true → executes one block
    - else → executes another block

    Syntax:
    if (condition) {
        // executes if condition is true
    } else {
        // executes if condition is false
    }

    Example:
    int age = 15;
    if (age >= 18) {
        System.out.println("Eligible to vote");
    } else {
        System.out.println("Not eligible to vote");
    }


    c) if-else-if Ladder
    ---------------------
    -> Used when multiple conditions need to be checked.
    -> First condition that evaluates true will be executed, rest are skipped.

    Syntax:
    if (condition1) {
        // block1
    } else if (condition2) {
        // block2
    } else {
        // default block
    }

    Example:
    int marks = 75;
    if (marks >= 90) {
        System.out.println("Grade: A");
    } else if (marks >= 75) {
        System.out.println("Grade: B");
    } else if (marks >= 50) {
        System.out.println("Grade: C");
    } else {
        System.out.println("Fail");
    }


    d) switch Statement
    --------------------
    -> A cleaner way to check multiple values of a variable.
    -> Works with:
    - int, byte, short, char
    - String
    - Enum

    Syntax:
    switch (expression) {
        case value1:
            // code block
            break;
        case value2:
            // code block
            break;
        ...
        default:
            // default code block
    }

    Example:
    int day = 3;
    switch(day) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        default:
            System.out.println("Invalid day");
    }

    3) Why are Conditional Statements Important?
    ------------------------------------------
    -> They make programs interactive and decision-driven.
    -> Help in executing only relevant code, avoiding redundancy.
    -> Improve flexibility and efficiency in logic building.

    In summary:
    -----------
    -> Use "if" for simple true/false checks.
    -> Use "if-else-if" for multiple conditions.
    -> Use "switch" for clean checking of many possible values.

*/
        /*Decision makeres in java are : 
         1)If-else Ststement
         2) Switch Statement */
        System.out.print("Enter Your Age : ");
        short age = sc.nextShort();
        if (age >= 60){
            System.out.println("You are aged person");
        }
        else if (age >= 45 && age < 60) {
            System.out.println("You are middle aged person");
        }
        else if(age >= 26 && age < 45){
            System.out.println("You are adult");
        }
        else if (age >= 18 && age < 25){
            System.out.println("You are young adult");
        }
        else{
            System.out.println("You are child");
        }
        //Switch Case - Used to make a choice between number of alternatives
        //Example
        System.out.println("Welcome to our Resturant.");
        System.out.println("Here the menu is");
        System.out.println("1. Egg Fried Rice");
        System.out.println("2. Chicken Fried Rice");
        System.out.println("3. Veg Fried Rice");
        System.out.println("4. Manchooria");
        System.out.println("5. Egg Manchooria");
        System.out.println("6. Noodles");
        System.out.println("7. Chicken Noodles");
        System.out.println("8. Chcken 65");
        System.out.print("Select an item : ");
        byte order = sc.nextByte();
        switch(order){
            case 1:
                System.out.println("The price of Egg Fried rice is 100rs");
                break;
            case 2:
                System.out.println("The price of chicken fried rice is 90rs");
                break;
            case 3:
                System.out.println("The price of veg Fried rice is 80rs");
                break;
            case 4:
                System.out.println("The price of Manchooria is 40rs");
                break;
            case 5:
                System.out.println("The price of Egg manchooria is 50rs");
                break;
            case 6:
                System.out.println("The price of Noodles is 100rs");
                break;
            case 7:
                System.out.println("The price of Chicken Noodles is 110rs");
                break;
            case 8:
                System.out.println("The price of Chicke65 is 110rs");
                break;
            default:
                System.out.println("Please select valid option");
        }

        //Another example of switch case without using the break statement
        
        System.out.print("Enter a day : ");
        String day = sc.next();
        switch(day){
            case "Saturday" , "Sunday" -> System.out.println("Set the alarm at 9AM");
            case "Monday" , "Tuesday" , "Wednesday" , "Thursday" , "Friday" -> System.out.println("Set the alarm at 7AM");
            default -> System.out.println("Enter a vaid day");
        }
    }
}