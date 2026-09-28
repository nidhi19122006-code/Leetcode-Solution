class Solution {

    public int findInMountainArray(int target, MountainArray mountainArr) {

        int n = mountainArr.length();

        // 1. Find peak
        int left = 0;
        int right = n - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                // We are on increasing side
                left = mid + 1;
            } else {
                // We are on decreasing side
                right = mid;
            }
        }

        int peak = left;

        // 2. Search in increasing part
        int ans = binarySearchIncreasing(
            mountainArr, target, 0, peak
        );

        if (ans != -1) {
            return ans;
        }

        // 3. Search in decreasing part
        return binarySearchDecreasing(
            mountainArr, target, peak + 1, n - 1
        );
    }

    // Increasing array
    private int binarySearchIncreasing(
        MountainArray arr, int target, int left, int right
    ) {

        while (left <= right) {

            int mid = left + (right - left) / 2;
            int value = arr.get(mid);

            if (value == target) {
                return mid;
            } 
            else if (value < target) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }

        return -1;
    }

    // Decreasing array
    private int binarySearchDecreasing(
        MountainArray arr, int target, int left, int right
    ) {

        while (left <= right) {

            int mid = left + (right - left) / 2;
            int value = arr.get(mid);

            if (value == target) {
                return mid;
            } 
            else if (value > target) {
                // In decreasing array, move right
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }

        return -1;
    }
}