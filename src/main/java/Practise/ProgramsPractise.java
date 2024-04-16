package Practise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ProgramsPractise {
    public static void anagramCheck(String s, String s1) {
        if (s.length() != s1.length()) {
            System.out.println("Not anagrams");
        }
        s = s.toLowerCase();
        s1 = s1.toLowerCase();
        char[] ch = s.toCharArray();
        char[] ch1 = s1.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        if (Arrays.equals(ch, ch1)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }

    public static void intOccurance(int[] arr) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for (int i : arr) {
            if (map1.containsKey(i)) {
                map1.put(i, map1.get(i) + 1);
            } else {
                map1.put(i, 1);
            }
        }

        Iterator<Map.Entry<Integer, Integer>> it = map1.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Integer> entry = it.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void occcharString(String s, char c) {
        int l = s.length();
        s = s.toLowerCase();
        String s1 = s.replaceAll(String.valueOf(c), "");
        int lnew = s1.length();
        int llatest = l - lnew;
        System.out.println("The char has occured " + llatest + " times");
    }

    public static void fibonacci(int a, int b, int count) {
        int c;
        System.out.println(a + " " + b);
        for (int i = 2; i <= count; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }


    public static void main(String[] args) {
        // anagramCheck("Sruthi","ithrus");
        //int[] arr = {1, 2, 3, 5, 5, 3, 4, 2, 3, 4, 5, 7, 8, 9};
        //  intOccurance(arr);
        //  occcharString("Sruthi", 's');
        fibonacci(0, 1, 15);
    }
}
