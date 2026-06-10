class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        if(n%2 != 0) return false; // if length is odd 
        
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[') { // if ch has opening bracket
                st.push(ch);
            }
            else { // if ch has closing bracket
                if(st.size()==0) return false;
                char top = st.peek();
                if(isCorresponding(top, ch)) st.pop();
                else return false;
            }
        }
        
        return (st.size()==0);
    }
    public boolean isCorresponding(char top, char ch) {
        if(top=='(' && ch==')') return true;
        if(top=='{' && ch=='}') return true;
        if(top=='[' && ch==']') return true;
        
        return false;
    }
}