package testpackage;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class newPractice {
    public static void main(String [] args){
        //DelElementFromArray();
        removeDupArrayList();
    }

    public static void DelElementFromArray(){

        int [] arr = {12,21,33,45,66,77};
        int [] temp = new int[arr.length-1];
        int j =0;
        int del = 33;

        for(int i =0;i< arr.length; i++){

            if(arr[i]!=del){
                temp[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(temp));
    }


    public static void removeDupArrayList(){

        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(13,12,13,4,5,4,6,6,6,6,7,8,8,8,8,9,12,15,0,3,0,4,6,7));

        HashSet<Integer> hs = new HashSet<>(al);
        System.out.println("Using HashSet " + hs);

        al.stream().distinct().forEach(d-> System.out.print(" "+d));

    }
    
}
