package Collections.HashMap2;

import testpackage.Hashmap;

import java.util.HashMap;

public class BasicDeclaration {
    public static void main(String[] args){
        HashMap<String,String> hm1 = new HashMap<>();
        hm1.put("India","Delhi");
        hm1.put("USA","Washington DC");
        hm1.put("UK","London");
        hm1.put("UK","London1"); //Duplicate values are allowed but duplicate keys not allowed. Uniqueness is based on the key
        hm1.put(null,"Berlin");
        hm1.put("France",null);
        hm1.put("Berlin",null);

        System.out.println(hm1.get("USA"));
        System.out.println(hm1.get("UK")); //latest value will be fetched for key UK
        System.out.println(hm1.get(null));
        hm1.put(null,"LA");
        System.out.println(hm1.get(null));//latest value against null key will be fetched
        System.out.println(hm1.get("France"));
        System.out.println(hm1.get("Berlin")); //null values are allowed but only one null key

        hm1.remove("Berlin");
        System.out.println(hm1);


    }
}
