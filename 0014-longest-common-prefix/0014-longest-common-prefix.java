class Solution {
    public String longestCommonPrefix(String[] strs) {
        int str1Len = strs[0].length();

        String ans = "";

        for(int i = 0; i < str1Len; i++) {

            char ch = strs[0].charAt(i);

            for(int j = 1; j < strs.length; j++) {
                if(i>=strs[j].length() || ch!=strs[j].charAt(i)) return ans;
            }

            ans += ch;
        }

        return ans;
    }
}