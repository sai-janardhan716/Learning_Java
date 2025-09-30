// import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
    /*
        //Problems
        1) Username Validation
        -------------------
        -> Create a custom unchecked exception InvalidUsernameException.
        -> Method validate(String username) should throw it if:
                - username length < 6 OR contains spaces.
        -> In main(), read username from user and catch exception if thrown.

        2) File Extension Checker
        ----------------------
        -> Define a custom checked exception InvalidFileExtensionException.
        -> Write a method checkFile(String fileName) that throws this exception 
            if file does not end with ".txt".
        -> In main(), test with different file names.

        3) Negative Number Square Root
        ---------------------------
        -> Create a custom checked exception NegativeNumberException.
        -> Method findSquareRoot(double num) should throw NegativeNumberException 
            if num is negative, otherwise return Math.sqrt(num).
        -> Handle it in main().

        4) Password Strength Checker
        -------------------------
        -> Create a custom unchecked exception WeakPasswordException.
        -> Method validatePassword(String pass) should throw exception if:
                - Length < 8
                - Does not contain a digit
                - Does not contain a special character
        -> In main(), test different passwords and catch the exception to print a strong password hint.

        5) College Admission
        -----------------
        -> Custom checked exception LowScoreException.
        -> Method applyForAdmission(double marks) throws LowScoreException if marks < 60.
        -> In main(), read marks and handle the exception.

        6) Divide by Zero Custom
        ---------------------
        -> Define a custom unchecked exception DivisionByZeroException.
        -> Method divide(int a, int b) should throw it if b == 0.
        -> Handle in main() and display a clear error message.
    */
    //Solutions
    /*
        1)
        class InvalidUsernameException extends RuntimeException{
            public InvalidUsernameException(String msg){ super(msg); }
        }
        class UsernameValidator{
            public void validate(String username){
                if(username.length()<6||username.contains(" "))
                    throw new InvalidUsernameException("Username must be >=6 chars and contain no spaces");
                System.out.println("Valid username");
            }
        }
        In main
        try{
            System.out.print("Enter username: ");
            new UsernameValidator().validate(sc.nextLine());
        } catch(InvalidUsernameException e){
            System.out.println("Error:"+e.getMessage());
        }

        2)
        class InvalidFileExtensionException extends Exception{
            public InvalidFileExtensionException(String msg){ super(msg);}
        }
        class FileChecker{
            public void checkFile(String fileName) throws InvalidFileExtensionException{
                if(!fileName.endsWith(".txt"))
                    throw new InvalidFileExtensionException("File must have .txt extension");
                System.out.println("Valid file: " +fileName);
            }
        }
        In main
        try{
            System.out.print("Enter file name:");
            new FileChecker().checkFile(sc.nextLine());
        } catch (InvalidFileExtensionException e){
            System.out.println("Error: "+ e.getMessage());
        }

        3)
        class NegativeNumberException extends Exception{
            public NegativeNumberException(String msg){ super(msg);}
        }
        class MathHelper{
            public double findSquareRoot(double num) throws NegativeNumberException{
                if(num< 0) throw new NegativeNumberException("Cannot find square root of negative number");
                return Math.sqrt(num);
            }
        }
        In main
        try{
            System.out.print("Enter a number for square root: ");
            double num=sc.nextDouble();
            double res=new MathHelper().findSquareRoot(num);
            System.out.println("Square root: " +res);
        }catch (NegativeNumberException e){
            System.out.println("Error: "+e.getMessage());
        }

        4)
        class WeakPasswordException extends RuntimeException{
            public WeakPasswordException(String msg){super(msg); }
        }
        class PasswordValidator{
            public void validatePassword(String pass){
                if(pass.length()<8||!pass.matches(".*\\d.*")||!pass.matches(".*[^a-zA-Z0-9].*"))
                    throw new WeakPasswordException("Password must be >=8 chars, include a digit & special char");
                System.out.println("Strong password");
            }
        }
        In Main
        try{
            System.out.print("Enter password:");
            new PasswordValidator().validatePassword(sc.nextLine());
        }catch (WeakPasswordException e){
            System.out.println("Error: "+e.getMessage());
        }

        5)
        class LowScoreException extends Exception{
            public LowScoreException(String msg){super(msg); }
        }
        class Admission{
            public void applyForAdmission(double marks) throws LowScoreException{
                if(marks<60) throw new LowScoreException("Score too low for admission");
                System.out.println("Admission granted");
            }
        }
        In main
        try{
            System.out.print("Enter marks: ");
            double marks=sc.nextDouble();
            new Admission().applyForAdmission(marks);
        } catch(LowScoreException e){
            System.out.println("Error: "+e.getMessage());
        }

        6)
        class DivisionByZeroException extends RuntimeException{
            public DivisionByZeroException(String msg){super(msg); }
        }
        class Divider{
            public int divide(int a, int b){
                if(b==0) throw new DivisionByZeroException("Cannot divide by zero");
                return a/b;
            }
        }
        In main
        try{
            System.out.print("Enter numerator: ");
            int a =sc.nextInt();
            System.out.print("Enter denominator: ");
            int b=sc.nextInt();
            int result = new Divider().divide(a, b);
            System.out.println("Result: "+result);
        }catch (DivisionByZeroException e){
            System.out.println("Error: "+e.getMessage());
        }
    */
    }
}
