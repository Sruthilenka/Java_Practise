package Collections.ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListsConcept {
    public static void main(String[] args) {
        /* 3 ways to declare ArrayLists
         1.Default Generics
        ArrayList ar = new ArrayList(); {here mostly a warning will be given to declare the generic form in parameterised form}
        */
         ArrayList<Object> ar = new ArrayList<Object>(); // Parameterised way of declaration
        ar.add(100); //index = 0
        ar.add(200);
        ar.add("testing");
        ar.add('t');
        ar.add(12.33);
        ar.add(true);

        System.out.println(ar);

        System.out.println(ar.get(2));

        System.out.println(ar.size());

        System.out.println("Highest Index:"+ (ar.size()-1));

        ar.add(9);
        ar.add("test");
        System.out.println("Highest Index:"+ (ar.size()-1));


        System.out.println("**************************");
        // list with other collection
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,60,70,80,90,100));
        // so here when a new obj is created constructor will be called, so there we are passing array as list of numbers
        System.out.println(numbers);

        ArrayList<String> Names = new ArrayList<String>(Arrays.asList("JAva",".net","python"));
        System.out.println(Names);
        System.out.println(Names.size());

    }
}
