package Collections.ArrayList2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListFromArray {
    public static void main(String[] args){

      //  ArrayList<String> al1= new ArrayList<String>(Arrays.asList("Sruthi","Lenka"));
        String[] name= {"Sruthi","Lenka"};
        ArrayList<String> al1= new ArrayList<String>(Arrays.asList(name));
        System.out.println(al1);
        System.out.println(al1.get(0));


     // int[] numbers=new int[4];
        int[] numbers = {1,2,3,4};
     //   ArrayList<Integer> Num1 =new ArrayList<Integer>(Arrays.asList(numbers));-->This gives error as  the Arrays.asList() method does not accept an array of primitives directly.
        ArrayList<Integer> Num1 =new ArrayList<Integer>();
        for(int num:numbers){
            Num1.add(num); //Autoboxing-- converting int to Integer
        }

      //  or can directly give the numbers:
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        //using stream lamba
        Num1.stream().forEach(ele->System.out.println(ele));

        //using iterator:
        Iterator<Integer> it = Num1.iterator();
        while(it.hasNext())
            System.out.println(it.next());


    }
}
