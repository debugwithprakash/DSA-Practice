class Solution {
    public int[] makeLps(String str, String pattern) {
        int m = str.length();
        int n = pattern.length();

        int[] lps = new int[n];
        int len = 0;
        int i = 1;
        while(i < n) {
            if(pattern.charAt(len) == pattern.charAt(i)) {
                lps[i] = len+1;
                i++;
                len++;
            } else {
                if(len == 0) i++;
                else {
                    len = lps[len-1];
                }
            }
        }
        return lps;
    }
    public int kmp(String str, String pattern) {
        int m = str.length();
        int n = pattern.length();

        // Make lps array
        int[] lps = makeLps(str, pattern);

        // KMP logic
        int i = 0;
        int j = 0;
        while(i < m) {
            if(str.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
                if(j >= n) return i-j;
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
    public int repeatedStringMatch(String a, String b) {
        int m = a.length();
        int n = b.length();

        Boolean isFirstCharacterExists = false;
        for(int i = 0; i < m; i++) {
            if(b.charAt(0) == a.charAt(i)) {
                isFirstCharacterExists = true;
                break;
            }
        }
        if(!isFirstCharacterExists) return -1;

        // Making a
        int requiredRepeats = (int)Math.ceil((double)(n-1)/m);
        String originalA = a;
        for(int i = 0; i < requiredRepeats; i++) {
            a += originalA;
        }

        // Calling KMP
        int startingIdx = kmp(a, b);

        // Return total repeatations
        if(startingIdx == -1) return -1;
        return (int)Math.ceil((double)(startingIdx + n)/m);
    }
}