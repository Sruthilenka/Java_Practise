package org.example;

public class Increment {
    public static void main(String[] args) {
        int x = 1;
        int y = x++; //here first y will be assigned the value of x then x will be incremented.
        System.out.println(x);
        System.out.println(y);

        int z = 1;
        int a = ++z; // first z will be incremented then assigned to a
        System.out.println(z);
        System.out.println(a);

    }
}
