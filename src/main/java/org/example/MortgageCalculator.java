package org.example;

public class MortgageCalculator {
    public static void main(String[] args){
        double prinicipal = 100000;
        float annualInterestRate = 3.92f;
        int timePeriod = 30;
        int numberOfPayments = 30*12;
        float monthlyInterestRate = annualInterestRate/100 / 12;
        double rate = Math.pow((1+monthlyInterestRate),numberOfPayments);
        double numerator = monthlyInterestRate * rate;
        double denominator = rate - 1;


        double mortgage = prinicipal* (numerator/denominator) ;
        System.out.println("mortgage "+mortgage);


}
}
