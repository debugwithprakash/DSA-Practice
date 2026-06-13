class Solution {
    public int maximalRectangle(char[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        // char to int
        int[][] mat = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                mat[i][j] = matrix[i][j]-'0';
            }
        }
        // Finding Prefix sum
        for(int i = 1; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(mat[i][j]==1) mat[i][j] += mat[i-1][j];
            }
        }
        // send rows one by one
        int maxRectangle = 0;
        for(int[] row : mat) {
            int area = getMaxArea(row);
            maxRectangle = Math.max(maxRectangle, area);
        }
        
        return maxRectangle;
    }
    public static int getMaxArea(int arr[]) {
        // code here
        int n = arr.length;
        int[] nextSmallerElement = new int[n];
        Stack <Integer> st = new Stack<>();
        nextSmallerElement[n-1] = n;
        st.push(n-1);
        for(int i = n-2; i >= 0; i--) {
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]) st.pop();
            if(st.isEmpty()) nextSmallerElement[i] = n;
            else nextSmallerElement[i] = st.peek();
            st.push(i);
        }

        st = new Stack<>();
        int[] preSmallerElement = new int[n];
        preSmallerElement[0] = -1;
        st.push(0);
        for(int i = 1; i < n; i++) {
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]) st.pop();
            if(st.isEmpty()) preSmallerElement[i] = -1;
            else preSmallerElement[i] = st.peek();
            st.push(i);
        }

        int maxArea = 0;
        for(int i = 0; i < n; i++) {
            int area = arr[i]*(nextSmallerElement[i]-preSmallerElement[i]-1);
            maxArea = Math.max(area, maxArea);
        }

        return maxArea;
    }
}