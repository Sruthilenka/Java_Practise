package org.example;

public class CallByValue {
    public static void main(String[] args) {
        CallByValue obj1 = new CallByValue();
        obj1.testSum(5,8); // call by value
        int x = 10;
        int y = 20;
        obj1.testSum(x,y); // call by value because even if we change the value of a and b later in the code, values of x and y wont be affected


    }
    public int testSum(int a,int b){
        int c =a+b;
        return c;
    }
}
