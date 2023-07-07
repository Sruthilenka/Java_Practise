package org.example;

import java.util.Scanner;

public class ReferenceType_Comparision {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = "";
        while(!input.equals("quit")){
            System.out.println("Input:");
            // with this implementation in every iteration we are gonna create a scanner object, so its recommended to write Scanner class outside the clock
            input =sc.next().toLowerCase();
            System.out.println(input);// to ignore the capitals
        }
    }
}
