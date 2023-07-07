package org.example;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter your role");
        String role = sc.next();
        switch(role){
            case "Admin":
                System.out.println("Yu are an Admin");
                break;
            case "User":
                System.out.println("Yu are a User");
                break;
            default:
                System.out.println("You are a guest");

        }
    }
}

