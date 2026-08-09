class Solution {
    public int majorityElement(int[] nums) {
        Stack<Integer> st = new Stack<>();
        for(int ele : nums) {
            if(st.isEmpty()) {
                st.push(ele);
            } else if(st.peek()==ele) {
                st.push(ele);
            } else {
                st.pop();
            }
        }
        return st.pop();
    }
}