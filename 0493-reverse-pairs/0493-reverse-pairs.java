class Solution {
    static int count;
    public int reversePairs(int[] nums) {
        count = 0;
        mergeSort(nums);
        return count;
    }
    public void mergeSort(int[] arr) {
        int n = arr.length;
        if(n == 1) return;

        int[] a = new int[n/2];
        int[] b = new int[n-n/2];

        int idx = 0;
        for(int i = 0; i < a.length; i++) a[i] = arr[idx++];
        for(int i = 0; i < b.length; i++) b[i] = arr[idx++];

        mergeSort(a);
        mergeSort(b);

        reversePairs(a, b);

        merge(a, b, arr);
    }
    public void reversePairs(int[] a, int[] b) {
        int i = 0, j = 0;
        while(i<a.length && j<b.length) {
            if(a[i]>(long)2*b[j]) {
                count += a.length-i;
                j++;
            }
            else {
                i++;
            }
        }
    }
    public void merge(int[] a, int[] b, int[] arr) {
        int i = 0, j = 0, idx = 0;
        while(i<a.length && j<b.length) {
            if(a[i] < b[j]) arr[idx++] = a[i++];
            else arr[idx++] = b[j++];
        }
        while (i<a.length) arr[idx++] = a[i++];
        while (j<b.length) arr[idx++] = b[j++];
    }
}