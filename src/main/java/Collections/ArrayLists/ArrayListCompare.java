package Collections.ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {
    public static void main(String[] args){
     //1.Sort and then equals:
        ArrayList<String> L1 = new ArrayList<String>(Arrays.asList("A","C","E","D","B"));
        ArrayList<String> L2 = new ArrayList<String>(Arrays.asList("C","B","D","A","F"));
        ArrayList<String> L3 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
       // Collections.sort(L1);
        Collections.sort(L2);
        System.out.println(L1.equals(L2));
        System.out.println(L1.equals(L3)); // As l1 is alrdy sorted and is equal to l3 it returns true else false as it checks indexing too



        //2. Sort and compare 2 lists to find additional elements
        ArrayList<String> L4 = new ArrayList<String>(Arrays.asList("A","C","E","D","B"));
        ArrayList<String> L5 = new ArrayList<String>(Arrays.asList("C","B","D","A","F"));
       // L4.removeAll(L5);
        System.out.println(L4);


        //3. Finding the missing element
        L5.removeAll(L4);
        System.out.println(L5);


        //4.Finding the common elements
        ArrayList<String> L6 = new ArrayList<String>(Arrays.asList("Java","C","C#","Ruby","Python"));
        ArrayList<String> L7 = new ArrayList<String>(Arrays.asList("Java",".net","C#","Ruby","JScript"));
        L6.retainAll(L7);
        System.out.println(L6);

    }
}
