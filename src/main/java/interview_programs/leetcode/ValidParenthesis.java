package interview_programs.leetcode;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "()[]{}";  // Example input
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);  // Push opening brackets onto the stack
            } else {
                if (stack.isEmpty()) {
                    System.out.println(false);  // No matching open bracket
                    return;
                }
                char top = stack.pop();

                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    System.out.println(false);  // Mismatched brackets
                    return;
                }
            }
        }

        System.out.println(stack.isEmpty());  // Should be true if valid
    }
}

