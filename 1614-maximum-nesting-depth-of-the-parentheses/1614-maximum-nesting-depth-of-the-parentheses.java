class Solution {
    public int maxDepth(String s) {
        int n =  s.length();
        int maxOpen = 0;
        int open = 0;

        for(int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(ch == '(') {
                open++;
            } 
            if(ch == ')') {
                open--;
            }
            maxOpen = Math.max(maxOpen, open);
        }

        return maxOpen;
    }
}