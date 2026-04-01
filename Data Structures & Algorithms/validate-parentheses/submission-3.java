class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '[' || ch == '{' || ch == '(') {
                st.push(ch);
            }
            else {
                if (st.isEmpty()) return false;
                char curr = st.pop();
                if (ch == ']' && curr != '[') return false;
                else if (ch == '}' && curr != '{') return false;
                else if (ch == ')' && curr != '(') return false;
            }
        }
        return st.isEmpty();
    }
}
