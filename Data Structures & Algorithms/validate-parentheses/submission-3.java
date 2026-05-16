class Solution {
    public boolean isValid(String s) {
        // Runtime: Beats 37.86%
        // Memory: Beats 45.57%
        // It looks so much cleaner than submission-2, but runtime is not as good.
        
        Deque<Character> stack = new ArrayDeque<>();
    
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');  
            } else if (c == '[') {
                stack.push(']');
            } else {
                if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
        }
            return stack.isEmpty();
        }
}
