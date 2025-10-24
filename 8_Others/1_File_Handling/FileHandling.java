import java.io.*;
public class FileHandling {
    public static void main(String[] args) {
        // File Handling in java
        /*
            -> File handling in Java allows us to work with files on the disk - we can create, read, write, and delete files.
            -> Java provides several classes in the java.io package:
                -> File
                -> FileReader
                -> FileWriter
                -> BufferedReader / BufferedWriter (for efficient reading/writing)
        */

        // File class
        /*
            -> Used to represent file or directory paths.
            -> Helps to check file existence, create new files, and delete them.
        */
        // Example
        try {
            File f = new File("sample.txt");  // creates file object
            if (f.createNewFile()) {
                System.out.println("File created: " + f.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        /*
            -> createNewFile() -> creates a new empty file if it doesn’t exist.
            -> exists() -> checks if a file already exists.
            -> delete() -> deletes a file.
            -> getName(), getPath(), length() -> give file information.
        */
    }    
}
