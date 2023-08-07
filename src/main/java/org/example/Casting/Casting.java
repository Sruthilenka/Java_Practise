package org.example.Casting;

public class Casting {
    public static void main(String[] args) {
        //Implicit Casting
        short x = 1;
        int y = x+1;
        System.out.println(y);

        // byte > short > int >  long > float > double
        double a=1.1;
        double b= a+2;
        System.out.println(b);

        //Explicit Casting
        double c = 1.1;
        int d = (int) (c+2);
        System.out.println(d);
    }
}
