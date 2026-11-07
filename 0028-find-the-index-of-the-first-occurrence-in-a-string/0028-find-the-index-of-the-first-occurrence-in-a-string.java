class Solution {
    public int strStr(String haystack, String needle) {
        int n1 = haystack.length();
        int n2 = needle.length();
        for(int i = 0; i <= (n1-n2); i++) {
            for(int j = 0; j < n2; j++) {
                char ch1 = haystack.charAt(i+j);
                char ch2 = needle.charAt(j);
                if(ch1 != ch2) break;

                if(j == n2-1) return i;
            }
        }

        return -1;
    }
}