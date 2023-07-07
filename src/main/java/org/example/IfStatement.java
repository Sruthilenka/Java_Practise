package org.example;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        System.out.println("please enter today's temperature");
        int temp= sc.nextInt();
        if(temp > 30) {
         System.out.println("It's a hot day.");
         System.out.println("Dirnk plenty of water");
     } else if (temp > 20 && temp <= 30)
         System.out.println("Beautiful Day");
     else System.out.println("Cold day");
    }
}
