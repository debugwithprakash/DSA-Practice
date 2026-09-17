class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;

        String ans = "";
        Arrays.sort(strs);
        char[] first = strs[0].toCharArray();
        char[] last = strs[n-1].toCharArray();
        for(int i=0; i<first.length; i++) {
            if(first[i] != last[i]) return ans;
            ans += first[i];
        }
        
        return ans;
    }
}