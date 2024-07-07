package FreshWorks;

import java.util.*;

public class OccurencesDescending {
    public static void main(String[] args) {
        /*To print the elements of an array based on the descending order of their occurrences, with ties broken by the descending value of the number itself when occurrences are the same, you can follow these steps:*/
        int[] array = {3, 5, 1, 4, 5, 1, 4, 5, 2, 2};
        Map<Integer, Integer> occurencesMap = new HashMap<>();

        //counting occurences
        for (int num : array) {
            occurencesMap.put(num, occurencesMap.getOrDefault(num, 0) + 1);
        }

        //Sort elements based on occurences and value
        List<Integer> sortedNumbers = new ArrayList<>(occurencesMap.keySet());
        Collections.sort(sortedNumbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int frequencyCompare = occurencesMap.get(o2).compareTo(occurencesMap.get(o1)); //Descending order by occurences
                if (frequencyCompare != 0) {
                    return frequencyCompare;
                } else {
                    return o2.compareTo(o1); // Descending order by number value if occurrences are the same
                }
            }
        });
      /*  List<Map.Entry<Integer, Integer>> sortedNumbers = new ArrayList<>(occurencesMap.entrySet());
        Collections.sort(sortedNumbers, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                int frequencyCompare = o2.getValue().compareTo(o2.getValue());
                if (frequencyCompare != 0) {
                    return frequencyCompare;
                } else {
                    return o2.getValue().compareTo(o1.getValue()); //This statement has to be checked
                }
            }
        });*/

        // Step 3: Print elements based on sorted order
       System.out.println("Elements by occurrence (with ties broken by descending value):");
        for (int num : sortedNumbers) {
           // System.out.println(num + " (Occurrences: " + occurencesMap.get(num) + ")");
            System.out.println(num);
        }
      /*  System.out.println("Elements by occurrence (with ties broken by descending value):");
        for (Map.Entry<Integer, Integer> entry : sortedNumbers) {
            // System.out.println(num + " (Occurrences: " + occurencesMap.get(num) + ")");
            System.out.println(entry);*/

        }
    }


