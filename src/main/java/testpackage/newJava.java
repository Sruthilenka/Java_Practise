package testpackage;

import java.util.Arrays;
import java.util.*;

public class newJava {

    public static void main(String [] args){

        HashMap<String, Integer>  mp = new HashMap<String, Integer>();

        mp.put("id", 2);
        mp.put("Count", 7);
        mp.put("Abc", 4);
        mp.put("Value",100);
        mp.put("Abc",123);

        System.out.println(mp.entrySet());

        for(Map.Entry<String,Integer> me:mp.entrySet()){
            System.out.println(me.getKey() + "->" +me.getValue());


            if(mp.entrySet().contains(me.getKey())){
                System.out.println("Multiple Values are present");
            }
            //to test
            //1) check when you get values if correct values is displayed
            //2) same with Key
            //3) check if hashMap is dynamic--> can be added more key value pair
            //4) see if duplicate keys are allowed
            //5) check if duplicate null values are allowed
            //6) duplicate values etc.
        }

    }

}
