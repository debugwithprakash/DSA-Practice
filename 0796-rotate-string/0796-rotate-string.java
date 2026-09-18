class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) {
            return false;
        }

        for(int i=0; i<s.length(); i++) {
            String prefixStr = s.substring(0, i);
            String sufixStr = s.substring(i); 
            // if(i == s.length()-1) sufixStr = "";
        
            String completeNewStr = sufixStr + prefixStr;

            if(completeNewStr.equals(goal)) {
                return true;
            }
        }

        return false;
    }
}