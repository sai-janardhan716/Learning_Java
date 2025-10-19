import java.util.*;
public class Practice {
    public static void main(String[] args) {
        // Problems
        /*
            1) UniqueNames (TreeSet)
            • Create a TreeSet of Strings to store unique names.
            • Add several duplicate names and print the TreeSet.
            • Observe how it removes duplicates and sorts names alphabetically.

            2) SortedScores (TreeSet)
            • Create a TreeSet of Integer to store student scores.
            • Add few random scores.
            • Print the highest and lowest score using first() and last() methods.

            3) StudentDirectory (TreeMap)
            • Create a TreeMap<Integer, String> to store roll numbers and student names.
            • Add 5 entries and print all in sorted order of roll numbers.
            • Then remove one entry and print again.

            4) CountryCapital (TreeMap)
            • Create a TreeMap<String, String> where key = country and value = capital.
            • Add at least 4 entries.
            • Use get() to find the capital of a specific country.
            • Display all entries using for-each loop.

            5) CustomSorting (TreeSet with Comparator)
            • Create a TreeSet of Strings but sort them in reverse alphabetical order.
            • Use a custom Comparator.
            • Add few names and print the TreeSet.
        */

        // Solutions
        // 1)
        TreeSet<String> names = new TreeSet<>();
        names.add("Alapati");
        names.add("Ganesh");
        names.add("Datha");
        names.add("Sai");
        names.add("Ganesh"); // duplicate ignored
        System.out.println("Unique sorted names: " + names);

        // 2)
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(89);
        scores.add(56);
        scores.add(98);
        scores.add(72);
        scores.add(56);
        System.out.println("Scores: " + scores);
        System.out.println("Lowest: " + scores.first());
        System.out.println("Highest: " + scores.last());

        // 3)
        TreeMap<Integer, String> students = new TreeMap<>();
        students.put(103, "Datha");
        students.put(101, "Sai");
        students.put(104, "Daya");
        students.put(102, "Mukesh");
        System.out.println("Students: " + students);
        students.remove(103);
        System.out.println("After removing roll no 103: " + students);
    }
}
