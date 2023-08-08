package Collections.ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {
    public static void main(String[] args){
        ArrayList<String> ar1 = new ArrayList<String>();
        ar1.add("java");
        ar1.add("python");
        ar1.add(".net");
        ar1.add("PHP");

        ArrayList<String> ar2 = new ArrayList<String>();
        ar2.add("Testing");
        ar2.add("dev ops");

      /*  ar1.addAll(ar2);
        System.out.println(ar1); */

        ar1.addAll(2,ar2);
        System.out.println(ar1);

      /*  ar1.clear();  // to clear all the data from the arraylist
        System.out.println(ar1);*/

        //clone will return an Object type, so we have to convert it to arrylist and store it in another arraylist as follows
        ArrayList<String> ar3= (ArrayList<String>)ar1.clone();
        System.out.println(ar3);

        //contains returns boolean
        System.out.println(ar1.contains("PHP"));


        //indexOf returns boolean
        System.out.println(ar1.indexOf("PHP")>0);


        //LastIndexof - returns the last index for a duplicate element
        ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("Tom","Lisa","Tom","Robert","Mia","Tom"));
        System.out.println(list1);
        System.out.println(list1.lastIndexOf("Tom"));

        list1.remove(2); // when ur removing based on the index
        System.out.println(list1);

        list1.remove("Lisa");
        System.out.println(list1);


        //removeif -- takes a condition
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list2.removeIf(num-> num%2==0);
        System.out.println(list2);

        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        numbers.removeIf(num-> num%2!=0);
        System.out.println(numbers);


        //retainAll --> retains only that particular element
        ArrayList<String> namesList = new ArrayList<String>(Arrays.asList("Tom","Jerry","mia","sofy","Tom"));
        namesList.retainAll(Collections.singleton("Tom"));
        System.out.println(namesList);


        //getting a sub list
        ArrayList<Integer> numbers1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
        //creating another arraylist to store the sublist
        ArrayList<Integer> numberSublist = new ArrayList<Integer>(numbers1.subList(2,6));
        System.out.println(numberSublist);

        //converting an arraylist to an arrat - toArray() -- returns Array
        ArrayList<String> newnamesList = new ArrayList<String>(Arrays.asList("Tom","Jerry","mia","sofy","Tom"));
        Object arr[]= newnamesList.toArray(); //return type is Object array , so create an obj array to store it
        System.out.println(arr[1]); // needs indexing so to print entire array, sonvert it to string
        System.out.println(Arrays.toString(arr)); // converting array to string
        //to print in one by one
        for(Object o: arr){
            System.out.println(o);
        }





    }

}
