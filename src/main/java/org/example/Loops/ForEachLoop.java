package org.example.Loops;

public class ForEachLoop {
    public static void main(String[] args){
        String[] fruits ={"Apple","Mango", "Grapes"};
       /* for(int i=0; i<= fruits.length; i++)
            System.out.println(fruits[i]); */

        //lets use for-each loop for the same
        for (String fruit: fruits) {
            System.out.println(fruit);
        }
    }
}
