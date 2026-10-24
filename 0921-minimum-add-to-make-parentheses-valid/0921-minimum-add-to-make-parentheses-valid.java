class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(st.size()==0) {
                st.push(ch);
            }else {
                char peek = st.peek();
                if(peek=='(' && ch==')') {
                    st.pop();
                } else {
                    st.push(ch);
                }
            }
        }
        return st.size();
    }
}