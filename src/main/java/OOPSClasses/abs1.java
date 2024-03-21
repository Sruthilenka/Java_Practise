package OOPSClasses;

public class abs1 extends abstraction{
    public static void main(String[] args){
        abs1 obj = new abs1();
        obj.display();
        obj.display1();
    }

    @Override
    void display1() {
        System.out.println("Display 1");
    }
}
