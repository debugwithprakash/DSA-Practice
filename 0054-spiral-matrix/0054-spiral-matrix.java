class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        List<Integer> ans = new ArrayList<>();

        int cs = 0, ce = columns-1;
        int rs = 0, re = rows-1;
        while(rs<=re && cs<=ce) {
            for(int i = cs; i <= ce; i++) {
                ans.add(matrix[rs][i]);
            }
            rs++;
            if(rs>re || cs>ce) break;

            for(int i = rs; i <= re; i++) {
                ans.add(matrix[i][ce]);
            }
            ce--;
            if(rs>re || cs>ce) break;

            for(int i = ce; i >= cs; i--) {
                ans.add(matrix[re][i]);
            }
            re--;
            if(rs>re || cs>ce) break;

            for(int i = re; i >= rs; i--) {
                ans.add(matrix[i][cs]);
            }
            cs++;
        }

        return ans;
    }
}