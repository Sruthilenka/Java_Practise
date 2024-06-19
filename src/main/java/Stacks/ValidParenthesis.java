package Stacks;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "[{()[]}()]";
        Boolean valid = true;
        Stack<Character> stack1 = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack1.push(')');
            } else if (c == '{') {
                stack1.push('}');
            } else if (c == '[') {
                stack1.push(']');
            } else if (stack1.isEmpty() || stack1.pop() != c) {
                valid= false;

            }
        }
        if(valid){
            System.out.println("Valid");
        }else{
            System.out.println("Not valid");
        }

    }
}