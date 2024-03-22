package Singleton;

import static com.sun.javafx.image.impl.IntArgb.ToIntArgbPreConv.instance;

public class SingletonImp {

        private static SingletonImp var;

        private SingletonImp(){

        };
public static SingletonImp getInstance(){
    if(instance== null){
        instance= new SingletonImp();
    }
    return instance;
}

    }

