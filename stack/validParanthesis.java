package stack;

import java.util.Stack;

public class validParanthesis {
    
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(char ch : s.toCharArray()) {
            if(ch == '{' || ch == '(' || ch == '[') 
                stack.push(ch);
            
            else if(ch == '}' || ch == ')' || ch == ']') {
                if(stack.isEmpty())
                    return false;
                
                char top = stack.pop();
                if(ch == '}' && top != '{' || ch == ')' && top != '(' || ch == ']' && top != '[')
                    return false;
            }
        }
        if(stack.isEmpty()) 
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isValid("({{{{}}}))"));
    }
}
