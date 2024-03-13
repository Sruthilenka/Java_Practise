package Collections.HashMap2;

import java.util.HashMap;
import java.util.HashSet;

public class AdditionalKeyHM {
    public static void main(String[] args) {
        HashMap<String, String> hm1 = new HashMap<String, String>() {{
            put("Rajesh", "Warangal");
            put("Bikesh", "Pune");
            put("Purva", "Gujarat");
            put("Anjali", "Bareli");
        }};

        HashMap<String, String> hm2 = new HashMap<String, String>() {{
            put("Rajesh", "Warangal");
            put("Bikesh", "Pune");
            put("Purva", "Gujarat");
            put("Anjali", "Bareli");
            put("Sruthi","Visakhapatnam");
        }};

        //for this combine both the keysets and then remove the keysey of the hashmap over whom u want to check the extra
        HashSet<String> combineKeys = new HashSet<String>(hm1.keySet());
        combineKeys.addAll(hm2.keySet());
        combineKeys.removeAll(hm1.keySet());
        System.out.println(combineKeys);


    }
}
