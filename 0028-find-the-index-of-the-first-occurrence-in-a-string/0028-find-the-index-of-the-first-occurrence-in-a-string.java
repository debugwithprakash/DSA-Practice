class Solution {
    public int strStr(String haystack, String needle) {
        int i = 0, j = 0, k = 0;
        int n1 = haystack.length();
        int n2 = needle.length();

        if(n1 < n2) return -1;

        while(i<n1 && j<n1) {
            char ch1 = haystack.charAt(j);
            char ch2 = needle.charAt(k);

            if(ch1 == ch2) {
                j++;
                k++;
                if(k == n2) return i;
            } else {
                j = i+1;
                i = j;
                k = 0;
            }
        }

        return -1;
    }
}