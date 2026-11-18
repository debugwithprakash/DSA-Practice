class Solution {
    public int[] findLPS(String s) {
        int n = s.length();

        int len = 0;
        int i = 1;
        int[] lps = new int[n];
        while(i < n) {
            if(s.charAt(i)==s.charAt(len)) {
                lps[i] = len+1;
                i++;
                len++;
            } else {
                if(len == 0) {
                    lps[i] = 0;
                    i++;
                } else {
                    len = lps[len-1];
                }
            }
        }

        return lps;
    }
    public String shortestPalindrome(String s) {
        int n = s.length();

        // Make a new String to find prefix palindrome of max length
        String newStr = s + '#' + new StringBuilder(s).reverse().toString();
        
        // Find longest Palindrome Prefix 
        int[] lps = findLPS(newStr);
        int longestPalindromeLength = lps[newStr.length() - 1];

        // Resultant shortest Palindrome
        String nonPalindromicSuffix = s.substring(longestPalindromeLength);
        String reverseOfNonPalindromicSuffix = new StringBuilder(nonPalindromicSuffix).reverse().toString();

        return reverseOfNonPalindromicSuffix + s;
    }
}