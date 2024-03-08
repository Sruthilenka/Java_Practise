package Collections.ArrayList2;

import java.util.ArrayList;
import java.util.Iterator;

public class iteratingAL {
    public static void main(String[] args){
        ArrayList<String> students = new ArrayList<String>();
        students.add("Sruthi");
         students.add("Lenka");
        ArrayList<String> studentslist2 = new ArrayList<String>();
        studentslist2.addAll(students);
        System.out.println(studentslist2);

        //for loop iteration
        for(int i=0;i<studentslist2.size();i++){
            System.out.println(students.get(i));
        }


        //for each loop
        for(String s:studentslist2){
            System.out.println(s);

            //streams with lambda
            students.stream().forEach(ele-> System.out.println(ele));

            //using iterator
            Iterator<String> it= students.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
        }
    }
}
