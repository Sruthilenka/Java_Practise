package Java_Part2Concepts;

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
}
