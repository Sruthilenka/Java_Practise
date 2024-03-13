package Collections.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratingHashSet {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<String>();
        set1.add("Sparrow");
        set1.add("Khalesi");
        set1.add("John Snow");
        set1.add("John Snow");
        set1.add("khalesi");

        for(String s: set1){
            System.out.println(s);
        }

        Iterator<String> it = set1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }



    }
}
