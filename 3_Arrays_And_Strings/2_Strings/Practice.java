public class Practice {
    public static void main(String[] args) {
        //Practice Problems

        /* 
            1) Count the number of vowels in a string
            2) Reverse a string using StringBuilder
            3) Check if a string is a palindrome
            4) Count the occurrence of a character in a string
            5) Split a sentence into words
            6) Remove all whitespace from a string
            7) Find the largest word in a sentence
        */ 

        //Solutios

        /*
            1)  String str = "Alapati G P S Sai Janardhan";
                str = str.toLowerCase();
                int count = 0;
                for(int i=0; i<str.length(); i++) {
                    char ch = str.charAt(i);
                    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                        count++;
                    }
                }
                System.out.println("Number of vowels: " + count);

            2)  String str = "Ganesh";
                StringBuilder sb = new StringBuilder(str);
                String reversed = sb.reverse().toString();
                System.out.println("Reversed String: " + reversed);

            3)  String str = "madam";
                String reversed = new StringBuilder(str).reverse().toString();
                if(str.equals(reversed)) {
                    System.out.println(str + " is a palindrome.");
                } else {
                    System.out.println(str + " is not a palindrome.");
                }
            
            4)  String str = "ganesh pavan sutha sai janardhan";
                char target = 'a';
                int count = 0;
                for(int i=0; i<str.length(); i++) {
                    if(str.charAt(i) == target) {
                        count++;
                    }
                }
                System.out.println("Character '" + target + "' occurred " + count + " times.");

            5)  String sentence = "ALAPATI G P S SAI JANARDHAN";
                String[] words = sentence.split(" ");
                System.out.println("Words in sentence:");
                for(String word : words) {
                    System.out.println(word);
                }

            6)  String str = "Java   is   fun   ";
                String noSpaces = str.replaceAll("\\s+", "");
                System.out.println("Original: '" + str + "'");
                System.out.println("Without spaces: '" + noSpaces + "'");

            7)  String sentence = "A G P S Sai Janardhan";
                String[] words = sentence.split(" ");
                String largest = "";
                for(String word : words) {
                    if(word.length() > largest.length()) {
                        largest = word;
                    }
                }
                System.out.println("Largest word: " + largest);
        */
    }
}
