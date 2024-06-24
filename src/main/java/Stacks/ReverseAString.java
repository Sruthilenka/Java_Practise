package Stacks;

import java.util.Stack;

public class ReverseAString {
/*  pop,push,peek/top,isFull,isEmpty  */
    public static void main(String[] args) {
 String s = "JAVA";
        Stack<Character> stack1 = new Stack<>();
        for(int i=0;i<s.length();i++){
            stack1.push(s.charAt(i));
        }

        System.out.println("Reverse String:");
        while(!stack1.isEmpty()){
            System.out.print(stack1.pop());
        }
    }
}
