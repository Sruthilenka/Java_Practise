package org.example.NumFormat;
import java.text.NumberFormat;
public class NumFormat {
    public static void main(String[] args) {
    NumberFormat currency = NumberFormat.getCurrencyInstance(); // NumberFormat- Abstract class, getCurrencyInstance - factory method whose return type is Numbrfactoryobject
    String result = currency.format(123456.789); // so using that object to access the methods and the return type of this method is string , so saving it in String variable
        System.out.println(result);

       //method Chaining:
       String result1 = NumberFormat.getPercentInstance().format(0.01) ;
        System.out.println(result1);

    }
}
