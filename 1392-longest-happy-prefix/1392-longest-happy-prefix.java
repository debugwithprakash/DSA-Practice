class Solution {
    public String longestPrefix(String s) {
        int n = s.length();

        int len = 0;
        int i = 1;
        int[] lps = new int[n];
        while(i < n) {
            if(s.charAt(len) == s.charAt(i)) {
                lps[i] = len+1;
                len++;
                i++;
            } else {
                if(len == 0) {
                    lps[i] = 0;
                    i++;
                } else {
                    len = lps[len-1];
                }
            }
        }

        return s.substring(0, lps[n-1]);
    }
}