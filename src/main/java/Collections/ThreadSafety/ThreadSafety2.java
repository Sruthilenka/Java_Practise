package Collections.ThreadSafety;

import Collections.ThreadSafety.ThreadSafety;

public class ThreadSafety2 extends ThreadSafety {
    public static void main(String[] args){
        int tmp2 = AddOne();
        System.out.println(tmp2);
    }
    /* If both these methods from thread safety and thread safety2 call the Addon Method at the same time there can be a chance of results being incorrect*/
    //so use Synchronised keyword infront of the method name
}
