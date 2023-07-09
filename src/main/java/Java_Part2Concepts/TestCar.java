package Java_Part2Concepts;

public class TestCar {
    public static void main(String[] args){
      BMW b = new BMW(); // As BMW class is defined as public
        b.start(); // preference would be given to the child class's start method as child class has already overridden the method
        b.stop();
        b.refuel();
        b.theftSafety();
        b.engine();   //vehicle class's method
        //Runtime polymorphism
        Car c1 = new BMW(); // This is also called top-casting
        c1.start(); //here always child class method will be accessible
        c1.stop(); // taken from parent's class
        c1.refuel();
       // c1.theftsafety(); -- cant access theft safety method as it belong to only child class.
       //Similarly for downcasting:
       BMW b1 = (BMW)new Car();  // throws exception

    }
}
