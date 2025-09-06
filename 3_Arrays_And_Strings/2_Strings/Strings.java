public class Strings {
     public static void main(String[] args) {
          /*
               -> A String in Java is a sequence of characters enclosed in double quotes (" ")
               -> In java The string is not a data type, it is string class
                    Strings are immutable which means if we want to change a string then it
                    reates new object for that and gives that object address to the declared
                    variable
           */
          String name = new String("Hii");
          System.out.println(name);
          String name1 = "ganesh";
          System.out.println(name1);

          // String Methods
          /* 1 */ String nonTrim = "     Ganesh     ";
          System.out.println(nonTrim);
          System.out.println("1" + nonTrim.trim()); // it removes spaces outside of the text
          String string = "Ganesh Alapati";
          System.out.println(string);
          /* 2 */ System.out.println("2" + string.length());

          /* 3 */ System.out.println("3" + string.toUpperCase());

          /* 4 */ System.out.println("4" + string.toLowerCase());

          /* 5 */ System.out.println("5.1" + string.substring(7)); // It prints the string based on given index
          System.out.println("5.2" + string.substring(0, 2));

          /* 6 */ System.out.println("6.1" + string.replace('a', 'p'));
          System.out.println("6.2" + string.replace("Ganesh", "Tripura"));

          /* 7 */ System.out.println("7.1" + string.startsWith("Ga")); // it returns true if string starts with Ga
          System.out.println("7.2" + string.startsWith("Al"));
          System.out.println("7.3" + string.startsWith("n", 2)); // it is used to check whether the given character or
                                                                 // strings is at index which is given in toffset

          /* 8 */ System.out.println("8" + string.endsWith("ti"));

          /* 9 */ System.out.println("9" + string.charAt(7));

          /* 10 */System.out.println("10.1" + string.indexOf('A'));
          System.out.println("10.2" + string.indexOf("nesh")); // it returns only n's index
          System.out.println("10.3" + string.indexOf('a', 7)); // it returns the index of given string from given index
                                                               // i.e 9

          /* 11 */System.out.println("11" + string.lastIndexOf('a')); // returns the index of the last occurrence of a
                                                                      // specified value in a string i.e 11 (checks from
                                                                      // right to left)

          /* 12 */System.out.println("12" + string.equals("Ganesh"));

          /* 13 */System.out.println("13" + string.equalsIgnoreCase("GaNeSh AlApAtI"));
          // Escape Characters
          System.out.println("HII,\nMy name is ganesh");
          System.out.println("HII,\tMy name is ganesh");
          System.out.println("HII \\ My name is BackSlash");
          System.out.println("HII \" My name is Double Quotes");

          // String Buffer - a class in java which provides more functionality for string
          /*
               -> The main difference between the string and string buffer is, the string
                    buffer is mutable(which means, whenever we wants to change the string then it
                    modifies that object only, it doesn't create new object) and string is
                    immutable
               -> It is mainly threads safe
           */
          StringBuffer sb = new StringBuffer("Gani");
          sb.append(" Alapati"); // in this the value of string changes without creating new object
          System.out.println(sb);
          StringBuffer sbs = new StringBuffer("Ganesh");
          String scsss = sbs.toString(); // Converting the StringBuffer to String

          // StringBuilder - same as StringBuffer but the main difference is it is not threads safe
          /*
               -> It is also mutable
               -> It is also Threads safr
           */
          StringBuilder sb2 = new StringBuilder("Janardhan");
          sb.append(" Alapati");
          System.out.println(sb2);
     }
}
