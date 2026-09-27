class Solution {
    public int minFreq(int[] freq) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<freq.length; i++) {
            if(freq[i] > 0) {
                min = Math.min(min, freq[i]);
            }
        }
        return min;
    }
    public int maxFreq(int[] freq) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<freq.length; i++) {
            max = Math.max(max, freq[i]);
        }
        return max;
    }
    public int beautySum(String s) {
        int n = s.length();
        int ans = 0;
        for(int i=0; i<n; i++) {
            int[] freq = new int[26];
            for(int j=i; j<n; j++) {
                int idx = s.charAt(j) - 'a';
                freq[idx]++;
                int beauty = maxFreq(freq) - minFreq(freq);
                ans += beauty;
            }
        } 
        return ans;
    }
}