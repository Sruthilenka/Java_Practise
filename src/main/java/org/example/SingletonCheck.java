package org.example;

public class SingletonCheck {
    public String str;
    private static SingletonCheck singleton_instance = null;

    private SingletonCheck(){
        str = "I am using singleton class constructor";
        System.out.println("I am using singleton class constructor");
    }

    public static SingletonCheck getInstance(){    //getInstance is a static method
        if(singleton_instance == null)
       singleton_instance = new SingletonCheck();
       return singleton_instance;
    }

    public static void main(String[] args){
          SingletonCheck x = getInstance(); // as it is static method can call directly or with class name
          SingletonCheck y = getInstance(); // any other instance will call the first object only
          SingletonCheck z = getInstance();

          x.str = (x.str).toUpperCase();
        System.out.println(x.str);
        System.out.println(y.str); // will refer to X instance only, so will get o/p in uppercase only.
        System.out.println(z.str);


        z.str = (z.str).toLowerCase();
        System.out.println(z.str);
        System.out.println(x.str);
        System.out.println(y.str);
    }

}
