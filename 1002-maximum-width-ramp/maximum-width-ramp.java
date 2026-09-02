class Solution {
    public int maxWidthRamp(int[] nums) {
        // int max = 0;
       int[][] arr = new int[nums.length][2];

    for (int i = 0; i < nums.length; i++) {
        arr[i][0] = nums[i];
        arr[i][1] = i;      
        }
    Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
    int minIndex = nums.length;
    int maxWidth = 0;

    for(int i=0; i<nums.length; i++){
        minIndex = Math.min(minIndex, arr[i][1]);
        maxWidth = Math.max(maxWidth, arr[i][1]-minIndex);
    }
     return maxWidth;
    }
}