package Collections.TreeMap;

import java.util.TreeMap;

public class TreeMap1 {
    public static void main(String[] args){
        TreeMap<String,Integer> tree1 = new TreeMap<String,Integer>(){{
            put("Sruthi",1);
            put("Lenka",2);
            put("Vodka",3);
            put("Whisky",4);

        }};

        //prints based on the order of the key

        System.out.println(tree1);

        tree1.forEach((k,v)-> System.out.println("key "+k+" value "+v));


    }
}
