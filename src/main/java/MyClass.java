import java.util.*;

public class MyClass {
    public static Set<Character> generateCommon(String[] arr){

        if(arr.length ==0){
            return Collections.EMPTY_SET;
        }

        //take first word n place it in a set
        Set<Character> commonChars = new LinkedHashSet<Character>();
        for(char ch: arr[0].toCharArray()){
            commonChars.add(ch);
        }

        //iterate through other elements of array
        for(int i=1;i<arr.length;i++){
            Set<Character> currentChars = new LinkedHashSet<Character>();
            for(char ch:arr[i].toCharArray()){
                currentChars.add(ch);
            }
            commonChars.retainAll(currentChars);
        }

        return commonChars;

    }


    public static void main(String[] args){
        String[] sarr= {"dog","racecar","racecycle"};
        Set<Character> commonChars = generateCommon(sarr);
        for(Character ch: commonChars){
            System.out.println(ch);
        }
    }
}
