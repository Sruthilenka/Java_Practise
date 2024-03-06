package Anagram;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagram {
    //string abcd and cbad are anagrams
    //string abcd and cbade are not anagrams
    //so for 2 strings to be anagrams, length should be same and same characters should be used with different order of characters
    public static void anagramCheck(String s1,String s2){
        int l1=s1.length();
        int l2=s2.length();
        if(l1!=l2){
            System.out.println("The two strings "+s1+" and "+s2+" are not anagrams");
        }
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
      if(Arrays.equals(ch1,ch2)){
          System.out.println("The two strings "+s1+" and "+s2+" are anagrams");
      }
      else{
          System.out.println("The two strings "+s1+" and "+s2+" are not anagrams");
      }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Provide a string");
        String s1= sc.nextLine();
        System.out.println("Provide a string");
        String s2 = sc.nextLine();
        anagramCheck(s1,s2);
    }

}
