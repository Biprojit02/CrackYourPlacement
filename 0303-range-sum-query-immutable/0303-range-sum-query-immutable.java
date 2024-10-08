class NumArray {
    int arr[];
    public NumArray(int[] nums) {
        int len = nums.length;
        arr = new int[len];
        arr[0] = nums[0];
        for(int i = 1; i<len; i++){
            arr[i] = arr[i - 1] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left == 0){
            return arr[right];
        }
        else{
            return (arr[right] - arr[left - 1]);
        }
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */