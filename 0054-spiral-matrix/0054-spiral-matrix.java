class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> ans = new ArrayList<>();

        int rs = 0, re = m-1;
        int cs = 0, ce = n-1;
        while(rs <= re && cs <= ce) {
            for(int i = cs; i <= ce; i++) {
                ans.add(matrix[rs][i]);
            }
            rs++;
            if(rs > re || cs > ce) break;

            for(int i = rs; i <= re; i++) {
                ans.add(matrix[i][ce]);
            }
            ce--;
            if(rs > re || cs > ce) break;

            for(int i = ce; i >= cs; i--) {
                ans.add(matrix[re][i]);
            }
            re--;
            if(rs > re || cs > ce) break;

            for(int i = re; i >= rs; i--) {
                ans.add(matrix[i][cs]);
            }
            cs++;
        }

        return ans;
    }
}