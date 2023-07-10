package org.example;

public class ConstructorWithThisKeyword {
    String name;
    int age;
    public ConstructorWithThisKeyword(String name, int age){
        this.name = name;
        this.age = age;    //whatever values we passed while creating class instance are being set to the global variables using This keyword
        System.out.println("Name "+name+" Age "+age);
    }
    public static void main(String[] args){
        ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Sruthi",31); // So with this statement whatever values I am passing here will be iniated to name and age variable in the constructor but not to the global variables declared.

        obj.name= "Gainsight";
        System.out.println("Name:" +obj.name);
    }

}
