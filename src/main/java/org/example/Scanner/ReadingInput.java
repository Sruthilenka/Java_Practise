package org.example.Scanner;

import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Please enter your age");
        byte age = sc.nextByte();
        System.out.println("You are " +age); // here implicit casting happens and byte(age) would be converted to String
        System.out.print("Please enter your name");
        //String name = sc.next();
        String name = sc.nextLine();
        System.out.println("Your name is " +name ); // here if we give space between words only the first word would be considered as each time we call next method it takes only one token.
        //So we use nextLine()

    }
}
