package org.example.SwitchStatement;

import java.util.Scanner;

public class SwitchStatementexercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number");
        int number = sc.nextInt();
        if (number % 5 == 0 && number % 3 == 0) // If we place this statement at the end then if the num is divided by 5 or 3 next condiiton wouldnt be checked
            System.out.println("FIZZBUZZ");
        else  if (number % 5 == 0)
            System.out.println("FIZZ");
        else if (number % 3 == 0)
            System.out.println("BUZZ");
        else
            System.out.println(number);


        //But few argue statements shouldnt be repeated, so can opt nested if
      /*  if (number % 5 == 0){
            if (number % 3 == 0)
                System.out.println("FIZZBUZZ");
            else
                System.out.println("FIZZ");
        }
        else if (number % 3 == 0)
            System.out.println("BUZZ");
        else
            System.out.println(number); */


        //But nested ifs may make code hard to read and understand.so earlier solution is better

    }
}
