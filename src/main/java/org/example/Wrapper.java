package org.example;

public class Wrapper {
    public static void main(String[] args) {
        String x = "1";
        int y = Integer.parseInt(x) + 2; // convert String to int
        System.out.println(y);
       //Boolean, Double, Integer

        //if we have to convert int to string
        int i=20;
        String s = String.valueOf(i);
        System.out.println(s+20);


    }
}
