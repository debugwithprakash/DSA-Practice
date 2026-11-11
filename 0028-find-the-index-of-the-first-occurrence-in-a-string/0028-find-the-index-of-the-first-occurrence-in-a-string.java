class Solution {
    public int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();

        if(m < n) return -1;

        // Make lps array
        int[] lps = new int[n];
        int len = 0;
        int i = 1;
        while(i < n) {
            if(needle.charAt(len) == needle.charAt(i)) {
                lps[i] = len+1;
                i++;
                len++;
            } else {
                if(len == 0) {
                    i++;
                } else {
                    len = lps[len-1];
                }
            }
        }

        // KMP algo
        i = 0;
        int j = 0;
        while(i < m) {
            if(haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
                if(j == n) return (i-j);
            } else {
                if(j == 0) {
                    i++;
                } else {
                    j = lps[j-1];
                }
            }
        }

        return -1;
    }
}