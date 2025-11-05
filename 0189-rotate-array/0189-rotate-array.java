class Solution 
{
    public void swap(int[] arr, int i, int j) 
    {
        while(i < j) 
        { 
            int temp = arr[i]; 
            arr[i] = arr[j]; 
            arr[j] = temp; 
            i++;
            j--; 
        }
    } 
    public void rotate(int[] nums, int k) 
    {
        int n = nums.length;
        if(n == 0) return;
        if( n == 1) return;
        if(k > n) k = k % n;
        swap(nums, 0, n-1);
        swap(nums, 0, k-1);
        swap(nums, k, n-1);
    }
}