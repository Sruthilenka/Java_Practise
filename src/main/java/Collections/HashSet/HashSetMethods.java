package Collections.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetMethods {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<String>();
        set1.add("Sparrow");
        set1.add("Khalesi");
        set1.add("John Snow");
        set1.add("John Snow");
        set1.add("khalesi");

        System.out.println(set1.contains("John"));
        set1.remove("khalesi");
        System.out.println(set1);

    }
    }
