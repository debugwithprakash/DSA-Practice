class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int n = heights.length;
        st.push(n-1);

        int[] ans = new int[n];
        ans[n-1] = 0;

        for(int i = n-2; i >= 0; i--) {
            int count = 0;
            
            while(st.size()>0 && heights[i]>heights[st.peek()]) {
                st.pop();
                count++;
            }

            if(st.size()>0) count++;
            ans[i] = count;
            st.push(i);
        }

        return ans;
    }
}