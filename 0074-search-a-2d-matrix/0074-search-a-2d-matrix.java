class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int m = matrix.length;
       int n = matrix[0].length;
       int left = 0;
       int right = (m * n) - 1;

       while(left <= right){
            int mid = (left + right)/2;
            int mid_val = matrix[mid/n][mid%n];

            if(mid_val == target){
                return true;
            } 
            else if(mid_val < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        } 
       return false;
    }
}

/* 
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[0].length - 1;

        while(i < matrix.length && j >= 0){
            if(matrix[i][j] > target){
                j--;
            }
            else if(matrix[i][j] < target){
                i++;
            }
            else{
                return true;
            }
        } 
        return false;
    }
}
*/