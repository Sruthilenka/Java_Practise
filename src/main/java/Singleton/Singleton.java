package Singleton;


public class Singleton {
    //private variable of class type
    private static Singleton instance;

    //private Constructor
    private Singleton() {

    }

    //public method to generate instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;

     /*   if(instance==null){
            synchronized (Singleton.class){
                if(instance==null){
                    instance= new Singleton();
                }
            }
        }*/
    }


}

