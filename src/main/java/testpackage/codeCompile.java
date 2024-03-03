package testpackage;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.*;
import java.util.stream.Collectors;

public class codeCompile {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
//        LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>(al);
//        System.out.println(hs.stream().sorted().collect(Collectors.toList()));
//        System.out.println("_____________");
//
//       List<Integer> l = al.stream().distinct().sorted().collect(Collectors.toList());
//        System.out.println(l);

//       ArrayList<Integer> newal = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
//        if(newal.equals(al)){
//            System.out.println("____match_________");
//        }else{
//            System.out.println("mismatch");
//        }
//       newal.removeAll(al); // to find missing elememt
//       System.out.println(newal);
//
//       ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("J","P","H","S"));
//       ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("J","P","H","B"));
//
//       System.out.println("--------");
//       l1.retainAll(l2); // to find common element
//       System.out.println(l1);

//        double arr[] = {44,5999.5,888,343,5999};
//       double max = arr[0];
//       for(int i = 0; i< arr.length; i++){
//           if(arr[i]>max){
//              max = arr[i];
//           }
//       }
//      System.out.println(max);

//       String str = "There was was a cold cold cold cold day a day ";
//
//       Map<String, Integer> map = new HashMap<String, Integer>();
//       int count = 1;
//       String[] arr = str.split(" ");
//       for (String word : arr) {
//           if (map.containsKey(word)) {
//               map.put(word, map.get(word)+1);
//           } else {
//               map.put(word,count);
//           }
//       }
//       for(String x : map.keySet()){
//           if(map.get(x)>1){
//               System.out.println("ouccr more than once are : " +x);
//           }
//       }
//       System.out.println(map);
//   }










         class StoneMerger {

            public  void main(String[] args) {
                // Example usage:
                List<Integer> stones = new ArrayList<>(Arrays.asList(1, 2, 1));
                System.out.println(magic(stones)); // Output: 1

                stones = new ArrayList<>(Arrays.asList(1, 1, 5));
                System.out.println(magic(stones)); // Output: 2

                stones = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 2));
                System.out.println(magic(stones)); // Output: 3
            }

            public  int magic(List<Integer> stones) {
                Collections.sort(stones);

                int merges = 0;
                int lastLevel = stones.get(0);

                for (int i = 1; i < stones.size(); i++) {
                    int currentLevel = stones.get(i);

                    while (currentLevel <= lastLevel) {
                        currentLevel++;
                        merges++;
                    }

                    lastLevel = currentLevel;
                }

                return merges;
            }
        }
    }
}

