class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        return helper(s, start, end);
    }
    public boolean helper(String s, int start, int end) {
        if(start >= end) return true;
        if(!Character.isLetterOrDigit(s.charAt(start))) {
            start++;
        } else if(!Character.isLetterOrDigit(s.charAt(end))) {
            end--;
        } else {
            if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) return false;
            start++;
            end--;
        }
        return helper(s, start, end);
    }
}