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
        // 2) FileWriter Class
        /*
            -> Used to write text data to files.
            -> Writes character data (not binary).
            -> Overwrites existing content unless opened in append mode.
        */
        // Example:
        try {
            FileWriter fw = new FileWriter("output.txt");  // overwrite mode
            fw.write("Hello, Java File Handling!\n");
            fw.write("This is written using FileWriter.");
            fw.close();
            System.out.println("Data written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
        // -> If we want to append instead of overwrite:
        // FileWriter fw = new FileWriter("output.txt", true);

        // 3) FileReader Class

        // -> Used to read text data from files character by character.
        // -> Often combined with BufferedReader for faster reading.

        // Example:
        try {
            FileReader fr = new FileReader("output.txt");
            int ch;
            while ((ch = fr.read()) != -1) {      // reads till end of file
                System.out.print((char) ch);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        // 4) BufferedReader and BufferedWriter (Optional)

        // -> BufferedReader reads text line by line.
        // -> BufferedWriter writes efficiently using internal buffering.

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("notes.txt"));
            bw.write("This is a buffered writer example.");
            bw.newLine();
            bw.write("It writes faster than FileWriter.");
            bw.close();

            BufferedReader br = new BufferedReader(new FileReader("notes.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        }catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Key Points
        /*
            -> Always close FileReader/FileWriter to release resources.
            -> Prefer BufferedReader/BufferedWriter for efficiency.
            -> Use try-with-resources (Java 7+) for automatic closing:
            try (FileReader fr = new FileReader("file.txt")) { ... }
        */
    }    
}
