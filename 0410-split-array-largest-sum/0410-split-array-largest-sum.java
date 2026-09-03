class Solution {

    public int findNoOfStudents(int[] nums, long pages) {
        int students = 1;
        long pagesCount = 0;

        for (int i = 0; i < nums.length; i++) {

            if (pagesCount + nums[i] <= pages) {
                pagesCount += nums[i];
            } else {
                students++;
                pagesCount = nums[i];
            }
        }

        return students;
    }

    public int splitArray(int[] nums, int k) {
        int n = nums.length;

        if (k > n) {
            return -1;
        }

        long low = 0;
        long high = 0;

        for (int pages : nums) {
            low = Math.max(low, pages);
            high += pages;
        }

        while (low <= high) {

            long mid = low + (high - low) / 2;

            int students = findNoOfStudents(nums, mid);

            if (students <= k) {
                // We can allocate within mid pages.
                // Try to find an even smaller answer.
                high = mid - 1;
            } else {
                // Need more students than k.
                // Increase allowed pages.
                low = mid + 1;
            }
        }

        return (int) low;
    }
}