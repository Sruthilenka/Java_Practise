package org.example;

import java.util.Scanner;

public class BreakAndContinue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = "";
        while(true){
            System.out.println("Input:");
            // with this implementation in every iteration we are gonna create a scanner object, so its recommended to write Scanner class outside the clock
            input =sc.next().toLowerCase();
            if(input.equals("pass")) // when u want to continue with the next iteration and not jump out of the loop
                continue;
            if(input.equals("quit"))
                break;    // when u want to jump out of the loop at some condition
            System.out.println(input);// to ignore the capitals
        }
    }
}
