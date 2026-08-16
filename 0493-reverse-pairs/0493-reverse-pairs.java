class Solution {
    public void merge(int[] a, int[] b, int[] nums) {
        int i = 0;
        int j = 0;
        int idx = 0;
        while(i<a.length && j<b.length) {
            if(a[i] <= b[j]) {
                nums[idx++] = a[i++];
            } else {
                nums[idx++] = b[j++];
            }
        }
        while(i<a.length) nums[idx++] = a[i++];
        while(j<b.length) nums[idx++] = b[j++];
    }
    public int countPairs(int[] a, int[] b) {
        int count = 0;
        int j = 0;
        for(int i = 0; i < a.length; i++) {
            while(j<b.length && (long)a[i]>(long)2*b[j]) {
                j++;
            }
            count += j;
        }
        return count;
    }
    public int mergeSort(int[] nums) {
        int n = nums.length;
        if(n <= 1) return 0;

        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        int idx = 0;
        for(int i = 0; i < n/2; i++) a[i] = nums[idx++];
        for(int i = 0; i < n-n/2; i++) b[i] = nums[idx++];

        int count = 0;

        count += mergeSort(a);
        count += mergeSort(b);

        count += countPairs(a, b);

        merge(a, b, nums);

        return count;
    }
    public int reversePairs(int[] nums) {
        return mergeSort(nums);
    }
}