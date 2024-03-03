package Java_ExtendingConcept;

public class HSBCBank implements USBank , BrazilBank {

    public void credit(){
        int min_bal = USBank.min_bal;
        System.out.println(min_bal);
        System.out.println("HSBC credit ");
    }
    public void debit(){
        System.out.println("HSBC debit ");
    }
    public void transferMoney(){
        System.out.println("HSBC transferMoney ");
    }
    public void educationLoan(){
        System.out.println("HSBC educationLoan ");
    }
    public void carLoan(){
        System.out.println("HSBC carLoan ");
    }
    
   

    @Override
    public void mutualFunds() {
        System.out.println("HSBC Mutual Funds");
    }
}
