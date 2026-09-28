class Solution {

    public boolean isPossible(int[] ranks, int cars, long time) {

        long total = 0;

        for (int rank : ranks) {

            total += (long) Math.sqrt(time / rank);

            if (total >= cars) {
                return true;
            }
        }

        return false;
    }

    public long repairCars(int[] ranks, int cars) {

        long left = 0;

        long right = (long) ranks[0] * cars * cars;

        while (left < right) {

            long mid = left + (right - left) / 2;

            if (isPossible(ranks, cars, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}