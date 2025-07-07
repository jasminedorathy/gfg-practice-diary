class Solution {
    static boolean isBalanced(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')' && (st.isEmpty() || st.pop() != '(')) {
                return false;
            } else if (ch == '}' && (st.isEmpty() || st.pop() != '{')) {
                return false;
            } else if (ch == ']' && (st.isEmpty() || st.pop() != '[')) {
                return false;
            }
        }
        return st.isEmpty();
    }
}
