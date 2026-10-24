class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";

        String returnedStr = countAndSay(n-1);

        String newString = "";
        int i = 0;
        int j = 0;
        while(j<returnedStr.length()) {
            if(returnedStr.charAt(i)==returnedStr.charAt(j)) j++;
            else {
                int size = j-i;
                newString += size;
                newString += returnedStr.charAt(i);
                i = j;
            }
        }
        int size = j-i;
        newString += size;
        newString += returnedStr.charAt(i);

        return newString;
    }
}