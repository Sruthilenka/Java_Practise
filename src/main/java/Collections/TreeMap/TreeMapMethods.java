package Collections.TreeMap;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapMethods {
    public static void main(String[] args) {
        TreeMap<Integer, String> tree1 = new TreeMap<Integer, String>() {{
            put(1000,"Sruthi");
            put(200,"Lenka");
            put(500,"Vodka");
            put(300,"Whisky");
        }};

        //to get the lowest salary from the above map
        System.out.println(tree1.firstKey());

        //to get the highest salary
        System.out.println(tree1.lastKey());

        //get all sal,name pairs for whom sal<500
        Set<Integer> less5sal = tree1.headMap(500).keySet(); //lesser sals will go to head side
        System.out.println(less5sal);
        System.out.println(tree1.get(200));


        //get all sals which are greater than 500 --> goes into tail side
        Set<Integer> great5sal = tree1.tailMap(500).keySet();
        System.out.println(great5sal);
    }
}
