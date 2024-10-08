package org.example.Constructor;

public class ConstructorConcept {

    public ConstructorConcept(){
        System.out.println("Default Constructor");
    }

    public ConstructorConcept(int i){
        System.out.println("Single param Constructor");
        System.out.println("The value of i " +i);
    }

    public ConstructorConcept(int i,int j){         //Constructor Overloading
        System.out.println("Two params Constructor");
        System.out.println("The value of i " +i);
        System.out.println("The value of j  " +j);
    }
    public static void main(String[] args){
        ConstructorConcept obj = new ConstructorConcept();
        ConstructorConcept obj1 = new ConstructorConcept(10);
        ConstructorConcept obj2 = new ConstructorConcept(10,20);
    }
}
