class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        // Creating two Arrays and filling them by 1
        int[] row = new int[n];
        int[] col = new int[m];
        Arrays.fill(row, 1);
        Arrays.fill(col, 1);

        // Marking in row and column arrays
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == 0) {
                    row[j] = 0;
                    col[i] = 0;
                }
            }
        }
        
        // Seting Zeroes in Matrix
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] != 0) {
                    if(row[j] == 0 || col[i] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }
    }
}