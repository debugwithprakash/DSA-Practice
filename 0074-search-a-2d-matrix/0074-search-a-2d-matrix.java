class Solution 
{
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        int totalRow = matrix.length;
        int totalCol = matrix[0].length;
        int st = 0, end = (totalRow*totalCol)-1;
        while(st <= end)
        {
            int mid = st+(end-st)/2;
            int midRow = mid/totalCol;
            int midCol = mid%totalCol;
            if(matrix[midRow][midCol] == target) return true;
            else if(matrix[midRow][midCol] < target) st = mid+1;
            else end = mid-1;
        }
        return false;
    }
}