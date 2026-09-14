class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int nor = matrix.length;
        int noc = matrix[0].length;

        int row = 0;
        int col = noc-1;
        while(row<nor && col>=0) {
            if(matrix[row][col] == target) {
                return true;
            } else if(target < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
}