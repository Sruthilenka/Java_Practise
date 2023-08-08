package Collections.ThreadSafety;
public class ThreadSafety {
    private static int myInt = 0;
    public static int AddOne(){
        int tmp = myInt;
        tmp= tmp + 1;
        myInt= tmp;
        return tmp;
    }

    public static void main(String[] args) {
      int tmp1 = AddOne();
        System.out.println(tmp1);
    }
}

