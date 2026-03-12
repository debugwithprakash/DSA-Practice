class Solution 
{
    public boolean isPalindrome(String s) 
    {
        String str = s.toLowerCase();
        str = str.replaceAll("[^0-9a-zA-Z]", "");
        int i = 0, j = str.length()-1;
        while(i<j)
        {
            if(str.charAt(i)!=str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}