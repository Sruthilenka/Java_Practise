package Palindrome;

import java.util.Locale;

public class Plaindrome1 {
    //comparing the string for right and left characters

    public static void checkPal(String s){
        int i=0,j=s.length()-1;
        Boolean b = true;
        s=s.toLowerCase();
        while(i<j){
            if(s.charAt(i)!= s.charAt(j)){
                b=false;
            }
            i++;
            j--;
        }
        if(b){
            System.out.println("Plaindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
    public static void main(String[] args){
        checkPal("Nitin");
    }
}
