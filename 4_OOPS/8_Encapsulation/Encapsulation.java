//Encapsulation : ensure that the sensitive data hidden from users
/* -> to acheive this we must declare class variables are PRIVATE
   -> if a class variable is set to private it can accessed in that class only
   -> It is the process of wrapping data variables and code methods together into a single unit, and restricting direct access to the internal data of a class
 */
class Account{

    String userName = "saiganesh"; // The username can be accessed by any class
    private int password = 123456; //The password cannot be accessed by other classes

    // There is a way to access the password by creating the get method

    public int getPassword(){
        return password;
    }

    // In the above lines we are initialising values directly
    // What if we have to take the values from user and initialise them to those variables 
    // This problem also cleared by creating the method called set method 

    public void setPassword(int p){
        password = p;
        System.out.println(userName + " : " + password);
    }

    // We can use any name for creating method but while reading or understanding the code the get and set names are useful to understanfd the code
}

public class Encapsulation {
    public static void main(String[] args) {
        Account acc1 = new Account();
        // System.out.println(acc1.userName + " : " + acc1.password); -> It throws error, Because we are trying to acces the password which was set to private in another class
        System.out.println(acc1.userName + " : " + acc1.getPassword());
        acc1.setPassword(234158);
    }
}
