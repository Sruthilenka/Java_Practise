package org.example.Overloading;

public class Methodoverloading {
    public static void main(String[] args) {
     Methodoverloading mo = new Methodoverloading();
     mo.sum();
     mo.sum(2);
     mo.sum(3,5);
    }

    //method overloading is same mthod name, different numb of arguments within same class
    public void sum(){
        System.out.println("Sum Method-->zero params");
    }

    public void sum(int param1){
        System.out.println("Sum Method-->one param");
    }
    int param2,param3;
    public void sum(int param3,int param2){
        System.out.println("Sum Method-->two params");
    }
}
