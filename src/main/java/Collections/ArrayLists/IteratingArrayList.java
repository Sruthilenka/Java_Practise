package Collections.ArrayLists;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratingArrayList {
    public static void main(String[] args){
        ArrayList<String> studentList = new ArrayList<String>();
        studentList.add("Sruthi"); //0
        studentList.add("Urvi");  //1
        studentList.add("Sri");  //2
        studentList.add("ArrayList"); //3

        //typical for loop
        for(int i=0; i< studentList.size(); i++){
            System.out.println(studentList.get(i));
        }

        System.out.println("*********************************");
        //for each loop
        for(String s:studentList){
            System.out.println(s);
        }

        System.out.println("*********************************");
        //using streams method with Lambda function
        studentList.stream().forEach(ele-> System.out.println(ele));


        System.out.println("*********************************");
        //iterator
       Iterator<String> it = studentList.iterator();
       while(it.hasNext()){
           System.out.println(it.next());
       }




    }
}
