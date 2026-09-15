class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        String ans = "";
        for(int i = 0; i < s.length(); i++) {
            if(st.size()==0 && s.charAt(i)=='(') {
                st.push('(');
            } else if(st.size()!=0 && s.charAt(i)=='(') {
                st.push('(');
                ans += '(';
            } else if(st.size()==1 && s.charAt(i)==')') {
                st.pop();
            } else {
                st.pop();
                ans += ')';
            }
        }
        return ans;
    }
}