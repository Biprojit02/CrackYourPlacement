class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 1;
        int arr[] = new int[n];
        int count = 0;

        while(count < n){
            if(nums[count] >= 0){
                arr[i] = nums[count];
                i = i + 2;
            }
            else{
                arr[j] = nums[count];
                j = j + 2;
            }
            count++;
        }
        return arr;
    }
}


/*
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        int a1 = 0;
        int a2 = 0;

        for(int i = 0; i<n; i++){
            if(nums[i] > 0){
                arr1[a1] = nums[i];
                a1++;
            }
            else{
                arr2[a2] = nums[i];
                a2++;
            }
        }


        for(int i = 0; i<n/2; i++){
            nums[2*i] = arr1[i];
            nums[2*i+1] = arr2[i];
        }

        return nums;
    }
}
*/