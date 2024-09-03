class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length < 3) return new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i<nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            else{
                twoSum(nums, i+1, ans, -nums[i]);
            }
        }
        return ans;
    }

    public void twoSum(int[] nums, int k, List<List<Integer>> ans, int target){
        int i = k;
        int j = nums.length - 1;
        while(i < j){
            int sum = nums[i] + nums[j];
            if(sum > target){
                j--;
            }
            else if(sum < target){
                i++;
            }
            else{
                ans.add(Arrays.asList(nums[i], nums[j], -target));

                while(i<j && nums[i] == nums[i+1]){
                    i++;
                }
                while(i<j && nums[j] == nums[j-1]){
                    j--;
                }

                i++;
                j--;
            }
        }
    }
}

/**
Step 1: Sort the Array
Before calling twoSum, the array is generally sorted (especially in 3Sum problems). So, let's sort the array first:

Sorted Array: [-4, -1, -1, 0, 1, 2]
Step 2: Initial Variables
i: Set to k, which is 0.
j: Set to nums.length - 1, which is 5.
ans: An empty list to store the results.
Step 3: Loop Through the Array
Now, we'll iterate through the array with the while loop.

First Iteration (i = 0, j = 5):

sum = nums[0] + nums[5] = -4 + 2 = -2
Since sum < target, increment i to 1.
Second Iteration (i = 1, j = 5):

sum = nums[1] + nums[5] = -1 + 2 = 1
Since sum > target, decrement j to 4.
Third Iteration (i = 1, j = 4):

sum = nums[1] + nums[4] = -1 + 1 = 0
Since sum == target, add the pair to ans:
ans.add(Arrays.asList(nums[1], nums[4], -target)) → ans = [[-1, 1, 0]].
Increment i to skip duplicates (but no duplicates in this case): i = 2.
Decrement j to skip duplicates (but no duplicates in this case): j = 3.
Fourth Iteration (i = 2, j = 3):

sum = nums[2] + nums[3] = -1 + 0 = -1
Since sum < target, increment i to 3.
Fifth Iteration (i = 3, j = 3):

The loop ends because i is no longer less than j.
Final Output
The ans list now contains one result: [[-1, 1, 0]].
**/