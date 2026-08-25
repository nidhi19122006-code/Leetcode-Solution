class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[i].length; j++) {
        //         if (matrix[i][j] == target) {
        //             return true;
        //         }
        //     }
        // }

        // return false;

    //1st Approach
    int l = 0;
    int row = matrix.length;
    int col = matrix[0].length;
    int r= (row*col)-1;
    while(l<=r){
        int mid = l+(r-l)/2;
        // int row = mid/m;
        // int col = mid%m;
        int midValue = matrix[mid/col][mid % col];
        if(midValue == target){
            return true;
        }else if(midValue < target){
            l=mid+1;
        }else{
            r=mid-1;
        }
    }
    return false;

    //2nd Approach
    // inseration position
   
        
    }
}