package Practise1;


import java.util.Arrays;

import static Practise1.Palindrome.palcheck;

public class AnagramPractise {
    //ip->s1- abcd s2 - bcda
   public static void anacheck(String s1,String s2){
      if(s1.length()!=s2.length()){
          System.out.println("they are not anagrams");
      }
      else{
          s1=s1.toLowerCase();
          s2=s2.toLowerCase();
        char[] ch1= s1.toCharArray();
        char[] ch2= s2.toCharArray();
          Arrays.sort(ch1);
          Arrays.sort(ch2);
          if(Arrays.equals(ch1,ch2)){
              System.out.println("They are Anagrams");
          }
          else{
              System.out.println("they are not anagrams");
          }

      }

   }


   public static void main(String[] args){
      // anacheck("Sruthi","ihtrus");
       palcheck("10012"); //just checking if I can call method from different package through importing

    }
}
