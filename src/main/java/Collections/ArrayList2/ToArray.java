package Collections.ArrayList2;

import java.util.ArrayList;
import java.util.Arrays;

public class ToArray {
    public static void main(String[] args){
        ArrayList<String> ar1 = new ArrayList<String>(Arrays.asList("Sruthi","Lisa","John","Pakodi"));
       Object[] newar= ar1.toArray(); //toArray returns an object array
      //  System.out.println(newar); //this will print the address of the location
      //  System.out.println(newar[1]);
        //so use Arrays.toString()
         System.out.println(Arrays.toString(newar));

        //If u want to print them one by one
        for(Object o:newar){
            System.out.println((String)o); //System.out.println(o); is also returning the same output
        }

    }
}
