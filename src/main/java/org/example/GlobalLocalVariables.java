package org.example;

public class GlobalLocalVariables {
    String name = "Sruthi";
    int age = 31;
    public static void main(String[] args){
        int age = 10;
        String name = "Gainsight";
        System.out.println("***************");
        System.out.println("First-Local Variable:");
        System.out.println(age);
        System.out.println(name);
      GlobalLocalVariables demo=new GlobalLocalVariables();
      demo.name = "Katty";
      demo.age = 15;
        System.out.println("***************");
        System.out.println("Second-Local Variable:");
        System.out.println(age);
        System.out.println(name);
        System.out.println("***************");
        System.out.println("First- Global Variable:");
        System.out.println(demo.age);
        System.out.println(demo.name);
      demo.test();
    }
    public void test(){
        int age= 22;
        String name ="Kapil Show";
       this.name = "Seagull";
        this.age = 45;
        System.out.println("***************");
        System.out.println("Third- Local Variable");
        System.out.println(age);
        System.out.println(name);
        System.out.println("***************");
        System.out.println("Second- Global Variable:");
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
