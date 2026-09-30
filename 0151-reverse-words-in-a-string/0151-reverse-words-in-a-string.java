class Solution {
    public String reverseWords(String s) {
        String ans = "";
        String revStr = new StringBuilder(s).reverse().toString();

        for(int i = 0; i < revStr.length(); i++) {
            // Find word
            String word = "";
            while(i<revStr.length() && revStr.charAt(i) != ' ') {
                word += revStr.charAt(i);
                i++;
            }
            // Reverse word
            String revWord = new StringBuilder(word).reverse().toString();
            // Add reversed word in ans
            if(word.length() > 0) ans += " " + revWord;
        }

        return ans.substring(1);
    }
}