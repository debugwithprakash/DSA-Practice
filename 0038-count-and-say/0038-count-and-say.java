class Solution {
    public String countAndSay(int n) {
        if(n == 1) return "1";

        String ansStr = "1";

        for(int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            int j = 0;
            int k = 0;
            while(k < ansStr.length()) {
                if(ansStr.charAt(j) == ansStr.charAt(k)) {
                    k++;
                } else {
                    int size = k-j;
                    sb.append(size);
                    sb.append(ansStr.charAt(j));
                    j = k;
                }
            }
            int size = k-j;
            sb.append(size);
            sb.append(ansStr.charAt(j));
            ansStr = sb.toString();
        }

        return ansStr;
    }
}