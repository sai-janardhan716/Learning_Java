import java.util.*;
public class Practice {
    public static void main(String[] args) {
        // Problems
        /* 
            1) WordFrequency
            • Create an array of strings (words).
            • Use a HashMap to count how many times each word appears.
            • Print each word and its frequency.

            2) DuplicateCheck
            • Create an array of integers.
            • Use a HashSet to check if there are any duplicates.
            • If a duplicate is found, display which number is repeated.

            3) StudentMarks
            • Create a HashMap to store student names as keys and marks as values.
            • Allow user to search for a student by name and print their marks.
            • If the student name is not found, display "Student not found".

            4) UnionIntersection
            • Create two integer arrays.
            • Use HashSet to find:
              - Union (all unique elements)
              - Intersection (common elements)
            • Display both results.

            5) CharFrequency
            • Read a string from the user.
            • Use a HashMap to count the frequency of each character.
            • Print each character along with its count.
        */

        // Solutions
            // 1)
            String[] words = {"apple", "banana", "apple", "orange", "banana", "apple"};
            HashMap<String, Integer> map = new HashMap<>();
            for(String w : words){
                map.put(w, map.getOrDefault(w, 0) + 1);
            }
            for(String key : map.keySet()){
                System.out.println(key + " : " + map.get(key));
            }
    }    
}
