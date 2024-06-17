package Palindrome;

import java.util.Locale;

public class Plaindrome {

    //When we reverse a string and it is same as the string, it is palindrome.
    //Nitin
    //1001
    public static String reverseString(String s){
        char[] ch= s.toCharArray();
        int l = s.length();
        String rev="";
        for(int i=l-1;i>=0;i--){
           rev=rev+ch[i];
        }
        return rev;
    }

    public static void compareStrings(String s){
        String rev = reverseString(s);
        if(s.equalsIgnoreCase(rev)){
            System.out.println("The String is Palindrome");
        }
        else {
            System.out.println("The String is not palindrome");
        }
    }



    public static void main(String[] args){

        compareStrings("Nitin");
    }
}
