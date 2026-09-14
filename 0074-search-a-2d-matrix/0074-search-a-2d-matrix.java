class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int nor = matrix.length;
        int noc = matrix[0].length;
        int n = nor*noc;

        int left = 0, right = n-1;
        while(left <= right) {
            int mid = left+(right-left)/2;
            int midRow = mid/noc;
            int midCol = mid%noc;
            if(matrix[midRow][midCol] == target) {
                return true;
            } else if(matrix[midRow][midCol] < target) {
                // go right
                left = mid+1;
            } else {
                // go left
                right = mid-1;
            }
        }
        return false;
    }
}