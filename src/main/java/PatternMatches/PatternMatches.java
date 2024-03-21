package PatternMatches;

public class PatternMatches {
    public static void pmatch(String s,String pattern){
        String[] arr = s.split(" ");
        Boolean flag = false;
        int i;
        for(i=0;i<arr.length;i++){
            if(arr[i].contains(pattern) ){
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.println("Pattern is found at" +i); // If u need to print the index at which the pattern is found, then make i a global variable
        }else{
            System.out.println("Pattern not found");
        }
    }



    public static void main(String[] args){
pmatch("Jagrat is a computer wizard","ompu");
    }
}
