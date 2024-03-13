package Collections.HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AddingTwoSets {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 3, 5, 7, 9));

    Set<Integer> num2 = new HashSet<>();
    num2.addAll(Arrays.asList(1,3,5,7,9));


        //get the union
        Set<Integer> union = new HashSet<Integer>(set1);
         union.addAll(set2);
         union.addAll(num2);
        System.out.println(union);
    }
}
