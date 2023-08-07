package Java_ExtendingConcept;

public class TestBank {
    public static void main(String[] args){

        System.out.println(USBank.min_bal );// As it is static, referring it using the class name and as it is final we cant change its value

        HSBCBank hb = new HSBCBank();
        hb.debit();
        hb.credit();
        hb.transferMoney();
        hb.carLoan();
        hb.educationLoan();


        USBank us = new HSBCBank();
        us.credit();
        us.debit();
        us.transferMoney();
    }
}
