class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int maxLen = 1;
        String ans = "";
        int l = 0;
        int r = 0;
        for(int i = 0; i < n; i++) {
            l = i-1;
            r = i+1;
            while(l>=0 && r<n && s.charAt(l) == s.charAt(r)) {
                l--;
                r++;
            }
            int len = (r-l)-1;
            if(maxLen < len) {
                maxLen = len;
                ans = s.substring(l+1, r);
            }

            l = i;
            r = i+1;
            while(l>=0 && r<n && s.charAt(l) == s.charAt(r)) {
                l--;
                r++;
            }
            len = (r-l)-1;
            if(maxLen < len) {
                maxLen = len;
                ans = s.substring(l+1, r);
            }
    
        }

        if(maxLen == 1) ans = s.substring(0, 1);

        return ans;
    }
}