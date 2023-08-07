package org.example.Operators;

public class LogicalOperators {
    public static void main(String[] args){
        int temperature = 22;
        boolean isWarm= temperature > 20 && temperature < 30 ;
        System.out.println(isWarm);


        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean isEligible = hasHighIncome || hasGoodCredit ;
        System.out.println(isEligible);


        boolean hasCriminalRecord= false;
        boolean isEligible1 = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        System.out.println(isEligible1);
    }
}
