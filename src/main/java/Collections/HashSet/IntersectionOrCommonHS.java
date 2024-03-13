package Collections.HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOrCommonHS {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(Arrays.asList("S", "P", "D","Power"));
        Set<String> set2 = new HashSet<>();
        set2.addAll(Arrays.asList("Power","Patrol"));
        set1.retainAll(set2);
        System.out.println(set1);


    }
}
