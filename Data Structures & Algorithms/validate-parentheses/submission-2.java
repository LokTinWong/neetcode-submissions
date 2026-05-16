class Solution {
    public boolean isValid(String s) {
        Stack<Character> openBrackets = new Stack<>();
        
        if (s.length() % 2 != 0) {
            return false;
        } else {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                    openBrackets.push(s.charAt(i));
                } else if (openBrackets.empty()) {
                    return false;
                } else if (s.charAt(i) == ')' && openBrackets.peek() == '(') {
                    openBrackets.pop();
                } else if (s.charAt(i) == '}' && openBrackets.peek() == '{') {
                    openBrackets.pop();
                } else if (s.charAt(i) == ']' && openBrackets.peek() == '[') {
                    openBrackets.pop();
                } else {
                    return false;
                }
            }
        }

        return openBrackets.empty();
    }
}
