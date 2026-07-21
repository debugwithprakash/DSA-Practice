class Solution {
    public int majorityElement(int[] nums) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < nums.length; i++) {
            if(st.isEmpty()) {
                st.push(nums[i]);
            } else if(st.peek()!=nums[i]) {
                st.pop();
            } else {
                st.push(nums[i]);
            }
        }
        return st.peek();
    }
}