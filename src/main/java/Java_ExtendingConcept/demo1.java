package Java_ExtendingConcept;

public class demo1 {
    static int i=10;
    int p;
    int[] arr2 = new int[2];
    String sub;
    public static void demoMethod(){
        System.out.println(i);
        int p1 = 0; //local var should be initialised
        int[] arr1= new int[2];
       // System.out.println(p1);
     //   System.out.println("Array:"+arr1[0]);
        String s1 = "";
       // System.out.println("String:"+s1);

        demo1 dm = new demo1();
        System.out.println("Value of P"+dm.p);
    }
    public static void main(String[] args){
      //  System.out.println(demo1.i);

        //referring static var with instance of class - is possible
        demo1 obj1= new demo1();
       // System.out.println(obj1.i);
        System.out.println("Value of instance variable"+obj1.p);

        System.out.println("value of array"+obj1.arr2[0]);

        System.out.println("value of string"+obj1.sub);
        //referring static method: - not possible
        demo1.demoMethod();

        //checking wrapper class
        String str= "1";
        int num= Integer.valueOf(str);
    //    System.out.println(num);

    }
}
