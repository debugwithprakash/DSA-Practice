class Solution {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length-1;
        helper(s, i, j);
    }
    public void helper(char[] s, int i, int j) {
        if(i >= j) return;
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        helper(s, i+1, j-1);
    }
}