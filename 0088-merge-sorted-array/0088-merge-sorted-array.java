class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m+n];
        int idx = 0;
        int i = 0, j = 0;
        while(i < m && j < n) {
            if(nums1[i]<=nums2[j]) {
                temp[idx++] = nums1[i++];
            } else {
                temp[idx++] = nums2[j++];
            }
        }
        while(i<m) temp[idx++] = nums1[i++];
        while(j<n) temp[idx++] = nums2[j++];
        
        for(i = 0; i < m+n; i++) {
            nums1[i] = temp[i];
        }
    }
}