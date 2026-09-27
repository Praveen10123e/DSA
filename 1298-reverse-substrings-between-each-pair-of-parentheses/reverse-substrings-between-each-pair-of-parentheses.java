import java.util.Stack;

class Solution {
    public String reverseParentheses(String s) {
        int n = s.length();
        int[] pair = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else if (s.charAt(i) == ')') {
                int j = stack.pop();
                pair[i] = j;
                pair[j] = i;
            }
        }
        StringBuilder result = new StringBuilder();
        int direction = 1; 

        for (int i = 0; i < n; i += direction) {
            char curr = s.charAt(i);
            if (curr == '(' || curr == ')') {
                i = pair[i];          
                direction = -direction; 
            } else {
                result.append(curr);
            }
        }

        return result.toString();
    }
}
