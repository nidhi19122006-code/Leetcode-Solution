class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            // left neighbor
            if (i > 0 && nums[i] <= nums[i - 1]) {
                continue;
            }

            // right neighbor
            if (i < n - 1 && nums[i] <= nums[i + 1]) {
                continue;
            }

            return i;
        }

        return -1;
    }
}