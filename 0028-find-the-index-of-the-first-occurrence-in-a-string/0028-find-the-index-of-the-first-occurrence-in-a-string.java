class Solution {
    public int strStr(String haystack, String needle) {
        int n1 = haystack.length();
        int n2 = needle.length();

        for(int i = 0; i <= n1-n2; i++) {
            int j = 0;
            while(j < n2) {
                char c1 = haystack.charAt(i+j);
                char c2 = needle.charAt(j);

                if(c1 == c2) {
                    j++;
                } else {
                    break;
                }

                if(j == needle.length()) return i;
            }
        }
        return -1;
    }
}