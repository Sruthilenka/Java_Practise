package Java_ExtendingConcept;

public class Car extends Vehicle{
   /* Car - Parent Class , BMW - Child class , testcar - another class to test these classes working */

    public void start(){
        System.out.println("Car-->Start");
    }
    public void stop(){
        System.out.println("Car-->Stop");
    }
    public void refuel(){
        System.out.println("Car-->Refuel");
    }
    public void main(){
        System.out.println("I am main method");}; //checking if we can use 'main' word for methods as it is not a keyword.
}
