class Solution 
{
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        int totalRow = matrix.length, totalCol = matrix[0].length;
        int i = 0, j = totalCol-1;
        while(i<totalRow && j>=0)
        {
            if(matrix[i][j] == target) return true;
            else if(matrix[i][j] < target) i++;
            else j--;
        }
        return false;
    }
}