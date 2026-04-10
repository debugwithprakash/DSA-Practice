class Solution {
    public boolean detectCapitalUse(String word) {
        int count = 0, len = word.length();
        for(int i = 0; i < len; i++) {
            if(Character.isUpperCase(word.charAt(i))) count++;
        }
        return count == len || count == 0 || (count == 1 && Character.isUpperCase(word.charAt(0)));
    }
}