package testpackage;
import java.util.*;

public class testclass {

    public static void main(String[] args){
        String str = "I AM WORKING IN CNX";

        String[] s = str.split(" ");

        String up1 = "";

        for (String s1 : s) {
            String up = ""; // Reset up for each word
            for (int i = s1.length() - 1; i >= 0; i--) {
                up = up + s1.charAt(i);
            }
            up1 = up1 + up + " "; // Append reversed word to up1
        }
        System.out.println(up1.trim());


        String a = "CNX";
        String b = "CNX";

        String c = new String ("CNX");

        if(a==b){
            System.out.println("a==b");
        }if(b==c){
            System.out.println("b==c");
        }if(a.equals(b)){
            System.out.println("a. equals b");
        }if(a.equals(c)){
            System.out.println("a . equals c");
        }

    }




    }

