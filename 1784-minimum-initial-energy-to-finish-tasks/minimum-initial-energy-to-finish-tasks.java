class Solution {
    public boolean isPossible(int[][] tasks, int energy){
        Arrays.sort(tasks, (a,b)-> (b[1]-b[0])-(a[1]-a[0]));

        for(int[] task:tasks){
            int actual = task[0];
            int minimum = task[1];

         if(energy < minimum){
            return false;
        }
        energy -= actual;
        }
        return true;
    }
    public int minimumEffort(int[][] tasks) {
        int left = 0, right = 0;
        for (int[] task : tasks) {
            right += task[0];
            right = Math.max(right, task[1]);
        }

        int answer = right;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (isPossible(tasks, mid)) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return answer;
    }
}