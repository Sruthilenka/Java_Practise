package Collections.ArrayList2;

import java.util.ArrayList;

public class RemoveEvenFromList {
    public static void main(String[] args){
        int[] ar1={1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> list1 =new ArrayList<Integer>();
        for(int a : ar1){
            list1.add(a);
        }
      //  list1.removeIf(ele->ele%2==0);
        System.out.println(list1);

        list1.removeIf(ele->ele%2!=0); //removing odd numbers
        System.out.println(list1);
    }
}
