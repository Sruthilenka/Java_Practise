package org.example.Keywords;

public class SupKeySubClass extends SuperKeyword{
    String name ="SubClass";
    void print(){
        System.out.println("Printing from Subclass");
        super.print();
        System.out.println("Accessing superclass variable: "+super.name);
    }

}
