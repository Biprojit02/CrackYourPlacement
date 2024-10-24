class Solution {
    boolean canEat(int[] piles, int mid, int h){
        int actualCount = 0;
        for(int x : piles){
            actualCount += x/mid;

            if(x%mid != 0){
                actualCount++;
            }
        }
        return actualCount <= h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt();
        while(left < right){
            int mid = (left + right)/2;
            if(canEat(piles, mid, h)){
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }
}
