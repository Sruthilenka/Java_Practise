package Collections.HashMap2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CompareByValuesHM {
    public static void main(String[] args){
        HashMap<String,String> hm1 = new HashMap<>();
        hm1.put("s","1");
        hm1.put("p","2");

        HashMap<String,String> hm2 = new HashMap<>();
        hm2.put("s","1");
        hm2.put("p","2");

        ArrayList<String> ar1=new ArrayList<>(hm1.values());
        ArrayList<String> ar2=new ArrayList<>(hm2.values());
        System.out.println(ar1.equals(ar2));

        HashSet<String> hs1 = new HashSet<>(hm1.values());
        HashSet<String> hs2 = new HashSet<>(hm2.values());
        System.out.println(hs1.equals(hs2));





    }
}
