class Solution 
{
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length, n = matrix[0].length;
        int sr = 0, er = m-1, sc = 0, ec = n-1;
        int count = 0;
        while(count < m*n)
        {
            for(int i = sc; i <= ec && count < m*n; i++)
            {
                ans.add(matrix[sr][i]);
                count++;
            }
            sr++;
            for(int i = sr; i <= er && count < m*n; i++)
            {
                ans.add(matrix[i][ec]);
                count++;
            }
            ec--;
            for(int i = ec; i >= sc && count < m*n; i--)
            {
                ans.add(matrix[er][i]);
                count++;
            }
            er--;
            for(int i = er; i >= sr && count < m*n; i--)
            {
                ans.add(matrix[i][sc]);
                count++;
            }
            sc++;
        }
        return ans;
    }
}