package src.java_new_coding;

import java.util.LinkedHashSet;

public class Test004 {
    //RemoveDuplicates

        public static String remove(String str) {
            // add chars to LinkedHashSet
            LinkedHashSet<Character> set = new LinkedHashSet<>();
            // Add characters from the input string to the LinkedHashSet
            for (char c : str.toCharArray()) {
                set.add(c);
            }

            // Construct the result string from the characters in the set
            StringBuilder result = new StringBuilder();
            for (Character c : set) {
                result.append(c);
            }

            // Convert StringBuilder to String and return
            return result.toString();
        }

        public static void main(String[] args) {
            String input = "Hello World";
            String output = remove(input);
            System.out.println(output); // Helo Wrd
        }

    }



