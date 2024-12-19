package Stack.Easy;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if(!st.isEmpty()) {
                char last = st.peek();
                if(isPair(curr,last)) {
                    st.pop();
                    continue;
                }
            }
            st.push(curr);
        }
        return st.isEmpty();
    }

    private boolean isPair(char curr, char last) {
        return((last == '{' && curr == '}')|| (last == '(' && curr == ')') || (last == '[' && curr == ']'));
    }
}
