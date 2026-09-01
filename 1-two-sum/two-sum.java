class Solution {
    public int[] twoSum(int[] nums, int target) {
        // HashMap <Integer, Integer> map = new HashMap<>();
        // int ans = 0;
        // for(int i=0; i<arr.length; i++){
        //     ans = target-arr[i];
        //         if(map.containsKey(ans)){
        //             return new int[]{map.get(ans),i};
        //         }
        //           map.put(arr[i], i);
        //     }
        //     return new int[]{};

        //O(nlogn)
        //convert 1d array to 2d array
        int n = nums.length;
        int[][] arr = new int[n][2];
       
        for(int k=0; k<n; k++){
            // arr.sort((a,b)=>Integer.Compare(a.get(0),b.get(0)));
            arr[k][0] = nums[k];
            arr[k][1] = k;
            
        }
         Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        int i=0;
        int j = n-1;
        while(i<j){
            int sum = arr[i][0]+arr[j][0];
             if(sum==target){
                    return new int[]{arr[i][1], arr[j][1]};
                }else if(sum<target){
                    i++;
                }else{
                    j--;
                }
            }
        return new int[]{};
        }
               
    }
