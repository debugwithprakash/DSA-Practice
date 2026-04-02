class Solution {
    public int search(int[] nums, int target) {
        int st = 0, end = nums.length-1;
        return find(nums, st, end, target);
    }
    public int find(int[] arr, int st, int end, int target) {
        if(st > end) return -1;
        int mid = st+(end-st)/2;
        if(arr[mid] == target) return mid;
        else if(arr[mid] < target) return find(arr, mid+1, end, target);
        return find(arr, st, mid-1, target);
    }
}