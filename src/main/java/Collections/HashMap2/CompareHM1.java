package Collections.HashMap2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CompareHM1 {
    public static void main(String[] args) {
        HashMap<String, String> hm1 = new HashMap<String, String>() {{
            put("Rajesh", "Warangal");
            put("Bikesh", "Pune");
            put("Purva", "Gujarat");
            put("Anjali", "Bareli");
        }};

        HashMap<String, String> hm2 = new HashMap<String, String>() {{

            put("Bikesh", "Pune");
            put("Anjali", "Bareli");
            put("Rajesh", "Warangal");
            put("Purva", "Gujarat");
            put("Purva1", "Gujarat");

        }};


        HashMap<String, String> hm3 = new HashMap<String, String>() {{
            put("Purva", "Warangal");
            put("Bikesh", "Bareli");
            put("Anjali", "Gujarat");
            put("Rajesh", "Pune");
        }};



        //comparing k,v pair -- equals method
        System.out.println(hm1.equals(hm2));


        //comparing keySets -- keysey doesnt have duplicate elements as it is a set(so unique keys will b returned
        System.out.println(hm1.keySet().equals(hm3.keySet()));


        System.out.println("**********************");
        //comparing values -->can use Arraylists if duplicate values are considered as different values.
        //Use hashset if duplicates should be considered as single entry
       // System.out.println(hm1.values().equals(hm2.values()));
        System.out.println(hm1.values());
        System.out.println(hm2.values());
      //  System.out.println(hm1.values().equals(hm2.values()));
      //The above code returns false as it doesnt compare the values of the hashmap collections.


       //So either we use Arraylist -->if duplicates to be treated as separate values
        ArrayList<String> ar1 =new ArrayList<>(hm1.values());
        ArrayList<String> ar2 =new ArrayList<>(hm2.values());
        System.out.println(ar1.equals(ar2));

        //or hashset --> if duplicates to be treated as same value
        HashSet<String> hs1 = new HashSet<String>(hm1.values());
        HashSet<String> hs2 = new HashSet<String>(hm2.values());
        System.out.println(hs1.equals(hs2));



    }
}
