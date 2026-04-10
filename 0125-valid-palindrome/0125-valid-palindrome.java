class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length()-1;
        while(i < j) {
            int currLeft = s.charAt(i);
            int currRight = s.charAt(j);
            if(!Character.isLetterOrDigit(currLeft)) i++;
            else if(!Character.isLetterOrDigit(currRight)) j--;
            else {
                if(Character.toLowerCase(currLeft) != Character.toLowerCase(currRight))
                    return false;
                i++;
                j--;
            }
        }
        return true;
    }
}