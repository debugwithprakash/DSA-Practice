class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        // push all elements in reverse order
        int n = nums.length;
        for(int i=n-1; i>=0; i--) {
            st.push(nums[i]);
        }

        for(int i=n-1; i>=0; i--) {
            int num = nums[i];
            if(num<st.peek()) {
                nums[i] = st.peek();
                st.push(num);
            }
            else {
                while(st.size()>0 && st.peek()<=num) {
                    st.pop();
                }
                if(st.size()==0) nums[i] = -1;
                else {
                    nums[i] = st.peek();
                }
                st.push(num);
            }
        }

        return nums;
    }
}