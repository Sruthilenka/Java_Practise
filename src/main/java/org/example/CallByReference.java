package org.example;

public class CallByReference {
    int p = 50;
    int q = 60;

    public static void main(String[] args) {

        CallByReference obj1 = new CallByReference();
        System.out.println(obj1.p);
        System.out.println(obj1.q);
         obj1.swap(obj1);
        System.out.println(obj1.p);
        System.out.println(obj1.q);
    }
    public void swap(CallByReference t){  //here obj1 and t are referring to the same p and q
        int temp;
        temp = t.p;
        t.p = t.q;
        t.q = temp;
    }
}
