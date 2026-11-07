class Solution {
    public int strStr(String haystack, String needle) {
        int len1 = haystack.length();
        int len2 = needle.length();

        if(len1 < len2) return -1;

        int[] arr = new int[len2];
        int i = 0, j = 1;
        while(j < len2) {
            if(needle.charAt(i) == needle.charAt(j)) {
                arr[j] = i+1;
                j++;
                i++;
            } else {
                if(i == 0) {
                    arr[j] = 0;
                    j++;
                } else {
                    i = arr[i-1];
                }
            }
        }

        i = 0;
        j = 0;
        while(i < len1) {
            if(haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
                if(j==len2) return (i-j);
            } else {
                if(j != 0) j = arr[j-1];
                else i++;
            }
        }

        return -1;
    }
}