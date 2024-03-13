package Collections.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetDeclaration {
    public static void main(String[] args){
        Set<String> set1 = new HashSet<String>();
        set1.add("Sparrow");
        set1.add("Khalesi");
        set1.add("John Snow");
        set1.add("John Snow");
        set1.add("khalesi");  //case sensitive

        System.out.println(set1);

    }
}
