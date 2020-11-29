package amazon.oa2020.a423_validParentheses;

import java.util.Stack;

public class Solution {
    protected static final boolean SOLUTION_DONE = true;
    /*
     * @param s: A string
     * @return: whether the string is a valid parentheses
     */
    public boolean isValidParentheses(String s) {
        // write your code here
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            if (c == ')') {
                if (stack.isEmpty() ||stack.pop() != '(') {
                    return false;
                }
            }
            if (c == ']') {
                if (stack.isEmpty() ||stack.pop() != '[') {
                    return false;
                }
            }
            if (c == '}') {
                if (stack.isEmpty() ||stack.pop() != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
