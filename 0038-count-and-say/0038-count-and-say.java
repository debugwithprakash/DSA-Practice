class Solution {
    public String countAndSay(int n) {
        if(n == 1) return "1"; // BaseCase
        String s = countAndSay(n-1); // Call
        // Work
        String ans = "";
        int i = 0, j = 0;
        while(j < s.length()) {
            if(s.charAt(i) == s.charAt(j)) j++;
            else {
                ans += j-i;
                ans += s.charAt(i);
                i = j;
            }
        }
        ans += j-i;
        ans += s.charAt(i);

        return ans;
    }
}