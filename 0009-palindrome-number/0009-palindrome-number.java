class Solution {
    public boolean isPalindrome(int x) {
        int dummyN = x;
        int reversedNo = 0;
        while(x > 0) {
            int lastDigit = x % 10;
            reversedNo = (reversedNo*10) + lastDigit;
            x /= 10;
        }
        return (reversedNo == dummyN);
    }
}