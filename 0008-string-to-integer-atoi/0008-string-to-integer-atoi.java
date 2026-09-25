class Solution {
    public int myAtoi(String s) {
        
        long ans = 0;

        s = s.trim();
        int n = s.length();

        int sign = 1;
        int i = 0;

        if(n==0) return 0;

        if(s.charAt(0) == '-') {
            sign = -1;
            i++;
        } else if(s.charAt(0) == '+') {
            i++;
        }

        while(i < n) {
            char ch = s.charAt(i);

            if(ch < '0' || ch > '9') break;

            ans = ans * 10 + (ch-'0');

            if(sign*ans<=Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if(sign*ans>=Integer.MAX_VALUE) return Integer.MAX_VALUE;
            
            i++;
        }

        return (int)ans*sign;
    }
}