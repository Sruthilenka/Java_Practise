package FreshWorks;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CommonChars {
 /*To modify the provided code to achieve the result of printing characters that are common in all strings from the array {"freshworks", "freedom", "free", "freezer"}, we can adjust the logic to correctly count occurrences of characters across all strings and then print only those characters whose occurrences equal the length of the input array.*/
        public static void main(String[] args) {
            String[] strings = {"freshworks", "frebie", "free", "freedom"};

            Set<Character> commonCharacters = findCommonCharacters(strings);

            System.out.println("Common characters in all strings:");
            for (char ch : commonCharacters) {
                System.out.print(ch + " ");
            }
        }

        public static Set<Character> findCommonCharacters(String[] strings) {
            if (strings == null || strings.length == 0) {
                return Collections.EMPTY_SET;
            }

            // Convert first string to set of characters
            Set<Character> commonChars = new HashSet<>();
            for (char ch : strings[0].toCharArray()) {
                commonChars.add(ch);
            }

            // Iterate through remaining strings and retain characters that are common
            for (int i = 1; i < strings.length; i++) {
                Set<Character> currentChars = new HashSet<>();
                for (char ch : strings[i].toCharArray()) {
                    currentChars.add(ch);
                }
                // Retain only common characters
                commonChars.retainAll(currentChars);
            }

            return commonChars;
        }
    }

