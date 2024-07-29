class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for(int i = 0; i<nums.length; i++){
            if(i != 0 && nums[i] == nums[i-1]) continue;
            for(int j = i+1; j<n; j++){
                if(j > i+1 && nums[j] == nums[j-1]) continue;
                int l = j + 1;
                int k = n - 1;
                while(l < k){
                    List<Integer> list = new ArrayList<>();
                    long sum = (long)nums[i] + nums[j];
                    sum += nums[l];
                    sum += nums[k];
                    if(sum == target){
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[l]);
                        list.add(nums[k]);
                        ans.add(list);
                        l++;
                        k--;
                        while(l < k && nums[l] == nums[l-1]){
                            l++;
                        }
                        while(l < k && nums[k] == nums[k+1]){
                            k--;
                        }
                    }
                    else if(sum > target){
                        k--;
                    }
                    else{
                        l++;
                    }
                }
            }
        }
        return ans;
    }
}
