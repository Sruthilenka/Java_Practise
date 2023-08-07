package org.example.Loops;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = "";
        do {
            System.out.println("Input");
            input =sc.next().toLowerCase();
            System.out.println(input);
        }while(!input.equals("quit"));
    }
}
