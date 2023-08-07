package org.example.BasicConcepts;

public class ParamsAndArgs {
    public static void main(String[] args) {
        String message= "Hello World" + "!!";
        System.out.println(message);
        //here target and replacement are the parameters and the actual values which we passed for these parameters i.e., Hello and Hi are the arguments
        System.out.println(message.replace("Hello","Hi"));
        System.out.println(message);
    }
}
