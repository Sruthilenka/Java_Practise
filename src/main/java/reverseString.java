public class reverseString {

    //Input : Sruthi Lenka Tester
    //Output : ithurS akneL retseT
    public static void reverseCurrentString(String s){
       String[] arr = s.split(" ");
       String s3="";
      for(int i=0;i<arr.length;i++){
         String s2= reverse(arr[i]);
         s3=s3+s2+" ";
      }
        System.out.println(s3);
    }

    public static String reverse(String s1){

       String rev="";
       for(int i=s1.length()-1;i>=0;i--){
           rev= rev+ s1.charAt(i);
       }
       return rev;
    }

    public static void main(String[] args){
        String inputString= "Sruthi Lenka Tester";
        reverseCurrentString(inputString);
    }
}
