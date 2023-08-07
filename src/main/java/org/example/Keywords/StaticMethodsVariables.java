package org.example.Keywords;

public class StaticMethodsVariables {
    static int age = 25;
    public static void main(String[] args) {
        //call static method directly
        sum();
        System.out.println(age);

        //calling with the classname
        StaticMethodsVariables.sum();
        System.out.println(StaticMethodsVariables.age);
    }
    public static void sum(){
        System.out.println("Sum method:");
    }
}
