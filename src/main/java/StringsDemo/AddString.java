package StringsDemo;

public class AddString {
    public static void addFirst(String s,String add){
        s=add+s;
        System.out.println(s);
    }
    public static void addLast(String s,String add){
        s=s+add;
        System.out.println(s);
    }

    public static void addAtSpecificPosition(String s,String add,int position){
       StringBuffer sb = new StringBuffer(s);
       sb.insert(position,add);
        System.out.println(sb);
    }


    public static void addAtSpecificPosition2(String s,String add,int position){
      s=  s.substring(0,position)+add+s.substring(position);
        System.out.println(s);
    }

    public static void main(String[] args){
        addFirst("Sruthi","Gainsight");
        addLast("Sruthi","Gainsight");
        addAtSpecificPosition("Sruthi","Gainsight",3);
        addAtSpecificPosition2("Sruthi","Gainsight",3);
    }
}
