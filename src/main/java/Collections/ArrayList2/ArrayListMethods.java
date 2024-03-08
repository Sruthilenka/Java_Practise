package Collections.ArrayList2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> num1 = new ArrayList<Integer>();
      num1.add(1);
      num1.add(2);

        ArrayList<Integer> num2 = new ArrayList<Integer>();
        num2.add(3);
        num2.add(4);
        num2.add(5);
        num2.addAll(num1); //addAll

        System.out.println(num1);
        System.out.println(num2);
        //addAll from an index
        num2.addAll(2,num1); //so from 2nd index it would add the num1 list elements
        System.out.println(num2);

        //clear
        num1.clear();
        System.out.println(num1);

        //clone-- returns an object so cast it to Arraylist type
        ArrayList<Integer> ar1 = (ArrayList)num2.clone();
        System.out.println(ar1);
    }
}
