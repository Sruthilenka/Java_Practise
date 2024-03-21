package Practise1;

import java.util.*;

public class ArrayListPractise {
    public static void main(String[] args) {
        ArrayList<Integer> ar1 = new ArrayList<Integer>();
        ar1.add(1);
        ar1.add(2);
        ar1.add(3);


        HashMap<String, ArrayList<Integer>> map = new HashMap<>();
        map.put("key",ar1);
        System.out.println(map);


        //iterate
        for(int i:ar1){
            System.out.print(" "+i);
        }

        //Iterator
        Iterator<Integer> it = ar1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //for loop
        for(int i=0;i<ar1.size();i++){
            System.out.println(ar1.get(i));
        }


        ar1.remove(1);

        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,6,7,3,9,2,3,4,5,6));
        HashSet<Integer> set2 = new HashSet<Integer>(list1);
        LinkedHashSet<Integer> set3 = new LinkedHashSet<Integer>(list1);
        HashMap<Integer,ArrayList<Integer>> map2 = new HashMap<>();
        map2.put(1,list1);
        System.out.println(map2);
        System.out.println(set2);
        System.out.println(set3);
    }
}
