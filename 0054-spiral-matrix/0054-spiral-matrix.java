class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int count = 0;
        int sr = 0, lr = matrix.length-1, sc = 0, lc = matrix[0].length-1;
        while(count < m*n) {
            for(int i = sc; i <= lc; i++) {
                ans.add(matrix[sr][i]);
                count++;
            }
            sr++;
            if(count == m*n) break;
            for(int i = sr; i <= lr; i++) {
                ans.add(matrix[i][lc]);
                count++;
            }
            lc--;
            if(count == m*n) break;
            for(int i = lc; i >= sc; i--) {
                ans.add(matrix[lr][i]);
                count++;
            }
            lr--;
            if(count == m*n) break;
            for(int i = lr; i >= sr; i--) {
                ans.add(matrix[i][sc]);
                count++;
            }
            sc++;
        }
        return ans;
    }
}