package org.example;

public class TernaryOperator {
    public static void main(String[] args) {
        int income = 120_100;
        boolean rich = (income>= 120000);
        System.out.println(rich);

        //What if we are not dealing with boolean variable
        String className= income>100000 ? "First" : "Economy";
        System.out.println(className);

    }
}
