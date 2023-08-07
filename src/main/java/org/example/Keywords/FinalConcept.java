package org.example.Keywords;

public class FinalConcept {
    public static void main(String[] args) {
        int i = 10;
        final String name = "Constant"; //Cant change the final variable
      // name= "Change_me";
        i = 20;
        i = 30;
        System.out.println(i);
        System.out.println(name);
    }
}
