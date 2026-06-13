class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] nextSmallerElement = new int[n];
        Stack <Integer> st = new Stack<>();
        nextSmallerElement[n-1] = n;
        st.push(n-1);
        for(int i = n-2; i >= 0; i--) {
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]) st.pop();
            if(st.isEmpty()) nextSmallerElement[i] = n;
            else nextSmallerElement[i] = st.peek();
            st.push(i);
        }

        st = new Stack<>();
        int[] preSmallerElement = new int[n];
        preSmallerElement[0] = -1;
        st.push(0);
        for(int i = 1; i < n; i++) {
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]) st.pop();
            if(st.isEmpty()) preSmallerElement[i] = -1;
            else preSmallerElement[i] = st.peek();
            st.push(i);
        }

        int maxArea = 0;
        for(int i = 0; i < n; i++) {
            int area = heights[i]*(nextSmallerElement[i]-preSmallerElement[i]-1);
            maxArea = Math.max(area, maxArea);
        }

        return maxArea;
    }
}