package OOPSClasses;

public class Pig implements Animal{
    @Override
    public void animalSound() {
        System.out.println("Animal Sound Oink");
    }

    @Override
    public void sleep() {
        System.out.println("Pig is Sleeping");
    }

    public void myownMethod(){
        System.out.println("This is child class method");
    }

    public static void main(String[] args) {
        Pig p = new Pig();
        p.animalSound();
        p.sleep();
        p.myownMethod();


        Animal an= new Pig();
        an.animalSound();
        an.sleep();
    }
}
