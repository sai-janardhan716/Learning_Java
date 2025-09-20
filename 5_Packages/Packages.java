public class Packages {
    public static void main(String[] args) {
        //Packages
        /*
            -> A package is a group of related classes, interfaces, and sub-packages.
            -> It helps organize code, avoid name conflicts, and makes maintenance easier.
        */

        //Types of packages
        /*
            1) Built-in Packages
            2) User Defined Packages

            1) Built-in Packages
                -> Provided by Java, e.g., java.util, java.io, java.sql, java.time, etc.
                -> We import these using the import statement.
                -> Example: import java.util.Scanner;
            EG:-
            import java.util.Scanner; --> Here the dot represents subfile or subfolder i.e the Scanner is a file in util folder and the util foder present in java folder
            public class Main{
                public static void main(String[] args){
                    Scanner sc = new Scanner(System.in);  --> we are using the scanner file by creating the object for that
                    int a = sc.nextInt();  --> we are using nextInt() method which is present in Scanner file by its object (sc)
                }
            }
        */
    }
}
