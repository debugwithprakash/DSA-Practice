class Solution {
    public String reverseWords(String s) {
        String ans = "";

        String revStr = new StringBuilder(s).reverse().toString();

        int i = 0;
        while(i < revStr.length()) {
            String word = "";
            while(i<revStr.length() && revStr.charAt(i)!=' ') {
                word += revStr.charAt(i);
                i++;
            }

            String revWord = new StringBuilder(word).reverse().toString();

            if(revWord.length()>0) {
                ans += ' ' + revWord;
            }

            i++;
        }

        return ans.trim();
    }
}