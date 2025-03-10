class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = (m * n) - 1;
        while(left <= right){
            int mid = (left + right)/2;
            int midValue = matrix[mid/n][mid%n];
            if(midValue > target){
                right = mid - 1;
            } 
            else if(midValue < target){
                left = mid + 1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}