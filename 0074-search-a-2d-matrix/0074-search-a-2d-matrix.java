class Solution 
{
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        int nor = matrix.length;
        int noc = matrix[0].length;
        int totalSize = nor*noc;
        int st = 0, end = totalSize-1;
        while(st<=end)
        {
            int mid = st+(end-st)/2;
            int rowMid = mid/noc;
            int colMid = mid%noc;
            if(matrix[rowMid][colMid]==target) return true;
            else if(matrix[rowMid][colMid]<target) st = mid+1;
            else end = mid-1;
        }
        return false;
    }
}