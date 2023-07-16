package ExceptionsDemo;

public class ExceptionsDemo {
    public static void show(){
      sayHello(null);  // Example to show Null pointer Exception
    }
    public static void sayHello(String name)
    {
        System.out.println(name.toUpperCase());
    }
}
