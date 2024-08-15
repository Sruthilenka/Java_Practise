package Factorial;

public class Factorial {
    public static void main(String[] args) {
        int num =10;
        generateFactorial(num);
       // int fact = factorial(10);
      //  System.out.println(fact);
    }
   public static void generateFactorial(int num){
        System.out.println(factorial(num));
    }
    public static int factorial(int n){

       if(n<0) {
           throw new IllegalArgumentException("Factorial is not defined");
       }if(n==0||n==1){
           return 1;
        }
       else{
           return n * factorial(n-1);
       }
    }
}
