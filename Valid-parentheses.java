class Solution {
    public boolean isValid(String s) {
        Stack<Character> obstack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                obstack.push(ch);
            } 
            else if (ch == ')' || ch == '}' || ch == ']') {valid-parentheses
                if (obstack.isEmpty()) {
                    return false;
                }
                char top = obstack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return obstack.isEmpty();
    }


}
