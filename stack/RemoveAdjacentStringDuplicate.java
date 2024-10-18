package stack;

import java.util.Stack;

public class RemoveAdjacentStringDuplicate {
    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()) {
            if(!stack.empty() && stack.peek() == c) stack.pop();
            else stack.push(c);
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.empty()) {
            sb.append(stack.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}
