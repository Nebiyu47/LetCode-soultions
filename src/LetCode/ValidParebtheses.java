package LetCode;

import java.util.Stack;

public class ValidParebtheses {
    public static void main(String[] args) {
        String s ="()[]{}";
        System.out.println(isVaild(s));
    }
    public static boolean isVaild(String s){
        if(s.length()==0){
            return false;
        }
        Stack<Character> stack= new Stack<>();

        for(char c: s.toCharArray()){
            if(c=='{'||c=='('||c=='['){
                stack.push(c);
            }else if(c=='}'&&!stack.isEmpty()||stack.peek()=='{'){
                stack.pop();
            }else if(c==')'&&!stack.isEmpty()&&stack.peek()=='('){
                stack.pop();
            }else if(c==']'&&!stack.isEmpty()&&stack.peek()=='['){
                stack.pop();
            }
        }
        if(stack.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}
