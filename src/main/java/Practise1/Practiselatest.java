package Practise1;

import java.util.Arrays;

public class Practiselatest {
    //Anagram
    public static void ana(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Boolean b = true;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1.length != arr2.length) {
                b = false;
                break;
            } else if (arr1[i] != arr2[i]) {
                b = false;
                break;
            }

        }
        if (b) {
            System.out.println("Anagram");
        } else {
            System.out.println("not Anagram");
        }

    }


    public static void ana2(String s1, String s2) {
        s1.toLowerCase();
        s2.toLowerCase();
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }

    }

    public static String reverse(String s) {
        char[] ch = s.toCharArray();
        String s1 = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            s1 = s1 + ch[i];
        }
        return s1;
    }

    public static void palindromecheck(String s) {
        s.toLowerCase();
        String s1 = reverse(s);
        s1.toLowerCase();
        System.out.println(s);
        System.out.println(s1);
        if (s.equals(s1)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static void removeWord(String s,String s1){
        String[] arr = s.split(" ");
        String temp="";
        for(int i=0;i< arr.length;i++){
            if(!arr[i].equalsIgnoreCase(s1)){
                temp=temp+arr[i]+" ";
            }
        }
        System.out.println(temp);
    }






    public static void main(String[] args) {

        // ana("STRU", "SRUT");
        //  ana2("STRU", "SRUTu");
       // palindromecheck("Niti1n");
        removeWord("Sruthi is a good girl","good");
    }
}
