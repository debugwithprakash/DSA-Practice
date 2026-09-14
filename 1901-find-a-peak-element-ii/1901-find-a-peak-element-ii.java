class Solution {

    public int findMaxRowIdx(int[][] mat, int col) {
        int max = Integer.MIN_VALUE;
        int maxRowIdx = -1;
        for(int i = 0; i < mat.length; i++) {
            if(mat[i][col] > max) {
                max = mat[i][col];
                maxRowIdx = i;
            }
        }
        return maxRowIdx;
    }

    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int low = 0;
        int high = m-1;
        while(low<=high) {
            int mid = low+(high-low)/2;

            int maxRowIdx = findMaxRowIdx(mat, mid);

            int left = (mid-1 >= 0) ? mat[maxRowIdx][mid-1] : -1;
            int right = (mid+1 < m) ? mat[maxRowIdx][mid+1] : -1;

            if(left<mat[maxRowIdx][mid] && right<mat[maxRowIdx][mid]) {
                int[] ans = {maxRowIdx, mid};
                return ans;
            } else if(left > mat[maxRowIdx][mid]) {
                // go left
                high = mid-1;
            } else {
                // go right
                low = mid+1;
            }
        }
        int[] ans = {-1,-1};
        return ans;
    }
}