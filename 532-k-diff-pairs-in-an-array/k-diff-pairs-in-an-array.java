class Solution {
    public int findPairs(int[] nums, int k) {
        // int n = nums.length;
        // int count = 0;

        // for(int i = 0; i < n; i++){
        //     for(int j = i + 1; j < n; j++){
                
        //         int diff = Math.abs(nums[i] - nums[j]);

        //         if(diff == k){
        //             count++;
        //         }
        //     }
        // }

        // return count;
        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;
        int i=0;
        int j=1;

        while(j<n){
            if(i==j){
                j++;
                continue;
            }
            int diff= nums[j]-nums[i];

            if(diff == k){
                count++;
                int left = nums[i];
                int right = nums[j];
                // j++;

        while(i<n && nums[i]==left){
            i++;
        }
        while(j<n && nums[j]==right){
            j++;
        }
    }
        else if(diff<k){
            j++;
        }else{
            i++;
        }
    }
    return count;
    }
}