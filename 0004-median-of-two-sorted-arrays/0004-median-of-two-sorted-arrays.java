class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1+n2;

        int idx2 = (n1+n2)/2;
        int idx1 = idx2-1;

        int ele1 = -1;
        int ele2 = -1;

        int count = 0;

        int i = 0;
        int j = 0;
        while(i<n1 && j<n2) {
            if(nums1[i]<=nums2[j]) {
                if(count == idx1) ele1 = nums1[i];
                if(count == idx2) ele2 = nums1[i];
                i++;
                count++;
            } else {
                if(count == idx1) ele1 = nums2[j];
                if(count == idx2) ele2 = nums2[j];
                j++;
                count++;
            }
        }
        while(i<n1) {
            if(count == idx1) ele1 = nums1[i];
            if(count == idx2) ele2 = nums1[i];
            i++;
            count++;
        }
        while(j<n2) {
            if(count == idx1) ele1 = nums2[j];
            if(count == idx2) ele2 = nums2[j];
            j++;
            count++;
        }

        if(n%2 != 0) return ele2;
        return (double)(ele1+ele2)/2;
    }
}