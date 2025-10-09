import java.util.*;
public class Pracice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Problems
        /*
            1) AddAndDisplay
            • Create an ArrayList of Strings to store student names.
            • Add 5 names to the list.
            • Display all names using a loop.

            2) RemoveAndUpdate
            • Create an ArrayList of Integers.
            • Add 5 numbers into it.
            • Remove the second element.
            • Update the last element with a new value.
            • Display the updated list.

            3) SearchElement
            • Create an ArrayList of Strings.
            • Add few names into it.
            • Read a name from the user.
            • Check whether it exists in the list or not and display appropriate message.

            4) SortList
            • Create an ArrayList of Integers.
            • Add random numbers into it.
            • Sort the list in ascending order using Collections.sort().
            • Display the sorted list.

            5) ReverseList
            • Create an ArrayList of Integers.
            • Add elements into it.
            • Reverse the list using Collections.reverse().
            • Display both original and reversed lists.
anardhan
            6) ConvertToArray
            • Create an ArrayList of Strings.
            • Add color names into it.
            • Convert the ArrayList into an array.
            • Display all elements of the array.
        */

        //Solutions
        //1
        // ArrayList<String> arr = new ArrayList<>();
        // arr.add("Ganesh");
        // arr.add("Pavana");
        // arr.add("Sutha");
        // arr.add("Sai");
        // arr.add("Janardhan");
        // for (String name : arr) {
        //     System.out.print(name+" ");
        // }

        //2
        // ArrayList<Integer> nums = new ArrayList<>();
        // nums.add(10);
        // nums.add(20);
        // nums.add(30);
        // nums.add(40);
        // nums.add(50);
        // nums.remove(1);
        // nums.set(nums.size() - 1, 99);
        // System.out.println("\nUpdated Numbers List: " + nums);

        //3
        // ArrayList<String> names = new ArrayList<>();
        // names.add("Alapati");
        // names.add("Ganesh");
        // names.add("Sai");
        // names.add("Janardhan");
        // System.out.print("Enter a name to search: ");
        // String searchName = sc.nextLine();
        // if(names.contains(searchName)){
        //     System.out.println(searchName + " found in the list.");
        // }else{
        //     System.out.println(searchName + " not found in the list.");
        // }

        //4
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(45);
        // list.add(12);
        // list.add(78);
        // list.add(23);
        // list.add(56);
        // System.out.print("Before Sorting: " + list);
        // Collections.sort(list);
        // System.out.print("After Sorting: " + list);

        //5
        // ArrayList<Integer> nums = new ArrayList<>();
        // nums.add(1);
        // nums.add(2);
        // nums.add(3);
        // nums.add(4);
        // nums.add(5);
        // System.out.println("Original List: " + nums);
        // Collections.reverse(nums);
        // System.out.println("Reversed List: " + nums);

        //6
        // ArrayList<String> colors = new ArrayList<>();
        // colors.add("Red");
        // colors.add("Blue");
        // colors.add("Green");
        // colors.add("White");
        // String[] colorArray = colors.toArray(String[]::new);
        // System.out.println("Array Elements:");
        // for (String color :colorArray) {
        //     System.out.println(color);
        // }
        sc.close();
    }
}
